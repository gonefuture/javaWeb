<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改密码</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" href="<c:url value='/admin/css/bootstrap.min.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/admin/css/css.css'/>">
	<link rel="stylesheet" href="<c:url value='/admin/css/style.css'/>">
	<link rel="stylesheet" type="text/css" href="<c:url value='/admin/css/updateInfo.css'/>">
	<script type="text/javascript" src="<c:url value='/admin/js/jquery-1.7.2.js'/>"></script>
	<script type="text/javascript" src="<c:url value='/admin/js/updateInfo.js'/>"></script>
  </head>
  
  <body>
  
  	<header id="header">
		<img src="<c:url value='/admin/image/logo.jpg'/>" class="img-responsive" alt="Responsive image">
	</header>
	
	<div id="main">
		<div class="container">
			<div class="row">
			
				<div class="col-md-2" >
					<ul class="nav nav-pills nav-stacked" data-spy="affix" data-offset-top="220" >
						<li><a href="#1">新的报修单</a></li>
						<li><a href="#2">已审核报单</a></li>
						<li><a href="#3">已维修报单</a></li>
						<li  class="active"><a href="#3">修改密码</a></li>
					</ul>
				</div>
				
				<div class="col-md-10 main-right" >
					
					<div class="div1">
						<form action="<c:url value='/UserServlet'/>" method="post" target="_top">
							<input type="hidden" name="method" value="updatePass"/>
							<label class="updateSuccess">${updateSuccess }</label>
						<table>
							<tr>
								<td><label class="error">${msg }</label></td>
								<td colspan="2">&nbsp;</td>
							</tr>
							<tr style="height: 30px;">
								<td align="right">原密码:</td>
								<td><input class="input" type="password" name="loginpass" id="loginpass" value="${form.loginpass }"/></td>
								<td><label id="loginpassError" class="error"></label></td>
							</tr>
							<tr style="height: 30px;">
								<td align="right">新密码:</td>
								<td><input class="input" type="password" name="newloginpass" id="newloginpass" value="${form.newloginpass }"/></td>
								<td><label id="newpassError" class="error"></label></td>
							</tr>
							<tr style="height: 30px;">
								<td align="right">确认密码:</td>
								<td><input class="input" type="password" name="reloginpass" id="reloginpass" value="${form.reloginpass }"/></td>
								<td><label id="reloginpassError" class="error"></label></td>
							</tr>
							<tr style="height: 30px;">
								<td align="right"></td>
								<td>
								  <img id="vCode" src="<c:url value='/VerifyCodeServlet'/>" style="width: 75px;"/>
						    	  <a href="javascript:_change();">换一张</a>
								</td>
							</tr>
							<tr style="height: 30px;">
								<td align="right">验证码:</td>
								<td>
								  <input class="input" type="text" name="verifyCode" id="verifyCode" value=""/>
								</td>
								<td><label id="verifyCodeError" class="error"></label></td>
							</tr>
							<tr style="height: 30px;">
								<td align="right"></td>
								<td>&nbsp;&nbsp;&nbsp;<button type="submit" class="btn btn-info">修改</button></td>
							</tr>
						</table>
						</form>
					</div>
					
				</div>
				
			</div>
		</div>
	</div>
	
	<footer id="footer">
		<div class="container">
			<p>版权所有 © 2016-2020 仲恺农业工程学院  易班网络技术支持部</p>
		</div>
	</footer>
	
    
	
	<script src="<c:url value='/admin/js/jquery.min.js'/>"></script>
	<script src="<c:url value='/admin/js/bootstrap.min.js'/>"></script>
	<script type="text/javascript">
	
	
	</script>
	
  </body>
</html>
