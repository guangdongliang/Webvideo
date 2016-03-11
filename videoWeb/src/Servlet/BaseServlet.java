package Servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BaseServlet extends HttpServlet{

	private ApplicationContext ctx;
	public void init(ServletConfig config)
		throws ServletException
	{
		super.init(config);
		// ��ȡWebӦ���е�ApplicationContextʵ��
		ctx = WebApplicationContextUtils
			.getWebApplicationContext(getServletContext());
	}
	// ����WebӦ���е�Spring����
	public ApplicationContext getCtx()
	{
		return this.ctx;
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		arg0.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html;charset=UTF-8");
	}
	
	
}
