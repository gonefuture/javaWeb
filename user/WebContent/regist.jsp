<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
<body>
  <h1>注册</h1>
<p style="color: red; font-weight: 900">${msg }</p>
<form action="<c:url value='/RegistServlet'/>" method="post">
	<input type="hidden" name="method" value="regist"/>
	用户名：<input type="text" name="username" value="${form.username }"/>
	<span style="color: red; font-weight: 900">${errors.username }</span>
	<br/>
	密　码：<input type="password" name="password" value="${form.password }"/>
	<span style="color: red; font-weight: 900">${errors.password }</span>
	<br/>
	邮　箱：<input type="text" name="email" value="${form.email }"/>
	<span style="color: red; font-weight: 900">${errors.email }</span>
	<br/>	
	手机：<input type="text" name="phone" value="${form.phone }"/>
	<span style="color: red; font-weight: 900">${errors.phone }</span>
	<br/>
	<input type="submit" value="注册"/>
</form>
</body>
</html>