<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>修改密码</title>
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
  <small><span>| 重置密码</span></small>
  </a>
    </div>
   <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="login()">Login</button>
  </div>
</nav>
<div class="container" style="position:relative;top:100px">
<form id="userFrom">
  <div class="form-group row">
    <label for="staticEmail" class="col-sm-2 col-form-label">账号</label>
    <div class="col-sm-10">
      <input type="text" readonly name="username" id="username" class="form-control-plaintext"  value="<%=request.getParameter("username") %>">
    </div>
  </div>
  <div class="form-group row">
    <label for="staticEmail" class="col-sm-2 col-form-label">邮箱</label>
    <div class="col-sm-10">
      <input type="text" readonly="readonly" id="email" name="email" class="form-control-plaintext"  value="<%=request.getParameter("email") %>">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">姓名</label>
    <div class="col-sm-10">
      <input type="text" id="name" name="name" class="form-control" placeholder="请输入注册时的姓名">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">身份证号</label>
    <div class="col-sm-10">
      <input type="text" id="idcard" name="idcard" class="form-control" placeholder="请输入注册时的对应的身份证号">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">密码</label>
    <div class="col-sm-10">
      <input type="password" id="password" name="password" class="form-control" placeholder="重新输入密码">
    </div>
  </div>
  <div class="form-group row">
    <label for="inputPassword" class="col-sm-2 col-form-label">确认密码</label>
    <div class="col-sm-10">
      <input type="password" id="confirm_password" name="confirm_password" class="form-control" placeholder="再次输入密码">
    </div>
  </div>
    <button type="button" class="btn btn-primary btn-lg" id="res" style="cursor:pointer">重置</button>
    <button type="button" class="btn btn-lg btn-primary"  onclick="back()" style="cursor:pointer;position:relative;left:20px">返回</button>
</form>
</div>
<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
<script>
function back(){
	window.location.href='authentication.jsp'
}
function login(){
	  window.location.href="../login.html";
}
$(function(){
	$("#res").click(function(){
		var fromdata=$("#userFrom").serialize();
		var pw1=document.getElementById("password");
		var pw2=document.getElementById("confirm_password");
		if($("#name").val()==""||$("#name").val()==null){
			alert("输入姓名不可以为空!");
		}else if($("#idcard").val()==""||$("#idcard").val()==null){
			alert("身份证号不可以为空!");
		}else if($("#password").val()==""||$("#password")==null||$("#confirm_password").val()==""||$("#confirm_password").val()==null){
			alert("密码不可以为空!");
		}else if(pw1.value!=pw2.value){
			alert("两次密码输入不相同!");
		}else {
		$.post("../modifyPwd",fromdata,function(data){
			alert(data);
		})
		}
	});
})
</script>
</body>
</html>