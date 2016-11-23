<%@page contentType="text/html"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>仲园后勤服务平台</title>
		<script type="text/javascript" src="..js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="..js/bootstrap.js"></script>
		<script type="text/javascript" src="..js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="..css/bootstrap.css" />
		<link rel="stylesheet" href="..css/bootstrap.min.css" />
	</head>

	<body style="background: url(img/background/17.jpg);background-repeat:no-repeat;background-size: cover;-webkit-background-size: cover;">

		<div class=" nav navbar-default navbar-fixed-top" style="background-color: RGB(255,255,240);">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu">
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>

			<br />
			<div class="collapse navbar-collapse" id="menu">
				<ul class="nav nav-pills navbar-left ">

					<li>
						<a href="home.html"><img src="img/ico/home.ico">首&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;页</a>
					</li>

					<li>
						<a href="login.html"><img src="img/ico/login.ico">用户登录</a>
					</li>
					<li>
						<a href="changePwd.html"><img src="img/ico/lock.ico">修改密码</a>
					</li>
					<li>
						<a href="history.html"><img src="img/ico/history.ico">服务记录</a>
					</li>
				</ul>
			</div>
			</div <br /><br /><br /><br />>

			<div style="border-top: 1px solid black;">
				<br /><br />
				<div class="container">
				<p>验证成功!请完成密码重置</p>								
				<form role="form" size="15">					
						<div class="form-group">
							<label for="newPwd" class="control-label">新密码：</label>
							<input type="password" class="form-control" id="newPwd" name="newPwd" placeholder="请输入新密码">
						</div>
						<div class="form-group ">
							<label for="newPwd" class="control-label">确认密码：</label>
							<input type="password" class="form-control" id="newPwd" name="newPwd" placeholder="请再次输入新密码">
						</div>
						<input type="button" class="btn btn-default" value="提交">
						<input type="button" class="btn btn-default" value="取消">
						<br /><br /><br /><br />
					</form>
				</div>			
			</div>

	</body>

</html>