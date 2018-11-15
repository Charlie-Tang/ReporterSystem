package com.reporter.test.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reporter.test.Service.UserService;
import com.reporter.test.Service.UserServiceImpl;


/**
 * Servlet implementation class ManagementServlet
 */
@WebServlet("/ManagementServlet")
public class ManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserService userService = new UserServiceImpl();
	
	
    public ManagementServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username =request.getParameter("username");
		System.out.println(username);
		userService.updateinfo(username);
		
		doGet(request, response);
	}

}
