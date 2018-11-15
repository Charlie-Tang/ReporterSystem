<%@page import="com.itextpdf.text.Document"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- 由于FileUpload包是不支持表单上传时Form中的数据被读取到的，所以写这个选择页来传递值 -->
<title>选择生成报告类型</title>
</head>
<body>
</br>
<br>
<br>
 <form  name="myform" action="${pageContext.request.contextPath}/ChooseTypeServlet"  method="post" >
<table align="center" width="400px" height="200px" border="0"> 
<td align="left"><class="text-muted" >生成报告类型为：</td></class> <td><select style="width:150px" class="form-control"  name="type">  
			<option value="有机酸">有机酸</option>
			<option value="元素(成年)" >元素(成年)</option>   
			<option value="元素(未成年)" >元素(未成年)</option> 
			<option value="激素" >激素</option> 
<!-- 			<option value="蛋白质" >蛋白质</option>    -->
<!-- 			<option value="核苷酸">核苷酸</option>   -->
			</select> </td> 
 <tr><td colspan="2" align="center"><input  type="submit" value="提交" class="btn btn-primary"  BACKGROUND:#FFFF00"> 
 				<input type="reset" value="清空" class="btn btn-primary" BACKGROUND:#FFFF00"></td></tr>
</table>


</body>
</html>