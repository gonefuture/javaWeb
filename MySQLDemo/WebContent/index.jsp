<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'ajax1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
function createXMLHttpRequest() {
	try {
		return new XMLHttpRequest();//大多数浏览器
	} catch (e) {
		try {
			return ActvieXObject("Msxml2.XMLHTTP");//IE6.0
		} catch (e) {
			try {
				return ActvieXObject("Microsoft.XMLHTTP");//IE5.5及更早版本	
			} catch (e) {
				alert("哥们儿，您用的是什么浏览器啊？");
				throw e;
			}
		}
	}
}

window.onload = function() {
	
	var xmlHttp = createXMLHttpRequest();
	xmlHttp.open("GET", "<c:url value='/ProvinceServlet'/>", true);
	xmlHttp.send(null);
	
	xmlHttp.onreadystatechange = function() {
		if(xmlHttp.readyState == 4) {
			if(xmlHttp.status == 200) {
				//执行服务器发过来的json字符串，得到js对象
				var proArray = eval("("+xmlHttp.responseText+")");
				
				for(var i =0; i <proArray.length; i++) {
					var pro = proArray[i];
					//创建<option>元素<%  %>
					var optionEle = document.createElement("option");
					//给<option>元素的value属性赋值
					optionEle.value = pro.pid;  //给<option>的实际值为pid,而不是name
					var textNode = document.createTextNode(pro.name);//使用省名来创建textNode
					optionEle.appendChild(textNode); //把textNode添加到option元素中
					
					//把option元素添加到select元素中
					document.getElementById("province").appendChild(optionEle);
				
				}
			}
		}
	};
	
	document.getElementById("province").onchange = function() {
		var xmlHttp  = createXMLHttpRequest();
		
		xmlHttp.open("POST", "<c:url value='/CityServlet'/>", true);
		
		xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
		
		xmlHttp.send("pid="+this.value);
		
		xmlHttp.onreadystatechange = function() {
			if(xmlHttp.readyState == 4) {
				if(xmlHttp.status == 200) {
					/*
					0.先要清空原来的<option>
					1.得到服务器发送过来的所有市
					2.使用每个市生成<option>元素添加到<select id="city">
					*/
					var citySelect = document.getElementById("city");
					var cityOptionArray = citySelect.getElementsByTagName("option");
					while(cityOptionArray.length > 1){
						citySelect.removeChild(cityOptionArray[1]);
					}
					
					var cityArray = eval("("+xmlHttp.responseText+")");
					
					for(var i =0; i <cityArray.length; i++) {
					var city = cityArray[i];
					//创建<option>元素
					var optionEle = document.createElement("option");
					//给<option>元素的value属性赋值
					optionEle.value = city.cid;  //给<option>的实际值为pid,而不是name
					var textNode = document.createTextNode(city.name);//使用省名来创建textNode
					optionEle.appendChild(textNode); //把textNode添加到option元素中
					
					//把option元素添加到select元素中
					citySelect.appendChild(optionEle);
				
				}
					
				}
			} 
			
		};	
	};
};

</script>
  </head>
  
  <body>
<h1>省市联动</h1>
<select name="province" id="province">
  <option>===请选择省===</option>
</select>
　　　
<select name="city" id="city">
  <option>===请选择市===</option>
</select>
  </body>
  </body>
</html>
