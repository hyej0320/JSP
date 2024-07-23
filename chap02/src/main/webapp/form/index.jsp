<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<h3># &lt;form&gt;</h3>
	
	<ul>
		<li>&lt;form&gt;내부의 &lt;input&gt;들의 데이터를 모아서 서버로 가는
			요청에 함께 실어 보낼 수 있는 태그</li>
		<li>실어보낸 데이터는 서버 측의 요청 객체(HttpServletRequest)에서 확인할 수 있다</li>
		<li>데이터는 key/value 방식으로 전송된다</li>
		<li>&lt;input&gt;의 name 속성 값이 key 역할을 한다</li>
		<li>&lt;input&gt;의 value 속성 값이 value 역할을 한다</li>
		<li>&lt;form&gt;의 action 속성은 해당 폼 내부에서 submit이 발생했을 때
			데이터와 함께 요청할 URL을 적는 곳이다</li>
		<li>&lt;form&gt;의 method 속성은 요청 방식(GET, POST)을 설정하는 곳이다</li>		
	</ul>
	
	<h3># GET 방식 요청</h3>
	
	<ul>
		<li>&lt;form&gt;의 method 속성값에 따라 요청을 보내는 방식이 달라진다</li>
		<li>GET 방식으로 form 요청을 보내면 데이터가 다음과 같이 주소창에 보이면서 전송된다
			?name1=value1&name2=value2...</li>
		<li>GET 방식은 모든 데이터가 주소창에 노출되기 때문에 비밀번호 같은 민감한 데이터들을
			전송하기에는 적합하지 않다</li>
		<li>또한 URL 길이에 제한이 있기 때문에 너무 많은 양의 데이터는 GET방식으로 전송할 수 없다
			(e.g. 글 내용 등)</li>
	</ul>
	
	<h3># POST 방식 요청</h3>
	
	<ul>
		<li>POST 방식은 선택한 데이터가 주소창에 노출되지 않으면서 요청과 함께 전달된다</li>
		<li>POST 방식 전송 시 데이터는 길이의 제한이 없다</li>
		<li>비밀번호 같은 민감한 데이터가 노출되지 않아 GET방식보다는 안전하다</li>
	</ul>
	
	<h3># 서버로 데이터와 함께 요청 보내기(GET)</h3>
	
	<form action="http://localhost:9000/chap02/fshop" method="GET">
		<input type="text" name="fname" placeholder="과일 이름을 입력해주세요"/> <br>
		<input type="number" name="fprice" value="1000" step="100"/> <br>
		<input type="submit" value="보내기"/>
	</form>
	
	<h3># 서버로 데이터와 함께 요청 보내기(POST)</h3>
	
	<!-- 현재 위치가 http://localhost:9000/chap02/form/index.jsp 이므로 -->
	<form action="../fshop" method="POST">
		<input type="color" name="fcolor"/> <br>
		<input id="apple" type="radio" name="fname" value="apple"> 
		<label for="apple">사과</label>
		<input id="watermelon" type="radio" name="fname" value="watermelon"> 
		<label for="watermelon">수박</label>
		<input id="strawberry" type="radio" name="fname" value="strawberry"> 
		<label for="strawberry">딸기</label>
		<input id="grapefruit" type="radio" name="fname" value="grapefruit"> 
		<label for="grapefruit">자몽</label><br>
		<input type="submit" value="보내기"/>
	</form>
	
	<h3># 다른 JSP파일로 요청 보내보기</h3>
	
	<p>JSP와 서블릿은 실제로 거의 같은 것이다. 
		다만 JSP는 html을 작성하기에 더 편하고, 서블릿은 java코드를 작성하기에 더 편하다</p>
		
	<form action="./pizzaOrder.jsp" method="GET">
		토핑:
		<select name="topping">
			<option value="pe">치즈</option>
			<option value="pe">마르게리따</option>
			<option value="pe">페퍼로니</option>
			<option value="ha">하와이안</option>
			<option value="ss">슈퍼슈프림</option>
		</select>
		
		<input type="submit" value="주문하기" />
	</form>

	<h3># checkbox 등으로 하나의 name을 여러 개 선택하는 경우</h3>
	
	<!-- 
		현재 위치가 http://localhost:9000/chap02/form/index.jsp이므로
		그냥 /는 http://localhost:9000/를 의미하게 된다
		/baskin31은 http://localhost:9000/baskin31을 의미하게 되고
		/chap02/baskin31 은 http://localhost:9000/chap02/baskin31을 의미한다
	 -->
	
	<form action="/chap02/baskin31" method="GET">
		<b> 좋아하는 맛을 모두 고르세요♥</b> <br>
		<input type="checkbox" name="iflavor" value="berry" />베리베리스트로베리<br>
		<input type="checkbox" name="iflavor" value="almond" />아몬드봉봉<br>
		<input type="checkbox" name="iflavor" value="halloween" />마법사의 할로윈<br>
		<input type="checkbox" name="iflavor" value="applemint" />애플민트<br>
		<input type="checkbox" name="iflavor" value="alien" />엄마는 외계인<br>
		<input type="submit" value="고르기!" />
	</form>
</body>
</html>