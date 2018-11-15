<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册用户</title>
<script type="text/javascript">
function check(){
	var uname = document.getElementById("uname").value;
	var upassword = document.getElementById("upassword").value;
	var upasswordtwo = document.getElementById("upasswordtwo").value;
	if(uname==""){
		alert("用户名为空！");
		return false;
	}
	if(upassword==""){
		alert("密码为空！");
		return false;
	}
	if(upasswordtwo==""){
		alert("请再次输入密码！");
		return false;
	}
	if(upassword != upasswordtwo){
		alert("两次密码不一致！");
		return false;
	}
}
if(window.top!=window){
	 window.top.location = "Login";
}
</script>
</head>
<body>
 <center>
  <h1 class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">用户注册</h1>
  <br/>
  <form action="${pageContext.request.contextPath}/RegisterServlet" method="post" onsubmit="return check()">
   <table border="0" width="400px" height="200px">
     <tr>
       <td align="center" class="text-muted">用户名:</td>
       <td align="center"><input type="text" id="uname" name="username" style="width: 250px" class="form-control"/></td>
     </tr>
     <tr>
        <td align="center" class="text-muted">密    码:</td>
        <td align="center"><input type="password" id="upassword" name="password" style="width: 250px" class="form-control"/></td>
     </tr>
     <tr>
        <td align="center" class="text-muted">确认密码:</td>
        <td align="center"><input type="password" id="upasswordtwo" name="passwordtwo" style="width: 250px" class="form-control"/></td>
     </tr>
     
     <tr>
        <td align="center" colspan="2"><input type="submit" value="提交注册" class="btn btn-primary" BACKGROUND:#FFFF00"/>
             <input type="reset" value="重置" class="btn btn-primary" BACKGROUND:#FFFF00"/></td>
     </tr>
     <tr>
     <td align="center" colspan="2"><a href="${pageContext.request.contextPath }/jsp/Login.jsp" class="btn btn-link">已经注册，直接登录</a></td>
     </tr>
     <tr>
        <td></td>
        <td><font color="red">${register}</font></td>
     </tr>
   </table>
  </form>
 </center>
</body>
</html>