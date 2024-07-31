package chap06.webprocess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import chap06.dao.OjdbcConnection;
import chap06.dto.Employee;
import chap06.web.WebProcess;

public class EmpUpdateFormProcess implements WebProcess {
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) {
		OjdbcConnection ojdbc = 
				(OjdbcConnection)request.getServletContext().getAttribute("ojdbc");
		String sql = "SELECT * FROM employees2 WHERE employee_id = ?";
		
		try(
			Connection conn = ojdbc.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);

		){
			pstmt.setInt(1, Integer.parseInt(request.getParameter("employee_id")));
			
			try (ResultSet rs = pstmt.executeQuery()){
				rs.next();
				request.setAttribute("emp", new Employee(
							rs.getInt("employee_id"),
							rs.getString("first_name"),
							rs.getString("last_name"),
							rs.getString("job_id"),
							rs.getDouble("salary"),
							rs.getDouble("commission_pct"),
							rs.getInt("department_id")
						));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "/emp/update_form";
	}
}
