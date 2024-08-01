package chap08.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

// ServletRequestListener : 요청이 발생할 때마다 호출되는 리스너
public class MyServletRequestListener implements ServletRequestListener{

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("MyServletRequestListener: 요청이 도착한 이벤트를 캐치한 시점");
	
		// 어플리케이션 객체 뿐만 아니라 요청 객체에도 접근할 수 있는 이벤트
		ServletContext application = sre.getServletContext();
		ServletRequest request = sre.getServletRequest();
		
		System.out.println("application: " + application);
		System.out.println("request: " + request);
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("MyServletRequestListener: 해당 요청이 소멸되는 시점");
	}
}
