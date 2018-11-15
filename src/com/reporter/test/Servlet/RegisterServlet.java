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


@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private UserService userService = new UserServiceImpl();
	
	RequestDispatcher rd = null;
	
    public RegisterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8");  
        response.setHeader("Content-Type","text/html; charset=utf-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        

//        UserDao dao = new UserDao();
//        User us = dao.find(username);
        
        User us = userService.find(username);
        
        if(us!=null){
            request.setAttribute("register", "该用户已经存在！");
//  		  	request.getRequestDispatcher("/jsp/Register.jsp").forward(request, response);
  		  	rd = request.getRequestDispatcher("/jsp/Register.jsp");
  		  	try {
				rd.forward(request, response);
			} catch (Exception e) {
			}
          }
          else{
        	  userService.AddUser(user);
//              request.getRequestDispatcher("/jsp/RegisterSuss.jsp").forward(request, response);
              rd = request.getRequestDispatcher("/jsp/RegisterSuss.jsp");
    		  	try {
  				rd.forward(request, response);
  			} catch (Exception e) {
  			}
              
              request.getSession().removeAttribute("register");
          }

	}
	}


