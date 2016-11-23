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
		<script type="text/javascript" src="..js/valid.js"></script>
		<link rel="stylesheet" href="..css/bootstrap.min.css" />
		<link rel="stylesheet" href="..css/bootstrap.css" />
		
		<script type="text/javascript">
		
		function creatXMLHttpRequest(){
			try{
				return new XMLHttpRequest();
			}catch(e){
				return new ActiveXObject("Maxm12.XMLHTTP");
			}catch(e){
				return new ActiveXObject("Micorsoft.XMLHTTP");
			}
			
		}
		
		window.onload = function(){
			var xmlHttp = createXMLHttpRequst();
			xmlHttp.open("GET","<c:url value='/ShoolPartServlet'/>",true);
			xmlHttp.send(null);
			xmlHttp.onreadystatechange = function(){
				if(xmlHttp.readyState == 4){
					if(xmlHttp.status == 200){
						var shoArray = eval("("+xmlHttp.responseText+")");
						for(var i= 0; i<proArray[i];i++){
							var sho = shoArray[i];
							
							var optionEle = document.createElement("option");
							
							optionEle.value = sho.sid;
							var textNode = document.createTextNode(sho.name);
							optionEle.appendchild(textNode);
							
							document.getElementById("shoolpart").appendChild(optionEle);
							
						}
					}
				}
			};
			
			document.getElementById("shoolpart").onchange = function(){
				var xmlHttp = createXMLHttpRequst();
				xmlHttp.open("POST","<c:url value='/DormitoryServlet'/>",true);
				xmlHttp.setRequstHeader("Content-Type","application/x-www-form-urlencode");

				xmlHttp.send("sid=" + this.value);
				xmlHttp.onreadystatechange = function(){
					if(xmlHttp.readyState == 4){
						if(xmlHttp.status == 200){
							var dormitorySelect =  document.getElementById("dormitory")
							var dormitoryOptionArray =dormitorySele.getElementByTagName("option");\
							while(dormitoryOptionArray.length > 1){
								dormitorySelect.removeChild(dormitoryOptionArry[1]);
							}
							
							var dormitoryArray = eval("("+xmlHttp.responseText+")");
							for(var i= 0; i< dormitoryArray[i];i++){
								var dormitory = shoArray[i];
								
								var optionEle = document.createElement("option");
								
								optionEle.value = dormitory.sid;
								var textNode = document.createTextNode(dormitory.name);
								optionEle.appendchild(textNode);
								
								dormitorySelect.appendChild(optionEle);
								
						}
					}
				};							
			};
		};
		
		</script>
		
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
						<form action="<c:url value='/UserServlet'/>" method="post"  id="defaultForm"  class="form-horizontal">
						<input type="hidden" name="method" value="regist"/>
							<div class="form-group">
								<label for="account" class="control-label col-sm-3">用户名:</label>
								<div class="col-sm-5">
									<input type="text" name="userName" value="${form.userName }" class="form-control" id="account" placeholder="请输入用户名" onblur="return checkAccount() ">
									<span class="check text-danger" id="checkAccount"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="phoneNum" class="control-label col-sm-3">手机:</label>
								<div class="col-sm-5">
									<input type="text" name="userPhone" value="${form.userPhone }" class="form-control" id="phoneNum" placeholder="请输入手机号码" onblur="return checkPhoneNum()">
									<span class="check text-danger" id="checkPhoneNum"></span>
								</div>
							</div>
							<div class="form-group">
								<label for="pwd" class="control-label col-sm-3">密码:</label>
								<div class="col-sm-5">
									<input type="password"  name="password" value="${form.password }" class="form-control" id="pwd" placeholder="请输入密码" onblur="return checkPwd()">
									<span class="check text-danger" id="checkPwd"></span>
								</div>
							</div>
							<div class="form-group ">
								<label for="confirmPwd" class="control-label col-sm-3">确认密码:</label>
								<div class="col-sm-5">
									<input type="password" name="password" value="${form.password }" class="form-control" id="confirmPwd" placeholder="请再次输入密码" onblur="return checkConfirmPwd()">
									<span class="check text-danger" id="checkConfirmPwd"></span>
								</div>
							</div>					
							<div class="form-group" id="campus">
								<label for="campus" class="control-label col-sm-3">校区:</label>
								<div class="col-sm-5">
									<select name="shoolpart" class="form-control">
										<option>===选择校区===</option>
									</select>
									<select name="dormitory" class="form-control">
										<option>====选择宿舍===</option>	
									</select>
								</div>
							</div>
							<br/>
							<input type="submit" value="注册"/>
							
							<div class="col-sm-offset-4">
								<input  type="submit"  class="btn btn-default" value="提交" onclick="return registerTotalCheck()">
								<a href="<c:url value='/UserServlet'/>">
								<input type="hidden" name="method" value="regist"/>
								<input type="submit" class="btn btn-default" value="取消"></a>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</body>

</html>