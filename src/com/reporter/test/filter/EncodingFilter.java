package com.reporter.test.filter;
 
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class EncodingFilter implements Filter {
 
	 private String encoding;  
	 public EncodingFilter() {  
		 
	 }  
	 public void destroy() {  

	 }  
	 public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {  

		 request.setCharacterEncoding(encoding);  
	      //fc.getServletContext().log("你的编码为UTF-8");  
	      chain.doFilter(request, response);  
	 }  
	 public void init(FilterConfig fConfig) throws ServletException {  

		 encoding=fConfig.getInitParameter("encoding");  
	     //this.fc=fConfig;  
	 }  
 
}