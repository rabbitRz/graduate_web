<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>标题页</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
</head>
<body>
<!-- 导航栏 -->
<nav class="navbar navbar-expand-sm bg-dark navbar-dark fixed-top">
<div class="container">
  <a class="navbar-brand" href="#"><img src="img/icon.png" alt="" style="width: 40px; height: 50px;"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link"  href="" target="showframe">首页 <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">公司</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">职位</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">咨询</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">测评</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="login.html" target="showframe">资讯</a>
      </li>
    </ul>
    </div>
   <button class="btn btn-outline-success my-2 my-sm-0" type="submit" onclick="login()">Login</button>
  </div>
  </nav>
  <script type="text/javascript">
  function login(){
	  window.location.href="login.html";
  }
  </script>
<script src="bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>