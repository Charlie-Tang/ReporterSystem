<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PDf下载</title>
</head>
<body>

 <h1 align="center" class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">PDF文件已生成</h1>

 <form action="${pageContext.request.contextPath }/GeneratesussServlet" method="post">
 
<div align="center"><input type ="submit" value="下载PDF文件" class="btn btn-primary" BACKGROUND:#FFFF00"></a><br/></div>

</body>
</html>