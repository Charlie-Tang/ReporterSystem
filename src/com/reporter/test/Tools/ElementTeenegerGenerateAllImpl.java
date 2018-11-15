package com.reporter.test.Tools;

import java.io.File;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.DocumentException;

public class ElementTeenegerGenerateAllImpl implements GenerateAll {

	@Override
	public void GenerateReporter(HttpServletRequest request, HttpServletResponse response) {
		
		String path = (String) request.getSession().getAttribute("savepath");
		System.out.println(path);//查看上传文件路径是否获取到了
		
		RequestDispatcher rq =null;
		
		//读取文件类型为元素(未成年)时则执行
			String name1 ="conf.xlsx";
			String name2= "info.xlsx";
			String name3= "exp.xlsx";
			String s1= path+"/"+name1;
			String s2= path+"/"+name2;
			String s3= path+"/"+name3;
			String directoryName = path+"/"+"outdir";
			Element g = new Element();
			try {
				g.Generated(s1,s2,s3,directoryName);
			} catch (DocumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
			request.getSession().setAttribute("directoryName", directoryName);
			int k1 =  directoryName.indexOf("Upload");
//			String ss = (String) request.getSession().getAttribute("user");
//			int k1 = directoryName.indexOf(ss);
		    String k2 = directoryName.substring(k1);
		    System.out.println(k2);
			String k3 = "http://172.16.38.54:8080/ReportingSystemPDF/"+k2;
				
			File file = new File(directoryName);
			File[] array = file.listFiles();
			
			for(int i=0;i<array.length;i++)
			{
				String k4 =array[i].getName().substring(0, array[i].getName().indexOf("."));
             	String content = k3+"/"+k4+".pdf";
             	QRCodeEncoderHandler handler = new QRCodeEncoderHandler(); 
         	    handler.encoderQRCode(content, directoryName+"/"+k4+".jpg");
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
