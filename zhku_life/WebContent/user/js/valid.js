function checkName() {
	var name = document.getElementById("name").value;
	if(name.length <= 0) {
		document.getElementById("checkName").innerHTML = "不能为空";
		//document.getElementById('name').focus();//focus事件作用后必须让用户完成这个输入才能进行下面的输入
		return false;
	} else {
		document.getElementById("checkName").innerHTML = "";
	}
}

function checkAccount() {
	var account = document.getElementById("account").value;
	if(account.length <=0) {
		document.getElementById("checkAccount").innerHTML = "不能为空";
		//document.getElementById('account').focus();
		return false;
	} else {
		document.getElementById("checkAccount").innerHTML = "";
	}
}

function checkPwd() {
	var pwd = document.getElementById("pwd").value;
	if(pwd.length <= 0) {
		document.getElementById("checkPwd").innerHTML = "不能为空";
		//document.getElementById('pwd').focus();
		return false;
	} else {
		document.getElementById("checkPwd").innerHTML = "";
	}
}
function checkPhoneNum() {
	var phoneNum = document.getElementById("phoneNum").value;
	if(phoneNum.length<=0) {
		document.getElementById("checkPhoneNum").innerHTML = "不能为空";
		//document.getElementById('pwd').focus();
		return false;
	} 
	else if(phoneNum.length>0&&phoneNum.length!=11){
		document.getElementById("checkPhoneNum").innerHTML = "手机格式有误";
	}
	else {
		document.getElementById("checkPhoneNum").innerHTML = "";
	}
}

function checkConfirmPwd() {
	var confirmPwd = document.getElementById("confirmPwd").value;
	var pwd = document.getElementById("pwd").value;
	if(confirmPwd.length <= 0) {
		document.getElementById("checkConfirmPwd").innerHTML = "不能为空";
		//document.getElementById('confirmPwd').focus();
		return false;
	} else {
		document.getElementById("checkConfirmPwd").innerHTML = "";
	}

	if(confirmPwd != pwd) {
		document.getElementById("checkConfirmPwd").innerHTML = "两次输入的密码不一致";
		//document.getElementById('confirmPwd').focus();
		return false;
	}
}

function checkMail() {
	var mail = document.getElementById("mail").value;
	var len = mail.length;
	var mailReg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
	if(len <= 0) {
		document.getElementById("checkMail").innerHTML = "不能为空";
		//document.getElementById('mail').focus();
		return false;
	} else if(false==mailReg.test(mail)) {
		document.getElementById("checkMail").innerHTML = "输入的邮箱格式有误";
		return false;
	} else {
		document.getElementById("checkMail").innerHTML = "";
	}
}

function checkRoom() {
	var room = document.getElementById("room").value;
	if(room.length <= 0) {
		document.getElementById("checkRoom").innerHTML = "不能为空";
		//document.getElementById('room').focus();
		return false;
	} else {
		document.getElementById("checkRoom").innerHTML = "";
	}
}


function checkNowPwd() {
	var nowPwd = document.getElementById("nowPwd").value;
	if(nowPwd.length <= 0) {
		document.getElementById("checkNowPwd").innerHTML = "不能为空";
		//document.getElementById('pwd').focus();
		return false;
	} else {
		document.getElementById("checkNowPwd").innerHTML = "";
	}
}

function registerTotalCheck() {
	checkName();
	checkAccount();
	checkPwd();
	checkConfirmPwd();
	checkRoom();
	checkPhoneNum();
}
function changePwdTotalCheck(){
	checkNowPwd();
	checkPwd();
	checkConfirmPwd();
}
