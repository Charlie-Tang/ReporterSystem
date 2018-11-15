package com.reporter.test.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reporter.test.Tools.ElementAdultGenerateAllImpl;
import com.reporter.test.Tools.ElementTeenegerGenerateAllImpl;
import com.reporter.test.Tools.GenerateAll;
import com.reporter.test.Tools.OrganicAcidGenerateAllImpl;

/**
 * Servlet implementation class GenerateServlet
 */
@WebServlet("/GenerateServlet")
public class GenerateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GenerateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 GenerateAll g = null;
//		new GenerateAll(request, response);
		if(request.getSession().getAttribute("type").equals("有机酸"))
		{	
			g = new OrganicAcidGenerateAllImpl();
			g.GenerateReporter(request, response);
		}
		
		if(request.getSession().getAttribute("type").equals("元素(成年)"))
		{
			g = new ElementAdultGenerateAllImpl();
			g.GenerateReporter(request, response);
		}
		
		if(request.getSession().getAttribute("type").equals("元素(未成年)"))
		{
			g = new ElementTeenegerGenerateAllImpl();
			g.GenerateReporter(request, response);
		}
		
	}

}
