<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3># JSP Filter</h3>
	
	<ul>
		<li>필터는 서블릿을 만나기 전에 먼저 거쳐 지나갈 수 있는 객체이다</li>
		<li>특정 주소로 서버에 접속할 때 필터를 거쳐서 서블릿으로 도착하도록 설정할 수 있다</li>
		<li>필터는 하나의 URL에 여러 겹으로 설치해 둘 수 있다</li>
		<li>필터 메서드를 모두 작성하고 난 후 반드시 chain.doFilter()를 호출해 다음 필터로 연결해주어야 한다</li>
	</ul>
	
	<h3>Home.jsp입니다</h3>

	<p>필터에서 추가했던 어트리뷰트 : ${myfilter1}</p>
	
	<ul>
		<c:forTokens var="animal" varStatus="status" items="${animals}" delims="/">
		<li id="${animal}">${status.count}번째 동물: ${animal}</li>
		</c:forTokens>	
	</ul>
	
	<form action="./submit" method="POST">
		이름: <input type="text" name="name"/> <br>
		주소: <input type="text" name="addr"/> <br>
		<input type="submit" value="보내기"/>		

	</form>
</body>
</html>