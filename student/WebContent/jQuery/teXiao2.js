var passwordEnter=0;



function show2(){

var w=screen.width;

var h=screen.width/2.1;


$(".main").css({"width":w,"height":h});
$(".footer").css("width",w);
$(".loginKuang").slideDown();
var s = $("#errorFlag").val();
if(s=="用户名不存在")
	{$("#tips").text("登陆失败：您的用户名不存在！！");
	setTimeout(function(){$("#tips").text('')},2000);
	}
if(s=="密码错误")
	{$("#tips").text("登陆失败：您输入的密码有误！！");
	setTimeout(function(){$("#tips").text('')},2000);
	}


}

$(document).ready(function(){
	
	$("#name").focus(function(){
		
		$(this).animate({width:'260px'}).css("border","2px solid cyan")
	})
	$("#name").blur(function(){
		
		$(this).animate({width:'243px'}).css("border","1px solid ")
	})
	
	$("#password").focus(function(){
		
		$(this).animate({width:'260px'}).css("border","2px solid cyan");
		passwordEnter=1;
	})
	$("#password").mouseleave(function(){
		if(passwordEnter==1)
		{$(this).animate({width:'243px'}).css("border","1px solid ");
		passwordEnter==0;}
	
	})
	
	
})



