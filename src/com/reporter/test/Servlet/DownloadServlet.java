package com.reporter.test.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reporter.test.Tools.DownloadMethod;


@WebServlet("/DownloadServlet")
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	
    public DownloadServlet() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
    	new DownloadMethod(request,response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
