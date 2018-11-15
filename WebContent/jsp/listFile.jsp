<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ page import="com.reporter.test.Dao.*,com.reporter.test.Entity.FileUploadDownload,com.reporter.test.Service.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
  <head>
  </head>
  <body>
  <br>
  <br>
  <br>
  <br>
  <br>

<table align="center" border="1" >
<tr>
<th>文件id</th><th>上传文件名</th><th>上传时间</th><th>文件位置</th><th>文件描述</th><th>上传者</th><th>下载</th>
</tr>
<c:forEach var="file" items="${list}">
<tr>
<td>${file.id }</td>
<td>${file.filename }</td>
<td>${file.uploadtime }</td>
<td>${file.savepath }</td>
<td>${file.description }</td>
<td>${file.username }</td>

<td><font color="red"><a href="${pageContext.request.contextPath}/DownloadServlet">下载</a></font></td>
</tr>
</c:forEach>
</table>


  </body>
</html>
