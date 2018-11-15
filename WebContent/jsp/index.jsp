<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
<title>用户选择</title>
  </head>
  <body>
	<div align="center">
	  	<h1 class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">选择操作</h1>
	
		<tr>  <a  href="${pageContext.request.contextPath }/jsp/ChooseType.jsp" class="btn btn-link">上传文件</a><br/>
		<tr>	<a   href="${pageContext.request.contextPath }/ListFileServlet" class="btn btn-link">查询文件</a><br/>
	</div>
      
    
  </body>
</html>
