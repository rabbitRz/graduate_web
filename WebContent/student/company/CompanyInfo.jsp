<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>公司信息</title>
</head>
<body>
<div class="card bg-dark">
  <div class="bg-dark text-white" style="position:relative;top:50px;">
  <div class="container">
  <div class="row">
  <div class="col-auto">
   <img src="https://img.bosszhipin.com/beijin/logo/0e0d441a2f93a236536f20e8277bf4dbbe1bd4a3bd2a63f070bdbdada9aad826.png?x-oss-process=image/resize,w_120,limit_0" class="rounded float-middle" style="display: table-cell;" alt="...">
  </div>
  <div class="col-10">
   <h2 style="position:absolute;bottom:30px">百度</h2>
   <lable style="position:absolute;bottom:0px;font-size:20px">15000人·价值·公司类型</lable>
  </div>
   </div>
    <p class="lead" style="position:relative;top:10px;font-size:20px">The company is build at xxxx-xx-xx</p>
  </div>
</div>
</div>
<br/>
<div class="container" >
<div class="card" style="position:absoluted;top:50px">
  <h5 class="card-header">公司简介</h4>
  <div class="card-body">
    <h4 class="card-title">公司评价：</h4>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>

<div class="card" style="position:absoluted;top:70px">
  <h5 class="card-header">公司地址</h4>
  <div class="card-body">
    <h4 class="card-title">Special title treatment</h4>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>

<div class="card" style="position:absoluted;top:90px">
  <h5 class="card-header">公司招聘职位</h4>
  <div class="card-body">
    <h4 class="card-title">Special title treatment</h4>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>

<div class="card" style="position:absoluted;top:110px">
  <h5 class="card-header">公司负责人</h4>
  <div class="card-body">
    <h4 class="card-title">Special title treatment</h4>
    <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
    <a href="#" class="btn btn-primary">Go somewhere</a>
  </div>
</div>

</div>
</body>
<script src="../../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../bootstrap/js/bootstrap.js"></script>
<script>
$(function(){
	var company_id=<%= request.getParameter("company_id") %>;
	$.getJSON("../../ComGetCompanyInfo?company_id="+company_id,function(data){
		console.log(data);
	})
})
</script>
</html>