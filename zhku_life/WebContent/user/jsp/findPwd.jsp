<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE >
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1 maximum-scale=1 user-scalable=no">
		<title>仲园后勤服务平台</title>
		<script type="text/javascript" src="..js/jquery-1.11.0.min.js" charset="utf-8"></script>
		<script type="text/javascript" src="..js/bootstrap.min.js"></script>
		<script type="text/javascript" src="..js/bootstrap.js"></script>
		<link rel="stylesheet" href="..css/bootstrap.min.css" />
		<link rel="stylesheet" href="..css/bootstrap.css" />
		<link rel="stylesheet" type="text/css" href="..css/normalize.css" />
	</head>

	<body style="background: url(img/background/17.jpg);background-repeat:no-repeat;background-size: cover;-webkit-background-size: cover;background-attachment: fixed;">
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
		</div>

		<br /><br /><br /><br />
		<div style="border-top: 1px solid black;">
			<ul class="nav nav-tabs nav-pills nav-tabs-justified container">
				<li>
					<a href="#tab1" data-toggle="tab">
						<h4>&nbsp;&nbsp;&nbsp;注&nbsp;&nbsp;册&nbsp;&nbsp;&nbsp;</h4></a>
				</li>
				<li >
					<a href="#tab2" data-toggle="tab">
						<h4>修改密码</h4></a>
				</li >
				<li class="active">
					<a href="#tab3" data-toggle="tab">
						<h4>找回密码</h4></a>
				</li>
			</ul>
			<br />

			<div class="tab-content active">
				<div id="tab1" class="container tab-pane fade ">
					<br />
					<form role="form" size="15">
						<div class="form-group">
							<label for="name" class="control-label">账号</label>
							<input type="text" class="form-control" id="account" name="account" placeholder="请输入账号">
						</div>
						<div class="form-group">
							<label for="name" class="control-label">姓名：</label>
							<input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名">
						</div>

						<div class="form-group">
							<label for="pwd" class="control-label">密码：</label>
							<input type="password" class="form-control" id="pwd" name="pwd" placeholder="请输入密码">
						</div>
						<div class="form-group ">
							<label for="pwd" class="control-label">确认密码：</label>

							<input type="password" class="form-control" id="pwd" name="pwd" placeholder="请再次输入密码">
						</div>
						<div class="form-group">
							<label for="mail" class="control-label">邮箱：</label>
							<input type="text" class="form-control" id="mail" name="mail" placeholder="请输入邮箱">
						</div>

						<form role="form">
							<div class="form-group" id="campus">
								<label for="campus" class="control-label">校区</label>
								<select class="form-control">
									<option>海珠校区</option>
									<option>白云校区</option>
								</select>
							</div>
							<div class="form-group" id="buliding">
								<label for="campus" class="control-label">宿舍楼</label>
								<select class="form-control">
									<option>南区A</option>
									<option>南区B</option>
									<option>南区C</option>
									<option>南区F1</option>
									<option>南区F2</option>
									<option>北区6</option>
									<option>北区7</option>
									<option>北区8</option>
									<option>北区8</option>
									<option>北区8</option>
									<option>北区8</option>
									<option>北区8</option>
									<option>北区8</option>
								</select>
							</div>
							<div class="form-group" id="room">
								<label for="campus" class="control-label">房间</label>
								<select class="form-control">
									<option>101</option>
									<option>102</option>
									<option>103</option>
									<option>104</option>
									<option>105</option>
									<option>105</option>
									<option>106</option>
									<option>107</option>
									<option>108</option>
									<option>109</option>
									<option>110</option>
									<option>111</option>
									<option>112</option>
									<option>113</option>
								</select>
							</div>
							</from>
							<input type="button" class="btn btn-default" value="提交">
							<input type="button" class="btn btn-default" value="取消">
							<br /><br /><br /><br />
						</form>
				</div>
				<div id="tab2" class="container tab-pane fade ">
					<br />
					<form role="form" size="15">
						<div class="form-group">
							<label for="pwd" class="control-label">当前密码：</label>
							<input type="password" class="form-control" id="nowPwd" name="nowPwd" placeholder="请输入当前密码">
						</div>
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
				<div id="tab3" class="container tab-pane fade in active">
					<div class="form-group ">
						<label for="name" class="control-label">账号</label>
						<input type="text" class="form-control" id="account" name="account" placeholder="请输入账号"/>
					</div>
					<p>向预留的邮箱发送验证码？</p>
					<button class="btn-info">发送验证码</button>
					</br>
					</br>
					</br>
					<div class="form-group ">
						<label for="verifyCode" class="control-label">请输入验证码：</label>
						<input type="text" class="form-control" id="verifyCode" name="verifyCode" placeholder="请输入验证码">
						</br>
						<input type="button" class="btn btn-default" value="提交">
					</div>
				</div>
			</div>
		</div>
	</body>

</html>>