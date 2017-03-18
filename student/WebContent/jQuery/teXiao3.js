var errorFlag=0;
var emailEnter=0;
var passwAnginEnter=0;

function show3(){


var w=screen.width;

var h=screen.width/2.1;


$(".main").css({"width":w,"height":h});
$(".footer").css("width",w);
$(".signUpKuang").slideDown();
	var s = $("#signUpFlag").val();
	if(s=="用户名已被注册")
	{$("#tips").text("注册失败：用户名已存在！！");
	setTimeout(function(){$("#tips").text('')},2000);
	}
	if(s=="注册成功,请登录")
	{$("#tips").text("注册成功,请登录!!!");
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
		
		$(this).animate({width:'260px'}).css("border","2px solid cyan")
	})
	$("#password").blur(function(){
		
		$(this).animate({width:'243px'}).css("border","1px solid ")
	})
	

	$("#passwordAngin").focus(function(){
		
		$(this).animate({width:'260px'}).css("border","2px solid cyan");
	
		passwAnginEnter=1;
	})
	$("#passwordAngin").mouseleave(function(){
		
		if(passwAnginEnter==1)
		$(this).animate({width:'243px'}).css("border","1px solid ");

		if($("#password").val()!=$("#passwordAngin").val())
		{$("#tips").text("亲，您的输入的密码不一致喔！请重新输入");
			errorFlag=1;
		}
		else 
		{
			 $("#tips").text('');
			errorFlag=0;
		}
		
		if(0<$(this).val().length&&$(this).val().length<=7&&errorFlag==0)
		{
			$("#tips").html("密码强度：<meter value='30' min='10' max='100' low='20' high='80' ></meter> 弱");
			setTimeout(function(){ $("#tips").text('')},1500);
		}
		
		if((isNaN($(this).val()))&&8<=$(this).val().length&&errorFlag==0)
		{
			$("#tips").html("密码强度：<meter value='60' min='10' max='100' low='20' high='80' ></meter>  较强");
			setTimeout(function(){ $("#tips").text('')},1500);
		}
		
		if((isNaN($(this).val()))&&10<=$(this).val().length&&errorFlag==0)
		{
			$("#tips").html("密码强度：<meter value='85' min='10' max='100' optimum='80' ></meter>  强");
			setTimeout(function(){ $("#tips").text('')},1500);
		}

	})
	
	$("#submits").click(function(){
		
		var n = $("#name").val();
		var p = $("#password").val();
		var pa = $("#passwordAngin").val();
		var sex = $("#sexs").val();
		var age = $("#ages").val();
		if(n==''||p==''||pa==''||errorFlag==1||sex==''||age=='')
		{$("#tips").text("亲，您的输入不能为空噢！！！");
		}
		
		
	})
	$("#submits").mouseleave(function(){
		
		 $(this).attr("type","submit");
		 $("#tips").text('');
		
	})
	
	
	$("#email").focus(function(){
		
		$(this).animate({width:'260px'}).css("border","2px solid cyan");
		emailEnter=1;

	})
	$("#email").mouseleave(function(){
		
		if(emailEnter==1)
		$(this).animate({width:'243px'}).css("border","1px solid ")
	})

})

