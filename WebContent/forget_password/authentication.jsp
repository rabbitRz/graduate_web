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
<form>
  <div class="form-group">
    <label for="exampleInputEmail1">账号</label>
    <input type="text" class="form-control" id="account" aria-describedby="emailHelp" placeholder="你可以输入账户对应的电话号码、用户名或是电子邮箱">
    <small id="emailHelp" class="form-text text-muted">We'll never share your account with anyone else.</small>
  </div>
  <button type="submit" class="btn btn-primary">下一步</button>
</form>
</div>
<script type="text/javascript">
  function login(){
	  window.location.href="../login.html";
  }
</script>
<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
</body>
</html>