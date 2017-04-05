<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="/css/bootstrap.min.css" rel="stylesheet" media="screen" />
<link href="/css/bootstrap-responsive.min.css" rel="stylesheet" />
<link href="/css/loginextends.css" rel="stylesheet" />
<script type="text/javascript" src="/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="/js/bootstrap.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<title>Set Your Goal!</title>
<style type="text/css">
.tablesize{
   margin-top:100px;
   width: 500px !important;
   background-image: url("/img/bgpic.jpg");
}
</style>
</head>
<body>
  <jsp:include page="navbar.jsp" />
  <form id="goalform">
    <table class="table tablesize table-bordered" align="center">
    <thead>
       <tr><th>SET YOUR GOAL</th></tr>
    </thead>
       <tr>
         <td>I plan to study&nbsp;
         <input type="text" placeholder="?" style="max-width: 50px" name="dhour" value="3" id="dhourid">&nbsp;
          hours everyday</td>
       </tr>
       <tr>
         <td>I plan to study &nbsp;
         <input type="text" placeholder="?" style="max-width: 50px" name="whour" value="21" id="whourid">&nbsp; 
         hours everyweek</td>
       </tr>
       <tr>
         <td>I plan to study &nbsp;
         <input type="text" placeholder="?" style="max-width: 50px" name="mhour" value="90" id="mhourid">&nbsp; 
         hours everymonth</td>
       </tr>
       <tr><td><button class="btn btn-large" id="goalSubmit">Submit</button></td></tr>
    </table>
     <jsp:include page="commonwindows.jsp" />	
	</form>
<script type="text/javascript">
 var GOALFORM = {
		 formcheck: function(){
			 if($("#dhourid").val()==""){
				 var html="<p style='font-size: 20px !important;'>day hour can't be null!</p>";
				   $('.modal-body').html(html);
				   $('#myModal').modal('show');
				 return false;
			 }
			 if($("#whourid").val()==""){
				 var html="<p style='font-size: 20px !important;'>week hour can't be null!</p>";
				   $('.modal-body').html(html);
				   $('#myModal').modal('show');
				 return false;
			 }
			 if($("#mhourid").val()==""){
				 var html="<p style='font-size: 20px !important;'>month hour can't be null!</p>";
				   $('.modal-body').html(html);
				   $('#myModal').modal('show');
				 return false;
			 }
			 return true;
		 },
         setGoal:function(){
        	 $.post("/sso/setgoal",$("#goalform").serialize(),function(data){
        		 if(data.status==200){
        			 var html="<p style='font-size: 20px !important;'>Login Success!</p>";
					   $('.modal-body').html(html);
					   $('#myModalLabel').text("Success!");
					   $('#myModal').modal('show');
        		 }
        		 if(data.status==400){
        			 var html="<p style='font-size: 20px !important;'>"+data.msg+"</p>"
					   $('.modal-body').html(html);
					   $('#myModalLabel').text("Login Failed!");
					   $('#myModal').modal('toggle');
        		 }
        	 });
         },
		 doSubmit:function(){
			 if(this.formcheck()){
				 this.setGoal();
			 }
		 }
 }
   $("#goalSubmit").click(function(){
	   GOALFORM.doSubmit();
   });


</script>
</body>
</html>