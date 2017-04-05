<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="css/bootstrap.min.css" rel="stylesheet" media="screen" />
<link href="css/bootstrap-responsive.min.css" rel="stylesheet" />
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<title>pagination</title>
<style type="text/css">
.table td {
	text-align: center
}

.table th {
	text-align: center;
	background-color: #969696;
	color: white;
}

.pagination-ex {
	margin-top: 0;
	margin-bottom: 0;
}
</style>
</head>
<body>
	<div class="row">
		<div class="span2"></div>
		<div class="span8 offset2">
			<table class="table table-bordered">
				<thead >
					<tr >
						<th>id</th>
						<th>类别</th>
						<th>创建日期</th>
					</tr>
				</thead>
				<tbody class="mainbody"></tbody>
					<tr>
					  <td colspan="3">
							<div class="pagination pagination-ex">
								<ul>
									<li><a href="javascript:void(0)" style="color: black;" class="up">上一页</a></li>
									<li><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">5</a></li>
									<li><a href="#">6</a></li>
									<li><a href="#">7</a></li>
									<li><a href="#">8</a></li>
									<li><a href="#">9</a></li>
									<li><a href="#">10</a></li>
									<li><a href="#" style="color: black;">下一页</a></li>
								</ul>
							</div>
						</td>
					</tr>
			</table>
			
		</div>
		<div class="span2"></div>
	</div>
<script type="text/javascript">
   $(function(){
	   $.ajax({
		   url: "boostraptest/list",
		   type:"Get",
		   data:"page=1&rows=5",
		   success: function(data){
			   if(data!=null){
				   $.each(eval("(" + data + ")"),function(index,item){
					   $(".mainbody").append("<tr>");
					   $(".mainbody").append("<td>"+item.id+"</td>");
					   $(".mainbody").append("<td>"+item.name+"</td>");
					   $(".mainbody").append("<td>"+item.date+"</td>");
					   $(".mainbody").append("</tr>");
				   });
			   }
		   }
	   })
   });
   
   $(".up").click(function(){
	   $(".mainbody").empty();
	   $.ajax({
		   url: "boostraptest/list",
		   type:"Get",
		   data:"page="+2+"&rows=5",
		   success: function(data){
			   if(data!=null){
				   $.each(eval("(" + data + ")"),function(index,item){
					   $(".mainbody").append("<tr>");
					   $(".mainbody").append("<td>"+item.id+"</td>");
					   $(".mainbody").append("<td>"+item.name+"</td>");
					   $(".mainbody").append("<td>"+item.date+"</td>");
					   $(".mainbody").append("</tr>");
				   });
			   }
		   }
	   })
   });
</script>
</body>
</html>