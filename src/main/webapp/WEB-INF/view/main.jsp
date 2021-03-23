<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<link rel='stylesheet' href='http://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css'>
<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.6.3/css/all.css'>

<style>
.jumbotron {
	padding: 1rem;
}
</style>

<div class='container'>
	<div class='jumbotron'>
		<div class='row'>
			<div class='col-1'>
				<h1 class='mb-3 display-4'>
					<a href='/'><i class='fab fa-affiliatetheme'></i></a>
				</h1>
			</div>
			<div class='col'>				
				<h1>Spring Security</h1>
			</div>
		</div>
		<div class='row'>
			<div class='col'>
				<div class='col d-flex justify-content-end'>
					<c:choose>
						<c:when test='${empty username}'>
							<a href='user/join'>회원가입</a> &nbsp; &nbsp;
							<a href='loginIn'>로그인</a>
						</c:when>
						<c:otherwise>
							${username}님, 환영합니다. &nbsp; &nbsp;
							<a href='user/logout'>로그아웃</a>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	
	<div class='row'>
		<div class='col'>
			<a href='article'>기사 보기</a>
		</div>
	</div>
</div>