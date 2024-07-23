<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie list</title>
</head>
<body>

	<ul>
		<!-- 다운캐스팅하여야 함 -->
		<% for (Cookie cookie : (Cookie[])(request.getAttribute("cookies"))) { %>
			<li><%=cookie.getName() %>=<%=cookie.getValue() %> [<a href="#">삭제</a>] </li>
		<% } %>
	</ul>
	
</body>
</html>