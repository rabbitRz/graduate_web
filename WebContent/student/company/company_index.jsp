<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="../../bootstrap/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="../../bootstrap/css/bootstrap.css" rel="stylesheet" media="screen">
<meta charset="UTF-8">
<title>公司模块</title>
</head>
<body>
<div class="container">
<div class="card" style="position:relative;top:10px">
 <div class="card-body">
<div class="row col-20">
<div class="col-auto">
<label for="inputEmail3" class=" col-form-label">公司地点</label>
</div>
  <div class="col-2">
  <select class="custom-select" name="place" id="place">
  <option selected>全部</option>
  <option value="北京">北京</option>
  <option value="上海">上海</option>
  <option value="天津">天津</option>
  </select>
  </div>
  <div class="col-auto">
   <!-- Button trigger modal -->
  <button class="btn btn-outline-light" id="allCites" data-toggle="modal" data-target="#exampleModal">
  <svg class="bi bi-map" width="32" height="32" viewBox="0 0 16 16" fill="green" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M15.817.613A.5.5 0 0 1 16 1v13a.5.5 0 0 1-.402.49l-5 1a.502.502 0 0 1-.196 0L5.5 14.51l-4.902.98A.5.5 0 0 1 0 15V2a.5.5 0 0 1 .402-.49l5-1a.5.5 0 0 1 .196 0l4.902.98 4.902-.98a.5.5 0 0 1 .415.103zM10 2.41l-4-.8v11.98l4 .8V2.41zm1 11.98l4-.8V1.61l-4 .8v11.98zm-6-.8V1.61l-4 .8v11.98l4-.8z"/>
 </svg>
 </button>
 <!-- Modal -->
 <div class="modal fade bd-example-modal-xl" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-xl" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">全部城市</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      <nav class="nav nav-pills flex-column flex-sm-row bg-light">
  		<a class="flex-sm-fill text-sm-center nav-link active" data-toggle="tab" role="tab" aria-controls="A" href="#A">ABCDE</a>
  		<a class="flex-sm-fill text-sm-center nav-link" data-toggle="tab" role="tab" aria-controls="F" href="#F">FGHIJ</a>
  		<a class="flex-sm-fill text-sm-center nav-link" data-toggle="tab" role="tab" aria-controls="K" href="#K">KLMNO</a>
  		<a class="flex-sm-fill text-sm-center nav-link" data-toggle="tab" role="tab" aria-controls="P" href="#P">PQRST</a>
  		<a class="flex-sm-fill text-sm-center nav-link" data-toggle="tab" role="tab" aria-controls="W" href="#W">WXYZ</a>
	  </nav>
	  <div class="tab-content" id="nav-tabContent" style="position:relative;top:15px">
  		<div class="tab-pane fade show active" id="A" role="tabpanel" aria-labelledby="nav-home-tab"></div>
  		<div class="tab-pane fade" id="F" role="tabpanel" aria-labelledby="nav-profile-tab"></div>
  		<div class="tab-pane fade" id="K" role="tabpanel" aria-labelledby="nav-contact-tab"></div>
  		<div class="tab-pane fade" id="P" role="tabpanel" aria-labelledby="nav-contact-tab"></div>
  		<div class="tab-pane fade" id="W" role="tabpanel" aria-labelledby="nav-contact-tab"></div>
	  </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
 </div>
 </div>
  <div class="col-auto">
<label for="inputEmail3" class=" col-form-label">行业类型</label>
</div>
  <div class="col-2">
  <select class="custom-select" name="enterprise" id="enterprise">
  <option  selected>不限</option>
  <!--
  <option value="1">One</option>
  <option value="2">Two</option>
  <option value="3">Three</option>  -->
  </select>
  </div>
  <div class="col-auto">
<label for="inputEmail3" class=" col-form-label" >公司规模</label>
</div>
  <div class="col-2">
  <select class="custom-select" name="pp" id="pp">
  <option value="0" selected>不限</option>
  <option value="1">0-20人</option>
  <option value="2">20-99人</option>
  <option value="3">100-499人</option>
  <option value="4">500-999人</option>
  <option value="5">1000-9999人</option>
  <option value="6">10000人以上</option>
  </select>
  </div>
  <div class="col-auto ">
  <button type="button" class="btn btn-success" onclick="LoadHtml()">
  <div class="mx-auto" style="width:100px;">
  <svg class="bi bi-search" width="2em" height="1.5em" viewBox="0 0 16 16" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
  <path fill-rule="evenodd" d="M10.442 10.442a1 1 0 0 1 1.415 0l3.85 3.85a1 1 0 0 1-1.414 1.415l-3.85-3.85a1 1 0 0 1 0-1.415z"/>
  <path fill-rule="evenodd" d="M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z"/>
  </svg>
  <font style="position:relative;left:5px">查找</font>
  </div>
  </button>
  </div>
</div>
</div>
</div>

<div class="card" style="position:relative;top:30px">
 <div class="card-body"  id="AllCompany">
</div>
</div>
</div>
<script src="../../bootstrap/js/jquery-3.4.1.min.js"></script>
<script src="../../bootstrap/js/bootstrap.min.js"></script>
<script src="../../bootstrap/js/bootstrap.js"></script>
<script type="text/javascript">
//查找
function LoadHtml(){
	//获取选中下拉框的值
	var place=$("#place").find("option:selected").val();
	var enter=$("#enterprise").find("option:selected").val();
	var total_people=$("#pp").find("option:selected").val();
	//console.log(place+" "+enter+" "+total_people);
	$.getJSON("../../Fc?place="+place+"&enterprise="+enter+"&total_people="+total_people,function(data){
		console.log(data);
		$("#AllCompany").html("");
		for(var i=0;i<data.length;i+=3){
			var str='<div class="row">'
			for(var j=0;j<3&&i+j<data.length;j++){
			item=data[i+j];
			str+='<div class="col-sm-4"><div class="card mb-4" >'
			  +'<div class="row no-gutters">'
			  +'<div class="col-md-4">'
			  +'<img src="'+item.icon+'" class="rounded float-middle"' 
			  +'style="display: table-cell;" alt="...">'
			  +'</div>'
			  +'<div class="col-md-8">'
			  +'<div class="card-body">'
			  +'<a href="#" class="text-dark" ><h5 class="card-title" name="company_name" >'+item.name+'</h5></a>'
			  +'<p class="card-text">'+item.enterprises+'</p>'
			  +'<p class="card-text"><small class="text-muted">'+item.total_value+'元</small></p>'
			  +'</div>'
			  +'</div>'
			  +'</div>'
			  +'<div class="card-footer">'
			  +'<small class="text-muted">'+item.build_time+'</small>'
			  +'</div>'
			  +'</div></div>';
			}
			str+="</div>"
			$("#AllCompany").append(str);
		}
	});
}
</script>
<script>
$(function(){
	$.getJSON("../../EnterpriseKindServlet",function(data){
    	console.info(data);
    	$(data).each(function(index,item){
    		$("select[name='enterprise']").append("<option value="+item.enterprise+">"+item.enterprise+"</option>");
    	});
    });
	$.getJSON("../../Tr",function(data){
		console.log(data);
		for(var i=0;i<data.length;i+=3){
			var str='<div class="row">'
			for(var j=0;j<3&&i+j<data.length;j++){
			item=data[i+j];
			str+='<div class="col-sm-4"><div class="card mb-4" >'
			  +'<div class="row no-gutters">'
			  +'<div class="col-md-4">'
			  +'<img src="'+item.icon+'" class="rounded float-middle"' 
			  +'style="display: table-cell;" alt="...">'
			  +'</div>'
			  +'<div class="col-md-8">'
			  +'<div class="card-body">'
			  +'<a href="CompanyInfo.jsp?company_id='+item.id+'" class="text-dark"><h5 class="card-title" name="company_name" >'+item.name+'</h5></a>'
			  +'<p class="card-text">'+item.enterprises+'</p>'
			  +'<p class="card-text"><small class="text-muted">'+item.total_value+'元</small></p>'
			  +'</div>'
			  +'</div>'
			  +'</div>'
			  +'<div class="card-footer">'
			  +'<small class="text-muted">'+item.build_time+'</small>'
			  +'</div>'
			  +'</div></div>';
			}
			str+="</div>"
			$("#AllCompany").append(str);
		}
	});
	
	$('#exampleModal').on('show.bs.modal', function (e) {
		$.getJSON("../../PythonFiles/AllCites.txt",function(data){
		   console.info(data);
           var r="";
           for(var k=0;k<5;k++){
         	var dataName=data[k]["name"];
         	console.info("1"+dataName);
           for(var i = 0;i<dataName.length;i+=5){
        	   var s=data[k]["firstChar"];
        	   if(i>0)
        		   s=" ";
        	   r+="<div class='row' style='position:relative;top:20px'>"
                	+"<div class='col' style='font-size:20px;' >"
                	+"<p class='text-success text-lg-center' >"+s+"</div>";
               
               for(var st=0;st<5;st++){
            	var ty=" ";
            	if(i+st<dataName.length)
            		ty=dataName[st+i];
            		r+="<div class='col-2' style='font-size:17px;'><p><a href='#' name='cites' class='text-lg-center text-muted' >"+ty+"</a></div>";
               }
               r+="</div>";
            }
           }
            $("#A").append(r);
    	
    		var r="";
            for(var k=5;k<9;k++){
          	var dataName=data[k]["name"];
            for(var i = 0;i<dataName.length;i+=5){
         	   var s=data[k]["firstChar"];
         	   if(i>0)
         		   s=" ";
         	   r+="<div class='row' style='position:relative;top:20px'>"
                 	+"<div class='col' style='font-size:20px;' >"
                 	+"<p class='text-success text-lg-center' >"+s+"</div>";
                for(var st=0;st<5;st++){
             	var ty=" ";
             	if(i+st<dataName.length)
             		ty=dataName[st+i];
             		r+="<div class='col-2' style='font-size:17px;'><p><a href='#' name='cites' class='text-lg-center text-muted' >"+ty+"</a></div>";
                }
                r+="</div>";
             }
            }
             $("#F").append(r);
    		
     		var r="";
            for(var k=9;k<13;k++){
          	var dataName=data[k]["name"];
            for(var i = 0;i<dataName.length;i+=5){
         	   var s=data[k]["firstChar"];
         	   if(i>0)
         		   s=" ";
         	   r+="<div class='row' style='position:relative;top:20px'>"
                 	+"<div class='col' style='font-size:20px;' >"
                 	+"<p class='text-success text-lg-center' >"+s+"</div>";
                for(var st=0;st<5;st++){
             	var ty=" ";
             	if(i+st<dataName.length)
             		ty=dataName[st+i];
             		r+="<div class='col-2' style='font-size:17px;'><p><a href='#' name='cites' class='text-lg-center text-muted' >"+ty+"</a></div>";
                }
                r+="</div>";
             }
            }
             $("#K").append(r);
     		
     		var r="";
            for(var k=13;k<18;k++){
          	var dataName=data[k]["name"];
            for(var i = 0;i<dataName.length;i+=5){
         	   var s=data[k]["firstChar"];
         	   if(i>0)
         		   s=" ";
         	   r+="<div class='row' style='position:relative;top:20px'>"
                 	+"<div class='col' style='font-size:20px;' >"
                 	+"<p class='text-success text-lg-center' >"+s+"</div>";
                for(var st=0;st<5;st++){
             	var ty=" ";
             	if(i+st<dataName.length)
             		ty=dataName[st+i];
             		r+="<div class='col-2' style='font-size:17px;'><p><a href='#' name='cites' class='text-lg-center text-muted' >"+ty+"</a></div>";
                }
                r+="</div>";
             }
            }
             $("#P").append(r);
     		
     		var r="";
            for(var k=18;k<22;k++){
          	var dataName=data[k]["name"];
            for(var i = 0;i<dataName.length;i+=5){
         	   var s=data[k]["firstChar"];
         	   if(i>0)
         		   s=" ";
         	   r+="<div class='row' style='position:relative;top:20px'>"
                 	+"<div class='col' style='font-size:20px;' >"
                 	+"<p class='text-success text-lg-center' >"+s+"</div>";
                for(var st=0;st<5;st++){
             	var ty=" ";
             	if(i+st<dataName.length)
             		ty=dataName[st+i];
                	r+="<div class='col-2' style='font-size:17px;'><p><a href='#' name='cites' class='text-lg-center text-muted' >"+ty+"</a></div>";
                }
                r+="</div>";
             }
            }
             $("#W").append(r);
		});
    //添加下拉列表
    $(document).on('click', 'a[name="cites"]', function(e){
    	var text=$(e.target).text();
    	$('#exampleModal').modal('hide');
    	//console.log(text);
    	$("select[name='place']").append('<option value='+text+' selected>'+text+'</option>')
    })

});
});
</script>
</body>
</html>