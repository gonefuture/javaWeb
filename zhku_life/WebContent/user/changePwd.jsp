<%@page contentType="text/html"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE >
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1 maximum-scale=1 user-scalable=no">
		<title>仲园后勤服务平台</title>
		<script type="text/javascript" src="..js/jquery-1.11.0.min.js" charset="utf-8"></script>
		<script type="text/javascript" src="..js/bootstrap.min.js"></script>
		<script type="text/javascript" src="..js/bootstrap.js"></script>
		<script type="text/javascript" src="..js/valid.js" ></script>
		<link rel="stylesheet" href="..css/bootstrap.min.css" />
		<link rel="stylesheet" href="..css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="..css/normalize.css" />
	</head>

	<body style="background: url(img/background/bg.jpg);background-repeat:no-repeat;background-size: cover;-webkit-background-size: cover;background-attachment: fixed;">
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
					<li class="in active">
						<a href="changePwd.html"><img src="img/ico/lock.ico">修改密码</a>
					</li>
					<li>
						<a href="history.html"><img src="img/ico/history.ico">服务记录</a>
					</li>
				</ul>
			</div>
		</div>
		<br /><br /><br /><br /><br /><br />
		<div class="container">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2">
						<form role="form" id="defaultForm" method="post" class="form-horizontal">
							<div class="form-group">
								<label for="account" class="control-label col-sm-3">当前密码:</label>
								<div class="col-sm-5">
									<input type="password" class="form-control" id="nowPwd"  placeholder="请输入当前密码"onblur="return checkNowPwd()">
									<span class="check text-danger" id="checkNowPwd"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="account" class="control-label col-sm-3">新密码:</label>
								<div class="col-sm-5">
									<input type="password" class="form-control" id="pwd" placeholder="请输入新密码" onblur="return checkPwd()">
									<span class="check text-danger" id="checkPwd"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="account" class="control-label col-sm-3">确认密码:</label>
								<div class="col-sm-5">
									<input type="password" class="form-control" id="confirmPwd" placeholder="请再次输入密码" onblur="return checkConfirmPwd()">
									<span class="check text-danger" id="checkConfirmPwd"></span>
								</div>
							</div>
							<br />
							<div class="col-sm-offset-4">
								<input type="button" class="btn btn-default" value="提交" onclick="return changePwdTotalCheck()">
								<a href="home.html">
									<input type="button" class="btn btn-default" value="取消">
								</a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>