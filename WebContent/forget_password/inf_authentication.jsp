<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>详细身份验证信息</title>
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
    <label for="inputAddress2">用户名</label>
    <input type="text" class="form-control" id="username" name="username" placeholder="">
  </div>
  
  <div class="form-group">
    <label for="inputAddress2">姓名</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="请输入姓名....">
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">出生日期</label>
      <input type="date" class="form-control" id="birth" placeholder="请输入出生日期....">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">性别</label>
      <select id="sex" name="sex" class="form-control">
        <option selected>Choose...</option>
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
  <button type="submit" class="btn btn-primary">下一步</button>
</form>
</div>
<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
</body>
</html>