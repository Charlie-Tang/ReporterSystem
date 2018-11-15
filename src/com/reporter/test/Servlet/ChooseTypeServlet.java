package com.reporter.test.Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChooseTypeServlet
 */
@WebServlet("/ChooseTypeServlet")
public class ChooseTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	RequestDispatcher rd =null;
	
    public ChooseTypeServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8"); 
		 
		String type = request.getParameter("type");
		System.out.println(type);
		request.getSession().setAttribute("type", type);
		
		if(request.getSession().getAttribute("type").equals("有机酸"))
		{
			rd =request.getRequestDispatcher("/jsp/upload.jsp");
			try {  
			    rd.forward(request, response);  
			         return;  
			}catch(Exception e){}
		}
	     else if ((request.getSession().getAttribute("type").equals("元素(成年)"))) {
	    	 
//	    	 request.getRequestDispatcher("/jsp/upload2.jsp").forward(request, response);
	    	 
	    	 rd =request.getRequestDispatcher("/jsp/upload2.jsp");
				try {  
				    rd.forward(request, response);  
				         return;  
				}catch(Exception e){}
		}
	     else if ((request.getSession().getAttribute("type").equals("元素(未成年)"))) {
	    	 
//	    	 request.getRequestDispatcher("/jsp/upload2.jsp").forward(request, response);
	    	 
	    	 rd =request.getRequestDispatcher("/jsp/upload2.jsp");
				try {  
				    rd.forward(request, response);  
				         return;  
				}catch(Exception e){}
		}
	     else if ((request.getSession().getAttribute("type").equals("激素"))) {
	    	 
//	    	 request.getRequestDispatcher("/upload3.jsp").forward(request, response);
	    	 rd =request.getRequestDispatcher("/jsp/upload3.jsp");
				try {  
				    rd.forward(request, response);  
				         return;  
				}catch(Exception e){}
		}
	
	}

}
