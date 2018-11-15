package com.reporter.test.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reporter.test.Tools.FileToZip;


@WebServlet("/GeneratesussServlet")
public class GeneratesussServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GeneratesussServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FileToZip f  = new FileToZip();
		f.ZipGenerate(request,response);
		

	}


}
