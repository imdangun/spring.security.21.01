<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.6.3/css/all.css'>

<div class='container'>
	<div class='row mt-5'>
		<div class='col d-flex justify-content-center'>
			<h1 class='mb-3 display-4'>
				<a href='/'><i class='fab fa-affiliatetheme'></i></a>
			</h1>
		</div>
	</div>
	<div class='row'>
		<div class='col d-flex justify-content-center'>
			<form action='login' method='post'> <!-- method='post' 이여야만 한다. -->
				<input type='text' class='form-control mb-2' placeholder='username' required autofocus name='username'> 
				<input type='password' class='form-control mb-2' placeholder='password' required name='password'>			
				<button type='submit' class='btn btn-primary btn-block'>로그인</button>				
			</form>
		</div>
	</div>
	<div class='row'>
		<div class='col d-flex justify-content-center'>
			<c:if test='${!empty param.msg}'>
				${param.msg}
			</c:if>
		</div>
	</div>	
</div>