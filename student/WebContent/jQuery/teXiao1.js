

function show(){

var w=screen.width;

var h=screen.width/2.1;


$(".main").css({"width":w,"height":h});
$(".footer").css("width",w);

$(".signUp").animate({top:'54%'},"slow");
$(".login").animate({top:'50%'},"slow");
$("pre").slideDown(3000);
var userN= $("#userFlag").val();
if(userN!='')
{	$("#spanTips").fadeIn("slow").text("Welcome");
	$("#userName").text("our "+userN).animate({left:'120px'}).animate({left:'70px'});
	}
//if(userN!=undefined)
	//$("#userName").text("our "+userN).animate({left:'89px'}).animate({left:'55px'})

}