<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<script src="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>报告系统</title>
<script type="text/javascript">
function check(){
	var uname = document.getElementById("uname").value;
	var upassword = document.getElementById("upassword").value;
	if(uname==""){
		alert("用户名为空！");
		return false;
	}
	if(upassword==""){
		alert("密码为空！");
		return false;
	}
}
if(window.top!=window){
	 window.top.location = "Login";
}
</script>
</head>
<body>
<body style="background:000000">
  <center>
     <h1 class="text-info" style="font-family:宋体;font-weight:bold;font-size:49px">用户登录</h1>
     <br/>
     <form action="${pageContext.request.contextPath}/LoginServlet" method="post" onsubmit="return check()">
        <table border="0" width="400px" height="200px">
           <tr >
             <td align="center" class="text-muted">用户名:</td>
             <td align="center"><input type="text" id="uname" name="username" style="width: 250px" class="form-control"/></td>
           </tr>
           <tr >
             <td align="center" class="text-muted">密    码:</td>
             <td align="center"><input type="password" id="upassword" name="password" style="width: 250px" class="form-control"/></td>
           </tr>
           <tr >
             <td align="center" colspan="2"><input type="submit" value="登录" class="btn btn-primary" BACKGROUND:#FFFF00"/>
             <input type="reset" value="重置" class="btn btn-primary" BACKGROUND:#FFFF00"/></td>
           </tr>
           <tr>
           <td align="center" colspan="2"><a href="${pageContext.request.contextPath }/jsp/Register.jsp"  class="btn btn-link">尚未注册，注册用户</a></td>
           </tr>
           <tr>
             <font color="red">${message}</font>
           </tr>
        </table>
     </form>
  </center>
</body>
</html>