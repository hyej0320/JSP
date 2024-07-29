<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie list</title>
</head>
<body>

	<p>쿠키 값 수정 기능 구현해보기
		(input에 공백이 포함된 채로는 요청을 보내지 않도록 만들어보기)</p>
	<ul>
		<!-- 다운캐스팅하여야 함 -->
		<% for (Cookie cookie : (Cookie[])(request.getAttribute("cookies"))) { %>
			<li>
			<% String cookieName = cookie.getName(); %>
			<%=cookie.getName() %>=<%=cookie.getValue() %>
			<form class = "modi_form" action="./modify" method="GET">
			  <input type="hidden" name="to_modi" value=<%=cookieName%> />
			  [<input type="text" name="modi_value" /> <button id="modi_btn">값 수정</button>]
			</form> 
			[<a href="./delete?cookie-name=<%=cookie.getName()%>">삭제</a>] </li>
		<% } %>
	</ul>
	
	<a href="../cookie_index.jsp">쿠키 인덱스로 가기</a>
</body>
</html>