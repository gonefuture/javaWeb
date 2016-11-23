<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript">
	function _go() {
		var pc = $("#pageCode").val();//获取文本框中的当前页码
		if(!/^[1-9]\d*$/.test(pc)) {//对当前页码进行整数校验
			alert('请输入正确的页码！');
			return;
		}
		if(pc > ${pager.tp}) {//判断当前页码是否大于最大页
			alert('请输入正确的页码！');
			return;
		}
		location = "${pager.url}&pc="+pc;
	}
</script>


<div class="divBody">
  <div class="divContent">
  
    <%--上一页 --%>
	<c:choose>
		<c:when test="${pager.pc eq 1 }">
			<span class="spanBtnDisabled">上一页</span>
		</c:when>
		
		<c:otherwise>
			<a href="${pager.url }&pc=${pager.pc-1}" class="aBtn bold">上一页</a>
		</c:otherwise>
	</c:choose>
        
        

   <%--我们需要计算页码列表的开始和结束位置，即两个变量begin和end
		计算它们需要通过当前页码！
		1. 总页数不足6页--> begin=2, end=最大页
		2. 通过公式设置begin和end，begin=当前页-1，end=当前页+3
		3. 如果begin<1，那么让begin=1，end=6
		4. 如果end>tp, 让begin=tp-5, end=tp
 	--%>
    
    <%-- 显示页码列表 --%>
    <c:choose>
    	<c:when test="${pager.tp <=6 }">
    		<!-- set标签用于在域中设定一个属性，其中var用来设定属性名，value用来设定属性值 -->
    		<c:set var="begin" value="1"></c:set>
    		<c:set var="end" value="${pager.tp }"></c:set>
    	</c:when>
    	<c:otherwise>
    		<c:set var="begin" value="${pager.pc-2 }"></c:set>
    		<c:set var="end" value="${pager.pc+3 }"></c:set>
    		<c:if test="${begin<1 }">
    			<c:set var="begin" value="1"></c:set>
    			<c:set var="end" value="6"></c:set>
    		</c:if>
    		<c:if test="${end>pager.tp }">
    			<c:set var="begin" value="${pager.tp-5 }"></c:set>
    			<c:set var="end" value="${pager.tp }"></c:set>
    		</c:if>
    	</c:otherwise>
    </c:choose>
    
    <c:forEach begin="${begin }" end="${end }" var="i">
    	 <c:choose>
		   	  <c:when test="${i eq pager.pc }">
		   	    <span class="spanBtnSelect">${i }</span>
		   	  </c:when>
		   	  <c:otherwise>
		   	    <a href="${pager.url }&pc=${i}" class="aBtn">${i }</a>
		   	  </c:otherwise>
		 </c:choose>
    </c:forEach>

    
    <%-- 显示点点点 --%>
    <c:if test="${end < pager.tp }">
    	<span class="spanApostrophe">...</span>
    </c:if> 
	
	
	<%--下一页 --%>
    <c:choose>
    	<c:when test="${pager.pc eq pager.tp }">
    		<span class="spanBtnDisabled">下一页</span>
    	</c:when>
    	
    	<c:otherwise>
    		<a href="${pager.url }&pc=${pager.pc+1}" class="aBtn bold">下一页</a> 
    	</c:otherwise>
    </c:choose>
    
        
        
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
    <%-- 共N页 到M页 --%>
    <span>共${pager.tp}页</span>
    <span>到</span>
    <input type="text" class="inputPageCode" id="pageCode" value="${pager.pc }"/>
    <span>页</span>
    <a href="javascript:_go();" class="aSubmit">确定</a>
  </div>
</div>