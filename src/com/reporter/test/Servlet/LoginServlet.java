package com.reporter.test.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reporter.test.Entity.User;
import com.reporter.test.Service.UserService;
import com.reporter.test.Service.UserServiceImpl;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher rd =null;
    
	private UserService userService = new UserServiceImpl();
	
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8");  
        response.setHeader("Content-Type","text/html; charset=utf-8"); 
        
		String name=request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = userService.login(name, password);
		
		User user1 = userService.login1(name, password);
		
		if (null != user & null==user1)
		{
			request.getSession().setAttribute("user", name);//把用户登录名保存在Session中
//			request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
			
			rd = request.getRequestDispatcher("/jsp/index.jsp");
			try {  
			    rd.forward(request, response);  
			         return;  
			}catch(Exception e){}
		}
		else if(user == null & null!=user1)
		{
			request.getSession().setAttribute("message", "注册信息正在审核中，请发送邮件");
//			request.getRequestDispatcher("/jsp/Login.jsp").forward(request, response);
			
			rd = request.getRequestDispatcher("/jsp/Login.jsp");
			try {  
			    rd.forward(request, response);  
			         return;  
			}catch(Exception e){}
		}
		else 
		{
			request.getSession().setAttribute("message", "用户名或密码错误！");
//			request.getRequestDispatcher("/jsp/Login.jsp").forward(request, response);
			
			rd = request.getRequestDispatcher("/jsp/Login.jsp");
			try {  
			    rd.forward(request, response);  
			         return;  
			}catch(Exception e){}
		}
		
		
//		doGet(request, response);
	}
}


