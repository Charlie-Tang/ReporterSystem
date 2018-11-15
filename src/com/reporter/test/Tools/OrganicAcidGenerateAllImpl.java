package com.reporter.test.Tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class OrganicAcidGenerateAllImpl implements GenerateAll {

	@Override
	public void GenerateReporter(HttpServletRequest request, HttpServletResponse response) {
		
		String path = (String) request.getSession().getAttribute("savepath");
		System.out.println(path);//查看上传文件路径是否获取到了
		
		RequestDispatcher rq =null;
		
    	//读取文件类型为有机酸时则执行
			String name1= "rangeNew.xlsx";
			String name2= "info.xlsx";
			String name3= "testR.xlsx";
			String s1= path+"/"+name1;
			String s2= path+"/"+name2;
			String s3= path+"/"+name3;
			
			
			String directoryName = path+"/"+"outdir";
	    	OrganicAcid g = new OrganicAcid();
			try {
				try {
					g.Generated(s1,s2,s3,directoryName);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			new ZipToFile();
			
			try {
				ZipToFile.unZipFiles(new File(path+"/image.zip"), path+"\\");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			request.getSession().setAttribute("directoryName", directoryName);
			
			int k1 =  directoryName.indexOf("Upload");
		    String k2 = directoryName.substring(k1);
		    
		    String k3 = "http://172.16.38.54:8080/ReportingSystemPDF/"+k2;
			
			File file = new File(directoryName); 
			
			File[] array = file.listFiles();
			
			//对生成的各个pdf插入图片生成新的PDF
			try {
				
				File f = new File(path+"/image");
				File[] array1 = f.listFiles();
				for(int i=0;i<array.length;i++)
		        {   
						
						String TemplatePDF =directoryName+"\\"+array[i].getName();//设置模板
						//保存新的pdf的路径
		            	String outfile= directoryName+"/"+array[i].getName().substring(0, array[i].getName().indexOf("."))+"-已插图片.pdf";
		            	
		    			PdfReader reader = new PdfReader(TemplatePDF);
		    			PdfStamper ps = new PdfStamper(reader, new FileOutputStream(outfile));
		    			AcroFields s = ps.getAcroFields();
		    			//图片路径
		            	String jpgpath = path+"/image/"+array1[i].getName();
		            	InsertImage.insertImage(ps,s,jpgpath);
		            	ps.close();
		    			reader.close();
		    			
		    			String k4 =array[i].getName().substring(0, array[i].getName().indexOf("."));
	                 	String content = k3+"/"+k4+"-已插图片.pdf";
	                 	QRCodeEncoderHandler handler = new QRCodeEncoderHandler(); 
	             	    handler.encoderQRCode(content, directoryName+"/"+k4+".jpg");
	             	    //将PDF模板逐个删除
	             	    new File(TemplatePDF).delete();       
		        }  
			} catch (Exception e) {
				e.printStackTrace();
			
			}
		
//		request.getRequestDispatcher("/jsp/Generatesuss.jsp").forward(request, response);
		rq = request.getRequestDispatcher("/jsp/Generatesuss.jsp");
		try {
			rq.forward(request,response);
			return;
		} catch (Exception e) {
		}
	}
	

}
