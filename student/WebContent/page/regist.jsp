<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<title>用户注册</title>
<script type="text/javascript" src="jQuery/teXiao3.js"></script>
<link rel="stylesheet" type="text/css" href="css/buJu3.css"/>
</head>
<body onLoad="show3()">
<!--<% String flag=(String)request.getAttribute("f"); %>-->
<div class="main">
		<!--导航栏-->	
	<div class="handler">
		<div class="home"><a href="mainPage_2.jsp" style="text-decoration:none;color:white">HOME</a></div>
		<ul>
			<li><a href="#">JQuery</a></li>
			<li><a href="#">HTML</a></li>
			<li><a href="#">JAVA</a></li>
			<li><a href="#">MYSQL</a></li>
		</ul>
	</div>
		<!--注册框-->
		<div class="signUpKuang" style="color:white">
		<div class="signUpHeader"><p><strong>signUp</strong>.now</p></div>
		<!--表单位置-->
		<form action="signUpServlet" method="post">
		<!--姓名-->
		<div class="input"><div class="input_Logo"><img src="image/name.jpg"></div>
		<input id="name"type="text" style="height:90%;font-size:20px;" placeholder="UserName" name="userName">
		</div>
		<!--密码-->
		<div class="input" style="margin-top:15px"><div class="input_Logo">
		<img src="image/password.jpg"></div>
		<input id="password" type="password" style="height:90%;font-size:20px" placeholder="PassWord" name="userPass">
		</div>
		<!--再密码-->
		<div class="input" style="margin-top:15px"><div class="input_Logo">
		<img src="image/password.jpg"></div>
		<input id="passwordAngin" type="password" style="height:90%;font-size:20px" placeholder="PassWordAngin" >
		</div>
		<!--邮箱-->
		<div class="input" style="margin-top:15px"><div class="input_Logo">
		<img src="image/email.jpg"></div>
		<input id="email" type="email" style="height:90%;font-size:20px" placeholder="E-mail" name="email">
		</div>
		<!--性别-->
		<input id="sexs"type="radio" style="margin-top:25px" value="男" name="sex">男
		<input id="sexs"type="radio" style="margin-top:25px" value="女" name="sex">女
		<!--年龄-->
		<br/>
		<input id="ages"type="range" style="height:90%;font-size:20px;margin-top:15px;margin-left:20px"  name="age">年龄
	
		<!--信息提示框：现在不可见-->
		<p id = "tips" style="color:orange;margin-left:30px"></p>
		<input  id="submits" type="submit" value="signUp" style="margin-top:10px;width:180px;height:50px;margin-left:3%;font-size:2em;color:gray" >
		<a href="login_2.jsp" >Login</a>
		</form>
	</div>
	
	
	
	
	
</div>
<div class="footer">版权&copy叶超，伟龙，翰清，伟健  <p>${f }</p></div>

<!--jquery与后台的传参媒介-->  
<input type="text" id="signUpFlag" value="${f }" >
</body>
</html>