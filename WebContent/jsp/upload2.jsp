<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<html>
  <head>
	<title>文件上传界面</title>
	<script type="text/javascript">
function check(){
	var filename1 = document.getElementById("filename1").value;
	var filename2 = document.getElementById("filename2").value;
	var filename3 = document.getElementById("filename3").value;
// 	如果不是三个文件夹同时上传则报错
	if(filename1=="" ||filename2=="" ||filename3=="")
		
	{
		alert("请选择文件上传");
		return false;
	}
	
}
</script>

  </head>
  
  <body>
 <h1 align="center" class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px"> 上传元素报告相关文件</h1>

<!-- style="border-collapse:separate; border-spacing:0px 10px; -->
 <form  name="myform" action="${pageContext.request.contextPath}/UploadServlet" enctype="multipart/form-data" method="post" onsubmit="return check()">
 <table align="center" width="400px" height="400px" border="0">
 <tr>
  <td colspan="2"><font color ="red">*</font><b class="text-muted">请上传带config属性表格，并命名为conf.xlsx</b></td>
 </tr>
 <tr>
 <td class="text-muted" align="center">上传文件为：</td><td><input type="file" name="filename" id="filename1"  class="form-control"></td>
 </tr>
 
  <tr>
  <td colspan="2"><font color ="red">*</font><b class="text-muted">请上传带info属性表格,并命名为info.xlsx</b></td>
 </tr>
 <tr>
 <td class="text-muted" align="center">上传文件为：</td><td><input type="file" name="filename" id="filename2"  class="form-control"></td>
 </tr>
 
  <tr>
  <td colspan="2"><font color ="red">*</font><b class="text-muted">请上传带exp属性表格,并命名为exp.xlsx</b></td>
 </tr>
 <tr>
 <td class="text-muted" align="center">上传文件为：</td><td><input type="file" name="filename" id="filename3"  class="form-control"></td>
 </tr>
 
 
 
  
  </form>
  
  <tr>
 <td colspan="2" align="center"><input  type="submit" value="上传" class="btn btn-primary" BACKGROUND:#FFFF00"> 
 				<input type="reset" value="清空" class="btn btn-primary" BACKGROUND:#FFFF00"></td>
 </tr>
 
 </script>
 </table>
 </form>
 
  </body>
</html>
