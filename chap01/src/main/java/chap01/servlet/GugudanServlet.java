package chap01.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	/chap01/gugudan으로 접속하는 사용자들에게
	멋있는 구구단 페이지를 응답하도록 만들어주세요
 */

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setCharacterEncoding("EUC-KR");
		PrintWriter out = resp.getWriter();
		
		
		/*
			이 페이지를 볼 때 당시 웹 브라우저의 URL은
			http://localhost:9000/chap01/gugudan이므로
			올바르게 css파일을 찾아가기 위해서는 해당 주소를 염두에 두고 경로를 설정해야 한다
			href를 ./css/gugudan.css로 설정하면
			결과적으로 찾아가는 전체 주소는 
			http://localhost:9000/chap01/css/gugudan.css가 된다
			서버는 저 주소의 자원을 webapp 아래 폴더에서 찾게 된다
		*/
		out.print("<html><head>");
		out.print("<title>Gugudan</title>");
		out.print("<link rel=\"stylesheet\" href=\"./css/gugudan.css\">");
		out.print("</head><body>");
		out.print("<h3>구구단</h3>");
		out.print("<div id=\"gugudan\"></div>");
		out.print("<script src=\"./js/gugudan.js\"></script>");
		
		
//		out.print("<div style=\"border: solid 1px black;\">");
//		for (int dan = 2; dan <= 9; ++dan) {
//			for (int gop = 1; gop <= 9; ++gop) {
//					out.print(dan + "x" + gop + "=" + dan * gop + " ");
//			}
//			out.print("<br>");
//		}
//		
//		out.print("");
//		out.print("</div>");
		out.print("</body></html>");
		
		
	}
	

}
