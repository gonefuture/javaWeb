<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
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
						<a href="changePwd.html"><img src="img/ico/lock.ico">修改密码</a>
					</li>
					<li>
						<a href="history.html"><img src="img/ico/history.ico">服务记录</a>
					</li>
				</ul>
			</div>
		</div <br /><br /><br /><br />>
	
		
		
		<div style="border-top: 1px solid black;"><br />
		<ul class="nav nav-tabs nav-pills nav-tabs-justified container">
			<li class="active">
				<a href="#tab1" data-toggle="tab">
					<h4>饮用水</h4></a>
			</li>
			<li>
				<a href="#tab2" data-toggle="tab">
					<h4>土木水电维修</h4></a>
			</li>
			
		</ul>
		<br />

		<div class="tab-content active">			
			<div id="tab1" class="tab-pane fade in active">
				<div class="container img-rounded" id="thumbnail">					
					
					<p>你将要订购&nbsp;&nbsp;<img src="img/ico/callWater.ico ">&nbsp;&nbsp;桶装水×2</p>
					<div class="checkbox">
    					<label>
     					 	<input type="checkbox">确认请打勾
   					 	</label><br /><br />
 					 	<button type="submit" class="btn btn-default">提交订单</button>
  					</div>
				</div>
			</div>
			<div id="tab2"class="tab-pane fade">
				<div class="container img-rounded " id="thumbnail ">
					<br />
						<form role="form">
							<div class="form-group">
								<label for="name">描述</label>
								<textarea class="form-control" rows="5"placeholder="请描述一下物品损坏情况或故障"></textarea>
							</div>
							<div class="form-group">
								<label for="inputfile">上传破损物品图片</label>
								<input type="file" id="inputfile">
		
							</div>
							<button type="submit" class="btn btn-default">提交</button>
						</form>
				</div>
			</div>
		</div>
	</div>
	</body>

</html>