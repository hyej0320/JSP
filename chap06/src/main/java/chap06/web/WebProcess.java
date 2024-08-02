package chap06.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 웹 프로젝트의 요청은 항상 일정한 절차를 지니게 된다

// 요청 -> 처리 -> 화면 그리기 (view) -> 응답
// 처리 부분에 대한 구현

public interface WebProcess {
	// 웹 요청에 대한 처리를 하고 나면 항상 우리는 다음 .jsp의 경로를 알아야 한다
	// String을 리턴하고 매개변수로 (request, response)를 받음
	String process(HttpServletRequest request, HttpServletResponse response); 
}
