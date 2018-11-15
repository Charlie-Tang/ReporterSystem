package com.reporter.test.Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reporter.test.Entity.FileUploadDownload;
import com.reporter.test.Service.FileService;
import com.reporter.test.Service.FileServiceImpl;


/**
 * Servlet implementation class ListFileServlet
 */
@WebServlet("/ListFileServlet")
public class ListFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private FileService fileService = new FileServiceImpl();
	
	RequestDispatcher rd = null;
	
    public ListFileServlet() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//查询显示所有的数据到页面
		String username = (String) request.getSession().getAttribute("user");
		List<FileUploadDownload> list= fileService.list(username);
		
		request.setAttribute("list", list);//保留查询结果
//		request.getRequestDispatcher("/jsp/listFile.jsp").forward(request, response);
		rd = request.getRequestDispatcher("/jsp/listFile.jsp");
		try {
			rd.forward(request,response);
			return;
		} catch (Exception e) {
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
