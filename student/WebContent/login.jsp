<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<title>用户登陆</title>
<script type="text/javascript" src="jQuery/teXiao2.js"></script>
<link rel="stylesheet" type="text/css" href="css/buJu2.css"/>

</head>
<body onLoad="show2()">

<div class="main">
	<div class="handler">
		<div class="home"><a href="mainPage_2.jsp" style="text-decoration:none;color:white">HOME</a></div>
			<ul>
			<li><a href="#">JQuery</a></li>
			<li><a href="#">HTML</a></li>
			<li><a href="#">JAVA</a></li>
			<li><a href="#">MYSQL</a></li>
			</ul>
	
		</div>
	
	<div class="loginKuang">
		<div class="loginHeader"><p><strong>Login</strong>.now</p></div>

		<!--表单-->
		<form action="<c:url value='/LoginServlet'/> " method="post">
		<!--姓名-->
		<div class="input"><div class="input_Logo"><img src="image/name.jpg"></div>
		<input id="name"type="text" style="height:95%;font-size:20px;" placeholder="UserName" name="userName" required>
		</div>
		<!--密码-->
		<div class="input" style="margin-top:15px"><div class="input_Logo">
		<img src="image/password.jpg"></div>
		<input id="password" type="password" style="height:95%;font-size:20px" placeholder="PassWord" name="userPass" required>
		<p style="color: red; font-weight: 900">${msg }</p>
		</div>
		
		
		
		<p id = "tips" style="color:orange;margin-left:30px"></p>
		<input type="submit" value="Login" style="margin-top:20px;width:180px;height:50px;margin-left:10px;font-size:2em;color:gray" >
		<a href="regist.jsp">signUp</a>
		</form>
	</div>
	
	
</div>
<div class="footer">版权&copy叶超，伟龙，翰清，伟健</div>
<input type="text" id="errorFlag" value="{msg }" style="display:none">
</body>
</html>