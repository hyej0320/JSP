package chap04.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login/*")
public class LoginServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String cmd = uri.substring("/chap04/login/".length());
		
		System.out.println("url: " + req.getRequestURL());
		System.out.println("uri: " + uri);
		System.out.println("cmd: " + cmd);
		
		HttpSession session = req.getSession();
		if (cmd.equals("success")) {
			session.setAttribute("user", "김민수");
			resp.sendRedirect("/chap04/login/result");
		} else if (cmd.equals("result")) {
			req.getRequestDispatcher("/session/session_ex.jsp").forward(req, resp);
		}
	}
}
