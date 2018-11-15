<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
<head>
<meta charset="ISO-8859-1">
<title>选择生成界面</title>
</head>
<body>
<!-- 通过form表单调用 -->
	 <form action="${pageContext.request.contextPath}/GenerateServlet" method="post">
	 
	<h1 align="center" class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">选择生成您的PDF文件</h1>
	
	<br>
	<br>
	<br>
	<div align="center"><input  type="submit" value="生成PDF"  class="btn btn-primary" BACKGROUND:#FFFF00"></div> 
	
	</form>
	<br>
	<br>
	<br>

	
	
</body>
</html>