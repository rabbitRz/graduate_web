<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>招聘者注册</title>
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
</head>
<body>
<div class="row">
<div class="col-sm-3">
<img class="img-fluid" src="../img/register_bg.jpg" style="">
</div>
<div class="col-sm-9">
<div class="container" style="position:relative;top:50px" id="demo">
<div class="card bg-dark text-white" style="height:auto;width:600px">
  <img class="img-fluid" src="../img/register_bg1.jpg" style="height:100%;width:auto;" alt="Card image">
  <div class="card-img-overlay" >
    <h4 class="card-title text-center" style="padding-top:10px">注册</h4>
    <p class="card-text">This is the interface for job seekers to register. After users fill in and submit, they can only register after being approved by the website administrator!</p>
    <p class="card-text">望您使用愉快！</p>
    
  <form>
  <div class="form-group">
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
      <input type="password" class="form-control" id="password" name="password" placeholder="">
    </div>
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
  
  <div class="form-row">
  <div class="form-group col-md-6">
      <label for="inputPassword4">公司统一信用代码</label>
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option></option>
        <option></option>
      </select>
    </div>
    <div class="form-group col-md-6">
      <label for="inputEmail4">职位</label>
      <input type="password" class="form-control" id="inputEmail4" placeholder="Password">
    </div>
  </div>
  <button type="submit" class="btn btn-primary">注册</button>
  </form>
  </div>
</div>
</div>
</div>
</div>
<script src="../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../bootstrap/js/bootstrap.min.js"></script>
<script src="../bootstrap/js/bootstrap.js"></script>
</body>
</html>