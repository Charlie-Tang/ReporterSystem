package com.reporter.test.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.reporter.test.Entity.FileUploadDownload;

/*
 * 上传文件的工具类
 */
/*
 * 上传文件的工具类
 */
public class WebUtils {
 
	public static FileUploadDownload doFileUpload(HttpServletRequest request,HttpServletResponse response) throws FileSizeLimitExceededException {
		
		FileUploadDownload fud = new FileUploadDownload();// 文件信息对象
 
		try {
			DiskFileItemFactory factory = new DiskFileItemFactory();
			// 临时文件夹temp
			factory.setRepository(new File(request.getSession().getServletContext().getContextPath()+"/temp"));
//			factory.setRepository(new File("/temp"));// 临时文件夹temp
			factory.setSizeThreshold(1024 * 1024 * 50);// 临时缓冲区大小为40M
 
			ServletFileUpload parse = new ServletFileUpload(factory);// 解析器
			//上传文件大小
			parse.setFileSizeMax(1024 * 1024 * 50);// 单个文件大小限制为40M
			parse.setSizeMax(1024 * 1024 * 100);// 总的文件大小限制为100M
			//解决中文文件名的乱码
			parse.setHeaderEncoding("utf-8");
			List<FileItem> list = parse.parseRequest(request);
			for (FileItem fileItem : list) {
				// 普通表单
				if (fileItem.isFormField()) {
					String fieldName = fileItem.getFieldName();
					// String value = fileItem.getString();
					String value = fileItem.getString("utf-8");// 解决字段的中文乱码问题
					System.out.println("fieldName:" + fieldName);
					System.out.println("value:" + value);
					// 将当前字段封装到fud对象中对应的字段中去
					
					//普通字段都通过这个保存到fud中
					BeanUtils.setProperty(fud, fieldName, value);
				}
				// 文件
				else {
					String filename = fileItem.getName();// 获取文件名
				
					//文件名：aa.txt 与c:\a\b\c\aa.txt的处理 统一
					int index=filename.lastIndexOf("\\");
					if(index!=-1){
						filename=filename.substring(index+1);
					}
					String username=(String) request.getSession().getAttribute("user");
 
//					String realPath=request.getSession().getServletContext().getRealPath("/Upload");
					String realPath = "E:\\apache-tomcat-9.0.10\\apache-tomcat-9.0.10\\wtpwebapps\\ReportingSystemPDF\\Upload"; 
					//文件类型
					String filetype = (String) request.getSession().getAttribute("type");
					
					//生成唯一的文件名
					String uuidname=generateUUIDName(filename);
					
					//生成随机文件夹
					String savePath=generateSavePath(realPath,username,filetype);
					
					request.getSession().setAttribute("savepath",savePath);//把savepath放在一个session域中
					
					// 上传文件
					InputStream in = fileItem.getInputStream();// 获取文件读取流
 
//					OutputStream out = new FileOutputStream("d:/" + name);
					//保存文件夹：savePath  唯一文件名：uuidname
					OutputStream out = new FileOutputStream(new File(savePath,filename));
					
 
					byte[] buf = new byte[1024];
					int len = 0;
					while ((len = in.read(buf)) != -1) {
						out.write(buf, 0, len);
					}
					in.close();
					out.close();
					//删除临时文件
					fileItem.delete();
					fud.setFilename(filename);//文件名
					fud.setUuidname(uuidname);//唯一文件名
					fud.setSavepath(savePath);//保存路径
					fud.setUsername(username);
					fud.setId(UUID.randomUUID().toString());//id
				}
			}
			return fud;//返回文件信息封装对象
 
		} catch (FileUploadBase.FileSizeLimitExceededException e) {
			throw e;//记得抛出异常要在方法中进行声明
		}
		catch(Exception e){
			throw new RuntimeException(e);//抛出运行时异常
		}
	}
 
		//生成唯一的文件名
		private static String generateUUIDName(String filename) {
			return UUID.randomUUID().toString()+"_"+filename;
		}
		//生成随机文件夹
		private static String generateSavePath(String realPath, String username,String filetype) {
	 

			//将一级目录名设置为上传者姓名
			String first = username;
			
			//二级目录为上传文件的种类,这里需要做个接口
			String second=filetype;
			
			//将三级目录名设置为当前日期
			Date data = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			String third = sdf.format(data);
			
			String savePath=realPath+"/"+first+"/"+second+"/"+third;
			File f=new File(savePath);
			if(!f.exists()){
				f.mkdirs();//创建多级目录
			}
			return savePath;//保存路径
		}
	}