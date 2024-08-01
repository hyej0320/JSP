package chap08.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

// ServletContextListener: Context를 로딩할 때 호출되는 이벤트 리스너
public class ContextLoaderListener implements ServletContextListener {

	// context가 초기화 될 때 호출되는 메서드
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 리스너에서 application 객체를 호출하여 어트리뷰트를 실어놓는 것이 가능하다
		sce.getServletContext().setAttribute("user_id", "hr");
		System.out.println(this.getClass().getTypeName() + ": 컨텍스트가 초기화되는 중입니다...");
	}
	
	// context가 메모리 상에서 지워질 때 호출되는 메서드
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("서블릿 컨텍스트가 메모리에서 해제되었습니다....");
	}
}
