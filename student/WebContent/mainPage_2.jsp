<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<title>主页</title>
<script type="text/javascript" src="jQuery/teXiao1.js"></script>
<link rel="stylesheet" type="text/css" href="css/buJu1.css"/>
</head>
<body onLoad="show()" >


<div class="main">
			
	<div class="handler">
		<div class="home"><span id="spanTips">HOME</span><p id="userName" style="font-size:30px;top:-75px;left:250px;position:relative;"></p></div>
		<ul>
			<li><a href="game/game.html">GAME</a></li>
			<li><a href="#">HTML</a></li>
			<li><a href="#">JAVA</a></li>
			<li><a href="#">MYSQL</a></li>
		</ul>
	</div>
	
	<div class="login">
			<p><a href="login.jsp"> 》Login </a><p>
	</div>
			
	<div class="signUp">
			<p><a href="regist.jsp"> 》SignUp</a><p>
	</div>
	
	<pre><strong>As the old saying goes, </strong>
	
			where there's a will, 
			
						there's a way. </pre>
			
</div>
<div class="footer">版权&copy叶超，伟龙，翰清，伟健</div>
<input type="text" id="userFlag" value="${user.userName }" style="display:none">

</body>
</html>