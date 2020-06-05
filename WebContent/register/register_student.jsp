<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>求职者注册</title>
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
</head>
<body style="">
<div class="row">
<div class="col-sm-3">
<img class="img-fluid" src="../img/register_bg.jpg" style="">
</div>
<div class="col-sm-9">
<div class="container" style="position:relative;top:50px" id="demo">
<div  style="position:fixed;right:17px;top:10px">
<svg class="bi bi-arrow-right-circle-fill" width="2em" height="2em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-8.354 2.646a.5.5 0 0 0 .708.708l3-3a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L9.793 7.5H5a.5.5 0 0 0 0 1h4.793l-2.147 2.146z"/>
</svg>
<a  href="../login.html">
<font color="blue" size="4px">返回登录</font>
</a>
</div>
<div class="card bg-dark text-white" style="height:auto;width:600px">
  <img class="img-fluid" src="../img/register_bg1.jpg" style="height:100%;width:auto;" alt="Card image">
  <div class="card-img-overlay" >
    <h4 class="card-title text-center" style="padding-top:20px">注册</h4>
    <p class="card-text">This is the interface for job seekers to register. After users fill in and submit, they can only register after being approved by the website administrator!</p>
    <p class="card-text">望您使用愉快！</p>
    
  <form action="" id="userFrom">
   <div class="form-group" >
    <label for="inputAddress2">用户名</label>
    <input type="text" class="form-control" id="username" name="username" placeholder="用户名唯一">
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">密码</label>
      <input type="password" class="form-control" id="password" name="password" placeholder="密码包含英文字母和数字">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">确认密码</label>
      <input type="password" class="form-control" id="confirm_password" name="confirm_password" placeholder="请再次确认密码">
    </div>
  </div>
  
  <div class="form-group">
    <label for="inputAddress2">姓名</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名....">
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">出生日期</label>
      <input type="date" class="form-control" id="birth" name="birth" placeholder="请输入出生日期....">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">性别</label>
      <select id="sex" name="sex" class="form-control">
        <option>男</option>
        <option>女</option>
      </select>
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress2">身份证号</label>
    <input type="text" class="form-control" id="idcard" name="idcard" placeholder="请输入身份证号....">
  </div>
  <div class="form-group">
    <label for="inputAddress2">联系方式</label>
    <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入联系方式....">
  </div>
  <div class="form-group">
    <label for="inputAddress">电子邮箱</label>
    <input type="email" class="form-control" id="email" name="email" placeholder="请输入电子邮箱....">
  </div>
  <button id="sub" type="button"  class="btn btn-primary">注册</button>
  </form>
  </div>
</div>
</div>
</div>
</div>
<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
<script>
	//当页面加载完成后执行。
	$(function(){
		$("#sub").click(function(){
			//发送异步请求，到服务器后台进行部门的添加。
			var formData = $("#userFrom").serialize();
			var pw1=document.getElementById("password");
			var pw2=document.getElementById("confirm_password");
			if($("#username").val()==""||$("#username").val()==null){
				alert("用户名不可以为空!");
			}else if($("#password").val()==""||$("#password")==null||$("#confirm_password").val()==""||$("#confirm_password").val()==null){
				alert("密码不可以为空!");
			}else if(pw1.value!=pw2.value){
				alert("两次密码输入不相同!");
			}else if($("#name").val()==""||$("#name").val()==null){
				alert("输入姓名不可以为空!");
			}else if($("#birth").val()==""||$("#birth").val()==null){
				alert("出生日期不可以为空!");
			}else if($("#idcard").val()==""||$("#idcard").val()==null){
				alert("身份证号不可以为空!");
			}else if($("#phone").val()==""||$("#phone").val()==null){
				alert("联系方式不可以为空!");
			}else if($("#email").val()==""||$("#email").val()==null){
				alert("电子邮箱不可以为空!");
			}
			else {
			alert(formData);
			$.post("../reg",formData+"&role=stu",function(data){
				alert(data);
			})
			}
		});
	}); 
	
</script>
</body>
</html>