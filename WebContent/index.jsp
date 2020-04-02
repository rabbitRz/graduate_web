<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<title>中间内容</title>
<jsp:include page="header.jsp" flush="true"/>
</head>
<body >
<!-- 首页内容 -->
<!-- 轮播 -->
<div id="demo" class="carousel slide" data-ride="carousel">
 
  <!-- 指示符 -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
 
  <!-- 轮播图片 -->
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://static.runoob.com/images/mix/img_fjords_wide.jpg" width="100%" heigh="400px">
      <div class="carousel-caption">
        <h3>第一张图片描述标题</h3>
        <p>描述文字!</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="https://static.runoob.com/images/mix/img_nature_wide.jpg" width="100%" heigh="400px">
      <div class="carousel-caption">
        <h3>第二张图片描述标题</h3>
        <p>描述文字!</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="https://static.runoob.com/images/mix/img_mountains_wide.jpg" width="100%" heigh="400px">
      <div class="carousel-caption">
        <h3>第三张图片描述标题</h3>
        <p>描述文字!</p>
      </div>
    </div>
  </div>
 
  <!-- 左右切换按钮 -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
 
</div>

<!-- 标签页 -->
<div class="container" style="padding:100px">
  <h4 class="text-center">——热门职业——</h4>
  <br>

  <div class="p-8 mb-1 bg-white text-dark">
  <ul class="nav nav-pills" role="tablist" >
    <li class="nav-item">
      <a class="nav-link active" data-toggle="pill" href="#menu">IT互联网</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu1">金融</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu2">房地产建筑</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu3">教育培训</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu4">娱乐传媒</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu5">医疗健康</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu6">法律咨询</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu7">供应链物流</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" data-toggle="pill" href="#menu8">采购贸易</a>
    </li>
  </ul>
  </div>
 
  <div class="border border-light">
  <div  class="bg-light text-dark">
  <!-- Tab panes -->
  <div class="tab-content">
    <div id="menu" class="container tab-pane active"><br>
    
    <!-- 卡片 -->
    <div class="row" style="padding:5px">
  	<div class="col-sm-4">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  	</div>
  	<div class="col-sm-4">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  	</div>
  	<div class="col-sm-4">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  	</div>
	</div>
    
    <div class="row" style="padding:10px">
  	<div class="col-sm-4">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  	</div>
  	<div class="col-sm-4">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  	</div>
  	<div class="col-sm-4">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  	</div>
	</div>
    
    </div>
    
    <div id="menu1" class="container tab-pane fade"><br>
      
    </div>
    <div id="menu2" class="container tab-pane fade"><br>
     
    </div>
    <div id="menu3" class="container tab-pane active"><br>
      
    </div>
    <div id="menu4" class="container tab-pane fade"><br>
      
    </div>
    <div id="menu5" class="container tab-pane fade"><br>
      
    </div>
    <div id="menu6" class="container tab-pane active"><br>
      
    </div>
    <div id="menu7" class="container tab-pane fade"><br>
      
    </div>
    <div id="menu8" class="container tab-pane fade"><br>
      
    </div>

  </div>
</div>
</div>
<div class="mx-auto" style="width:300px;padding:10px">
<button type="button" class="btn btn-outline-success btn-lg" style="margin:cenetr;width:300px">查看更多</button>
</div>
</div>

<!-- 热门企业 -->
<div class="container" style="padding-left:100px">
  <h4 class="text-center">——热门企业——</h4>
  <br>
<div class="border border-light" >
<div  class="bg-light text-dark" style="padding:10px">
<div class="row">
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
</div>
<div class="row" style="padding-top:20px">
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
  <div class="col-sm-3">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Special title treatment</h5>
        <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
        <a href="#" class="btn btn-primary">Go somewhere</a>
      </div>
    </div>
  </div>
</div>
</div>
</div>
<div class="mx-auto" style="width:300px;padding:10px">
<button type="button" class="btn btn-outline-success btn-lg" style="margin:cenetr;width:300px">查看更多</button>
</div>
</div>
<jsp:include page="footer.jsp" flush="true"/>
<script src="bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<script src="bootstrap/js/bootstrap.js"></script>
</body>
</html>