<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>身份验证</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
<div class="container">
  <a class="navbar-brand" href="#"><img src="../img/icon.png" width="30" height="30" class="d-inline-block align-top" alt=""></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
   <a class="navbar-brand" href="#">
    找回密码
  <small><span>| 身份验证</span></small>
  </a>
    </div>
   <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="login()">Login</button>
  </div>
</nav>
<div class="container" style="position:relative;top:100px">
<form id="form0" name="form0" AUTOCOMPLETE="OFF">
<div class="form-group">	
	
 	<label for="exampleInputEmail1">账号用户名</label>
    <input type="text" name="username" id="username" class="form-control" placeholder="请输入需要重置密码的用户名">
	<div id="mes" class="form-text text-muted" style="color:red"></div>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">邮箱</label>
    <div class="input-group mb-3">
  	<input name="email" type="email" id="email"  class="form-control" placeholder="你可以输入账户电子邮箱获取验证码" >
  	<div class="input-group-append">
    <button class="btn btn-outline-secondary" id="btnGetVcode" style="cursor:pointer" type="button">发送验证码</button>
  	</div>    
	</div>
	<small id="emailHelp" class="form-text text-muted">We'll never share your account with anyone else.</small>
  </div>
  <div class="form-group">	
	
 	<label for="exampleInputEmail1">验证码</label>
    <input type="text" name="vcode" id="vcode" class="form-control" placeholder="请输入邮件中获取的验证码">
	<div id="message" class="form-text text-muted" style="color:red"></div>
  </div>
  <button type="button" class="btn btn-primary" id="btnVerify" style="cursor:pointer">验证</button>
</form>
</div>

<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
  function login(){
	  window.location.href="../login.html";
  }
  var time0=60;
  var time=time0;
  var t;//用于验证按钮的60s计时
  $(document).ready(function(){
	  //获取验证码按钮
	  $("#btnGetVcode").click(function() {
		  
			var btnGet = document.getElementById("btnGetVcode");
			btnGet.disabled = true;  // 为了防止多次点击
			$.ajax({
				url: '../EmailServlet?method=getVCode',
				type: 'post',
				data: {email: $("input[name='email']").val()},
				dataType: 'text',
				success: function(msg) {
					if(msg == -1){
						window.alert("请输入正确的邮箱！");
						btnGet.disabled = false;
					}
					else{
						useChangeBTN();  // 控制下一次重新获取验证码
					}
				},
				error:function(msg){
				}
			});
		});
		
		// 验证按钮
		$("#btnVerify").click(function() {
			var message = document.getElementById("message");  // 显示提示信息
			var username=document.getElementById("username");//账户
			var email=document.getElementById("email");//邮箱
			$.ajax({
				url: '../EmailServlet?method=verify',
				type: 'post',
				data: {vcode: $("input[name='vcode']").val()},
				dataType: 'text',
				success: function(msg) {
					if(msg == 1){
						message.innerHTML = "验证码正确！";
						$("#message").css("color","green");
						alert("验证码正确！");
						 window.location.href="ModifyPwd.jsp?username="+username.value+"&email="+email.value;
					}
					else{
						message.innerHTML = "验证码错误！";
						$("#message").css("color","red");
						alert("验证码错误！");
					}
				},
				error:function(msg){
				}
			});
		});
	});

	//修改按钮，控制验证码重新获取
	function changeBTN(){
		if(time > 0){
			$("#btnGetVcode").text("("+time+"s)"+"重新获取");
			time = time - 1;
		}
		else{
			var btnGet = document.getElementById("btnGetVcode");
			btnGet.disabled = false;
			$("#btnGetVcode").text("获取验证码");
			clearInterval(t);
			time = time0;
		}
  }
  function useChangeBTN(){
		$("#btnGetVcode").text("("+time+"s)"+"重新获取");
		time = time - 1;
		t = setInterval("changeBTN()", 1000);  // 1s调用一次
	}

</script>
</body>
</html>