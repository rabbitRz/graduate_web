<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boss注册</title>
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
    <h4 class="card-title text-center" style="padding-top:20px">注册</h4>
    <p class="card-text">This is the recruiter registration interface. After users fill in and submit, they can register only with the approval of the website administrator!</p>
    <p class="card-text">望您使用愉快！</p>
    
  <form>
  <div class="form-group">
   <div class="form-group">
    <label for="inputAddress2">用户名</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
    <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">密码</label>
      <input type="password" class="form-control" id="inputEmail4" placeholder="Password">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">确认密码</label>
      <input type="password" class="form-control" id="inputPassword4" placeholder="Password">
    </div>
  </div>
  
  <div class="form-group">
    <label for="inputAddress2">公司名称</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
   
  <div class="form-group">
    <label for="inputAddress2">联系方式</label>
    <input type="text" class="form-control" id="inputAddress2" placeholder="Apartment, studio, or floor">
  </div>
  <div class="form-group">
    <label for="inputAddress">电子邮箱</label>
    <input type="email" class="form-control" id="inputAddress" placeholder="1234 Main St">
  </div>
  
  <button type="submit" class="btn btn-primary">Sign in</button>
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