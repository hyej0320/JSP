package chap02.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form/answer")
public class EverlandServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {	
		
		String adultTicket = req.getParameter("adultTicket");
		String teenTicket = req.getParameter("teenTicket");
		String kidTicket = req.getParameter("kidTicket");
		String adultQty = req.getParameter("adultQty");
		String teenQty = req.getParameter("teenQty");
		String kidQty = req.getParameter("kidQty");
		
		System.out.println("-------구매 현황------");
		System.out.println("대인 " + adultTicket + ", " + adultQty + "장");
		System.out.println("청소년 " + teenTicket + ", " + teenQty + "장");
		System.out.println("소인/경로 " + kidTicket + ", " + kidQty + "장");

		
		
	}
}
