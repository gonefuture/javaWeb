<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新的报单</title>


<link rel="stylesheet" href="<c:url value='/admin/css/bootstrap.min.css'/>">
<link rel="stylesheet" href="<c:url value='/admin/css/style.css'/>">
<link rel="stylesheet" type="text/css" href="<c:url value='/admin/css/orderlist.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/admin/pager/pager.css'/>" />

</head>
<body >

	<header id="header">
		<img src="<c:url value='/admin/image/logo.jpg'/>" class="img-responsive" alt="Responsive image">
	</header>
	
	<div id="main">
		<div class="container">
			<div class="row">
			
				<div class="col-md-2" >
					<ul class="nav nav-pills nav-stacked" data-spy="affix" data-offset-top="220" >
						<li class="active"><a href="<c:url value='/RepairOrderServlet?method=findOrder&state=0'/>">新的报修单</a></li>
						<li><a href="<c:url value='/RepairOrderServlet?method=findOrder&state=1'/>">已审核报单</a></li>
						<li><a href="<c:url value='/RepairOrderServlet?method=findOrder&state=2'/>">已维修报单</a></li>
						<li><a href="<c:url value='/admin/updateInfo.jsp'/>">修改密码</a></li>
					</ul>
				</div>
				
				<div class="col-md-10  main-right divMain" align="center">
					<div class="divTitle">
						<span style="margin-left: 18px;margin-right: 55px;">故障描述</span>
						<span style="margin-left: 55px;margin-right: 38px;">宿舍号</span>
						<span style="margin-left: 40px;margin-right: 38px;">姓名</span>
						<span style="margin-left: 35px;margin-right: 38px;">联系电话</span>
						<span style="margin-left: 23px;margin-right: 38px;">订单状态</span>
						<span style="margin-left: 28px;margin-right: 50px;">操作</span>
					</div>
					<br/>
					
					
					<table align="center" border="0" width="100%" cellpadding="0" cellspacing="0">
					
					<c:forEach items="${pager.beanList }" var="order">
						<tr class="tt">
							<td width="320px" colspan="2">订单号：<a  href="#">${order.repairOrder_id }</a></td>
							<td width="200px"colspan="2">下单时间：${order.ordertime }</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							<td>&nbsp;</td>
							
						</tr>
						
						<tr style="padding-top: 10px; padding-bottom: 10px; height: 50px;">
							
							
							<td width="220px" align="center">
								<div style="display: inline-block;">${order.question }</div>
							</td>
							<td width="118px" align="center">
								<span class="price_t">${order.dormitory }</span>
							</td>
							
							<td width="118px" align="center">
								<span class="price_t">${order.userName }</span>
							</td>
							
							<td width="118px" align="center">
								<span class="price_t">${order.userPhone }</span>
							</td>
				
							
							<td width="100px" align="center">
							待审核
				
							</td >
							
							<td width="120px" align="center">
								<a href="<c:url value='/RepairOrderServlet?method=checkOrder&userId=${order.user_id}&repairOrderId=${order.repairOrder_id }'/>">接单</a><br/>
							</td>
						</tr>
						
						
						
					</c:forEach>
					</table>
				
					<br/>
					
					<%@include file="/admin/pager/pager.jsp" %>
					
					
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