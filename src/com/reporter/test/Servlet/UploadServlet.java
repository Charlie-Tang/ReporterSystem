package com.reporter.test.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileUploadBase.FileSizeLimitExceededException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.reporter.test.Entity.FileUploadDownload;
import com.reporter.test.Service.FileService;
import com.reporter.test.Service.FileServiceImpl;
import com.reporter.test.utils.WebUtils;


@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//调用实现类
	private FileService fileService = new FileServiceImpl();
	
	RequestDispatcher rq = null;
	
    public UploadServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (!ServletFileUpload.isMultipartContent(request)) {
			request.setAttribute("message", "不是请求的信息表单，请确认表单属性是否正确");
			request.getRequestDispatcher("/jsp/message.jsp").forward(request,
					response);
            return;
		}
		try {
	    
	    	//处理中文
			//调用工具类，获得上传文件信息
			FileUploadDownload fud= WebUtils.doFileUpload(request,response);
			fileService.insert(fud);//保存上传文件信息
			
			rq = request.getRequestDispatcher("/jsp/generate.jsp");
			try {
				rq.forward(request,response);
				return;
			} catch (Exception e) {
			}
			
				
		} catch (FileSizeLimitExceededException e) {
			
			
			request.setAttribute("message", "对不起，您上传的文件大小超过了大小的限制");
			request.getRequestDispatcher("/jsp/message.jsp").forward(request,response);
		}
		
	}

}
