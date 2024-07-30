package chap07.webprocess;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chap07.web.WebProcess;

// 간단하게 보내기만 하는 프로세스
public class JstlIndexProcess implements WebProcess{
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("favSnack", "감자칩");
		request.setAttribute("animals", new String[] {"강아지", "고양이", "호랑이", "여우", "토끼", "소", "닭"});
		
		
		return "/jstl/index";
	}
}
