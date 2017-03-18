function show(){

var w=window.innerWidth
|| document.documentElement.clientWidth
|| document.body.clientWidth;
var h=window.innerHeight
|| document.documentElement.clientHeight
|| document.body.clientHeight;

$(".main").css({"width":w,"height":h});
$(".footer").css("width",w);

$(".signUp").animate({top:'54%'},"slow");
$(".login").animate({top:'50%'},"slow");
$("pre").slideDown(3500);

}