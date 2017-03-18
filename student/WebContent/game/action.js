	var fenshu=0;  //记录分数
	var page;       //记录那一张图片出现、消失
	var speed=900;  //切换速度
	var shibaicishu=0;
	
	$(document).ready(function(){
		$("#p1").click(function(){    //jquery 语句
			$(this).hide();
			jiFenAndChange();    			//增加，显示分数
			
		});
		$("#p2").click(function(){
			$(this).hide();
			jiFenAndChange();
			
			
		});
		$("#p3").click(function(){
			$(this).hide();
			jiFenAndChange();
			
		});
		$("#p4").click(function(){
			$(this).hide();
			jiFenAndChange();
			
		});
		$("#p5").click(function(){
			$(this).hide();
			jiFenAndChange();
			
		});
		$("#p6").click(function(){
			$(this).hide();
			jiFenAndChange();
			
		});
		$("#p7").click(function(){
			$(this).hide();
			jiFenAndChange();
			
		});
		$("#p8").click(function(){
			$(this).hide();
			jiFenAndChange();
			
		});
		$("#p9").click(function(){
			$(this).hide();
			jiFenAndChange();
			
		});


		$("#go").click(function(){
			$(this).hide();
			$("#start").animate({left:'200px'},"slow");           //规则框的弹出
			setTimeout(function(){$(".divmax").animate({left:'200px',height:'+=100px',width:'+=100px',opacity:'1.0'},"slow");//游戏框的弹出
			$(this).hide();
			myRandom();},3000);//延迟3秒游戏框才弹出；
			
		
		});
		
		
		
	});

	function myRandom(){

		if(shibaicishu>4)
		{
			alert("走掉的小人大于5个，游戏结束，你的分数是："+fenshu);
			return;
		}
		page=Math.ceil(Math.random()*10);  //产生随机页面；
		switch(page)
		{
			case 1:$("#p1").toggle("300",function(){setTimeout(function(){if($("#p1").is(':visible'))shibaicishu++;$("#p1").hide()},700)});break;	//如果在小人消失前还不点，失败次数加1；
			case 2:$("#p2").toggle("300",function(){setTimeout(function(){if($("#p2").is(':visible'))shibaicishu++;$("#p2").hide()},700)});break;	//上述功能我想了好久，核心代码：if($("#p1").is(':visible'))shibaicishu++;
			case 3:$("#p3").toggle("300",function(){setTimeout(function(){if($("#p3").is(':visible'))shibaicishu++;$("#p3").hide()},700)});break;	
			case 4:$("#p4").toggle("300",function(){setTimeout(function(){if($("#p4").is(':visible'))shibaicishu++;$("#p4").hide()},700)});break;	
			case 5:$("#p5").toggle("300",function(){setTimeout(function(){if($("#p5").is(':visible'))shibaicishu++;$("#p5").hide()},700)});break;	
			case 6:$("#p6").toggle("300",function(){setTimeout(function(){if($("#p6").is(':visible'))shibaicishu++;$("#p6").hide()},700)});break;	
			case 7:$("#p7").toggle("300",function(){setTimeout(function(){if($("#p7").is(':visible'))shibaicishu++;$("#p7").hide()},700)});break;	
			case 8:$("#p8").toggle("300",function(){setTimeout(function(){if($("#p8").is(':visible'))shibaicishu++;$("#p8").hide()},700)});break;	
			case 9:$("#p9").toggle("300",function(){setTimeout(function(){if($("#p9").is(':visible'))shibaicishu++;$("#p9").hide()},700)});break;	
			case 10:break;	
		}

		setTimeout(function(){myRandom()},speed);
		if(fenshu>10)
			speed-=50;
		if(speed<=650)
			speed=650;
			
}

	function xiaoShi(){   //先隐藏小人
			
		$("#p1").hide();
		$("#p2").hide();
		$("#p3").hide();
		$("#p3").hide();
		$("#p4").hide();
		$("#p5").hide();
		$("#p6").hide();
		$("#p7").hide();
		$("#p8").hide();
		$("#p9").hide();

}
	function jiFenAndChange(){     //JS DOM 事件；

		fenshu++;
			var x =document.getElementById("fenshu");//显示分数等相关情况；
			x.innerHTML="你的分数是:"+fenshu+"<br/>" +"走掉的小人次数："+shibaicishu;
			
			
}
   