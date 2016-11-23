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
		<script type="text/javascript" src="..js/valid.js"></script>
		<link rel="stylesheet" href="..css/bootstrap.min.css" />
		<link rel="stylesheet" href="..css/bootstrap.css" />
	</head>

	<body style="background: url(img/background/bg.jpg);background-repeat:no-repeat;background-size: cover;-webkit-background-size: cover;background-attachment: fixed;">
		<br />
		<div class="container">
			<div class="container">
				<div class="row">
					<center>
						<h3 class="col-sm-9 col-sm-offset-1">注册</h3>
					</center>
					<div class="col-sm-8 col-sm-offset-2">
						<form role="form" id="defaultForm" method="post" class="form-horizontal">
							
							<div class="form-group">
								<label for="account" class="control-label col-sm-3">账号:</label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="account" placeholder="请输入账号" onblur="return checkAccount()">
									<span class="check text-danger" id="checkAccount"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="phoneNum" class="control-label col-sm-3">手机:</label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="phoneNum" placeholder="请输入手机号码" onblur="return checkPhoneNum()">
									<span class="check text-danger" id="checkPhoneNum"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="pwd" class="control-label col-sm-3">密码:</label>
								<div class="col-sm-5">
									<input type="password" class="form-control" id="pwd" placeholder="请输入密码" onblur="return checkPwd()">
									<span class="check text-danger" id="checkPwd"></span>
								</div>
							</div>
							<div class="form-group ">
								<label for="confirmPwd" class="control-label col-sm-3">确认密码:</label>
								<div class="col-sm-5">
									<input type="password" class="form-control" id="confirmPwd" placeholder="请再次输入密码" onblur="return checkConfirmPwd()">
									<span class="check text-danger" id="checkConfirmPwd"></span>
								</div>
							</div>					
							<div class="form-group" id="campus">
								<label for="campus" class="control-label col-sm-3">校区:</label>
								<div class="col-sm-5">
									<select class="form-control">
										<option>海珠校区</option>
										<option>白云校区</option>
									</select>
								</div>
							</div>
							<div class="form-group ">
								<label for="room" class="control-label col-sm-3">宿舍号:</label>
								<div class="col-sm-5">
									<input type="text" class="form-control" id="room" placeholder="请输入宿舍号" onblur="return checkRoom()">
									<span class="check text-danger" id="checkRoom"></span>
								</div>
							</div>
							<div class="col-sm-offset-4">
								<input type="button" class="btn btn-default" value="提交" onclick="return registerTotalCheck()">
								<a href="login.html"><input type="button" class="btn btn-default" value="取消"></a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>