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
			<form action='join' method='post'>
				<div class='form-group row'>
					<label class='col-4 col-form-label' for='username'>USERNAME: </label>
					<div class='col'>
						<input type='text' class='form-control mb-2' required autofocus name='username'>
					</div>
				</div>
				<div class='form-group row'>
					<label class='col-4 col-form-label' for='password'>PASSWORD: </label>
					<div class='col'>
						<input type='password' class='form-control mb-2' required name='password'>
					</div>
				</div>
				<div class='row'>
					<div class='col'>
						<button type='submit' class='btn btn-primary btn-block'>가입하기</button>	
					</div>
				</div>	
			</form>
		</div>
	</div>	
</div>