package com.reporter.test.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reporter.test.Entity.Administrator;
import com.reporter.test.Service.AdministratorService;
import com.reporter.test.Service.AdministratorServiceImpl;



@WebServlet("/AdministratorServlet")
public class AdministratorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private AdministratorService administratorService = new AdministratorServiceImpl();
	
    public AdministratorServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		UserDao dao=new UserDao();
//		List<User> list=dao.list();
//		request.getSession().setAttribute("userlist",list);
		
		request.setCharacterEncoding("utf-8");  
        response.setCharacterEncoding("utf-8");  
        response.setHeader("Content-Type","text/html; charset=utf-8"); 
        
		String name=request.getParameter("username");
		String password = request.getParameter("password");
		
		Administrator administrator = administratorService.login(name, password);
		if (null != administrator)
		{
			request.getSession().setAttribute("user", name);
			request.getRequestDispatcher("/jsp/file.jsp").forward(request, response);
		}else
		{
			request.getSession().setAttribute("message", "管理员信息错误！");
			request.getRequestDispatcher("/jsp/administrator.jsp").forward(request, response);//重定向回本页面
		}
		
		
	}

}
