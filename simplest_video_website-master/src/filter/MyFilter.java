package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter implements Filter {

private String encoding="";
private boolean enable=false;
public void destroy() {
}
public void doFilter(ServletRequest arg0, ServletResponse arg1,FilterChain arg2) throws IOException, ServletException {
		arg0.setCharacterEncoding("utf-8");
		HttpServletRequest hSRequest=(HttpServletRequest)arg0;
		HttpSession session=hSRequest.getSession(true);
		String userId=(String) session.getAttribute("userId");
		if((userId!=null&&userId.equals("13667257846"))||hSRequest.getRequestURI().endsWith("Login.action"))
		{
			arg2.doFilter(arg0, arg1);
			return;
		}
		else
		{
			((HttpServletResponse)arg1).sendRedirect("Login.action");
			return;
		}
		}

public void init(FilterConfig config) throws ServletException {
}

}
