<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link href="/css/bootstrap.min.css" rel="stylesheet" media="screen" />
<link href="/css/bootstrap-responsive.min.css" rel="stylesheet" />
<link href="/css/loginextends.css" rel="stylesheet" />
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/common.js"></script>
<title>登录到爱学网</title>
<jsp:include page="navbar.jsp" />
</head>
<body>
    <div class="container indexbg">
    <div class="row corner">
    <div class="span12" style="height: 180px">
    </div>
    </div>
       <div class="row">
		<div class="span2"></div>
		<div class="span5 offset9">
		<form id="formLogin">	
			<table class="table table-bordered">
				<thead >
					<tr>
					<th colspan="2">Login to LoveStudy</th>
					</tr>
				</thead>
				<tbody class="mainbody">
				     <tr>
				     <td style="width:120px" class="no-part-border123">ACCOUNT</td>
				     <td class="no-part-border341">
				     <input type="text" name="name" id="nameid" 
				     data-toggle="popover" data-title="LOOK HEAR!" data-content="username can't be null!"
				     placeholder="Type Your Account"/>
				     </td>
				     </tr>
				     <tr>
				     <td style="width:120px" class="no-part-border12">PASSWORD</td>
				     <td class="no-part-border41">
				     <input type="password" name="password" id="passwordid" placeholder="Type Your Password"/>
				     </td>
				     </tr>
				     <tr><td colspan="2" class="no-part-border123" style="text-align: left !important"  >
				     <input type="checkbox" checked="checked" name="remember" value="1"
				     data-toggle="tooltip"  data-placement="left"  data-trigger="hover" title="please don't check this option in public occations"/>
				     <font >&nbsp;&nbsp;Remember me in 3 days</font></td></tr>
				     <tr>
				      <td colspan="2">
				        <button class="btn btn-primary btn-large no-part-border4"
				          type="button" style="width: 200px" id="login">Login</button>
				        <a>register now!</a>  
				      </td>
				     </tr>				     
				</tbody>
			</table>
		</form>
		</div>
		<div class="span5">
		  <jsp:include page="commonwindows.jsp" />	
		</div>
	</div>
    </div>
<script type="text/javascript">
   var LOGIN = {
		   logincheck:function(){
			   var html = " <p style='font-size: 20px !important;'>Account or password is Null!</p>";
			   if($("#nameid").val()=="" || $("#passwordid").val()==""){
				   $('.modal-body').html(html);
				   $('#myModal').modal('show');
				   return false;
			   }
			   return true;
		   },
		   login:function(){
			   $.post("/sso/login",$("#formLogin").serialize(),function(data){
				   if(data.status == 200){
					   var html="<p style='font-size: 20px !important;'>Login Success!</p>";
					   $('.modal-body').html(html);
					   $('#myModalLabel').text("Success!");
					   $('#myModal').modal('show');
					   location.href = "/sso/goal";
				   }
				   if(data.status == 400){
					   var html="<p style='font-size: 20px !important;'>"+data.msg+"</p>"
					   $('.modal-body').html(html);
					   $('#myModalLabel').text("Login Failed!");
					   $('#myModal').modal('show');
				   }
			   });
		   }
   }
   $(function(){
	   if(getCookie('token')!=null){
		   var html="<p style='font-size: 20px !important;'>Login Success!</p>";
		   $('.modal-body').html(html);
		   $('#myModalLabel').text("Login..Please Wait");
		   $('#myModal').modal('show');
		   sleep(2000);
		   location.href = "/sso/goal";
	   }
	   $("#login").click(function(){
		   if(LOGIN.logincheck()){		   
		      LOGIN.login();
		   }
	   });
	   window.onkeydown=function(){
	　　 if(13 == event.keyCode){
		   if(LOGIN.logincheck()){		   
		       LOGIN.login();
		    }
	　　   }
	　　} 
   });
</script>
</body>
</html>