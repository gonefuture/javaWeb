<%@page contentType="text/html"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>仲园宿舍服务平台登录</title>
		<script type="text/javascript" src="..js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="..js/bootstrap.js"></script>
		<script type="text/javascript" src="..js/bootstrap.min.js"></script>
		<link rel="stylesheet" href="..css/bootstrap.css" />
		<link rel="stylesheet" href="..css/bootstrap.min.css" />

	</head>

	<body style="background: url(img/background/17.jpg);background-repeat:no-repeat;background-size: cover;-webkit-background-size: cover;background-attachment: fixed;">

		</br>
		</br>
		<!--
        		作者：offline
        		时间：2016-10-23
        		描述：轮播图,应用于手机端,即只适用xs
       		 -->
		<div class="container hidden-lg hidden-md hidden-sm">
			<div class="container-fluid">
				<div class="carousel slide" id="carousel">
					<div class="container">
						<ol class="carousel-indicators">
							<li class="active" data-slide-to="0" data-target="#carousel"></li>
							<li data-slide-to="1" data-target="#carousel"></li>
							<li data-slide-to="2" data-target="#carousel"></li>
							<li data-slide-to="3" data-target="#carousel"></li>
							<li data-slide-to="4" data-target="#carousel"></li>
							<li data-slide-to="5" data-target="#carousel"></li>
							<li data-slide-to="6" data-target="#carousel"></li>
							<li data-slide-to="7" data-target="#carousel"></li>
							<li data-slide-to="8" data-target="#carousel"></li>
							<li data-slide-to="9" data-target="#carousel"></li>
						</ol>
					</div>
					<div class="carousel-inner img-rounded" style="border: solid 1px;">
						<div class="item active">
							<img src="img/carousel/zk1.jpg" />
						</div>
						<div class="item">
							<img src="img/carousel/zk2.jpg" />
						</div>
						<div class="item">
							<img src="img/carousel/zk3.jpg" />
						</div>
						<div class="item">
							<img src="img/carousel/zk4.jpg" />
						</div>
						<div class="item">
							<img src="img/carousel/zk5.jpg" />
						</div>
						<div class="item">
							<img src="img/carousel/zk6.jpg" />
						</div>
						<div class="item">
							<img src="img/carousel/zk7.jpg" />
						</div>
						<div class="item">
							<img src="img/carousel/zk8.jpg" />
						</div>
					</div>
					<a href="#carousel" class="carousel-control left" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left"></span>
					</a>
					<a href="#carousel" class="carousel-control right" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right"></span>
					</a>
				</div>
			</div>
		</div>
		<!--
            	作者：offline
            	时间：2016-10-23
            	描述：登录面板,应用于手机端,即只适用xs.
            	下面进行的container的多层嵌套目的是为了配合轮播图的尺寸
            -->
		<div class="container">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-5">
						<form action="<c:url value='/UserServlet'/>" method="post" role="form" id="defaultForm"  class="form-horizontal">
						<input type="hidden" name="method" value="login">
							<div class="form-group">
								<div class="col-sm-5">
									</br>
									<center>
										<h4><b>仲园后勤服务平台登录</b></h4>
									</center>
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-5">
								<p style="color: red; font-weight: 900">${msg }</p>
									<input type="text" name="userName" value="${form.userName }" class="form-control" id="account" placeholder="请输入账号">
								</div>
							</div>
							<div class="form-group">
								<div class="col-sm-5">
									<input type="password" name="password" value="${form.password }" class="form-control" id="pwd" placeholder="请输入密码">
								</div>
							</div>
							<div class="col-sm-5">
								<span style="display:block;  text-align:center">																
									<input type="submit" class="btn btn-info" value="登录" style="width:200px; height:35px;">											
								</span>
							</div>
							
							<div class="form-group">
								<div class="col-sm-5">
									<button id="directNextpage" onclick="window.location.reload('/user/register.jsp')" class="btn btn-default btn-group-vertical" value="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;立即注册&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;">Direct Next Page</button>  

									<a href="<c:url value='/user/register.jsp'/>">
										<input type="button"  onclick="window.location.reload('/html/nextpage.html')" class="btn btn-default btn-group-vertical" value="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;找回密码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;">
									</a>
								</div>
							</div>

						</form>
					</div>
				</div>
			</div>
		</div>
	</body>

	<script type="text/javascript ">
		<!--用于自动轮播,设置的时间长度为2秒,此脚本应用在id为carousel中-->
		$("#carousel ").carousel({
			interval: 2000
		})
	</script>

</html>