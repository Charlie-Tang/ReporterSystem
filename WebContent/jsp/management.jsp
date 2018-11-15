<%@page import="com.reporter.test.Service.UserServiceImpl"%>
<%@page import="com.reporter.test.Service.UserService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page import="com.reporter.test.Service.UserService,com.reporter.test.Entity.User,com.reporter.test.Service.UserServiceImpl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息管理</title>
</head>

<%
		
		UserService userService = new UserServiceImpl();
		List<User> list=  userService.list();
		request.getSession().setAttribute("userlist",list);
%>
	<body>
		<table  align="center" border="1">
		<tr>
		<th>id</th>
		<th>name</th>
		<th>password</th>
		</tr>
		
		<c:forEach  var="user" items="${userlist }">
		<tr>
		<th>${user.id }</th> 
		<th>${user.name }</th>
		<th>${user.password }</th>
		</tr>
		</c:forEach>
		
		</table>
		</br>
		</br>
		</br>
		
		
		
		 <form action="${pageContext.request.contextPath}/ManagementServlet" method="post" >
		<table align="center" border="1">
		 <tr >
             <td align="center" class="text-muted">修改者用户名为：</td>
             <td align="center"><input type="text"  name="username" style="width: 250px" class="form-control"/></td>
           </tr>
           <tr >
             <td align="center" colspan="2"><input type="submit" value="修改" class="btn btn-primary" BACKGROUND:#FFFF00"/>
             <input type="reset" value="重置" class="btn btn-primary" BACKGROUND:#FFFF00"/></td>
          </tr>
         </table> 
	</body>
</html>