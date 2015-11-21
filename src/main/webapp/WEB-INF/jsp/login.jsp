<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="/CSS/myLoginBootstrap.css" >

<form class="form-signin" role="form" action="/j_spring_security_check"
 method="POST" >
	<h2 class="form-signin-heading">Please sign in</h2>
	<input type="text" name="j_username" class="form-control"
		placeholder="Name" required autofocus>
	 <input type="password" name="j_password" class="form-control"
		placeholder="Password" required>
	
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
		in</button>
</form>