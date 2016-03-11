package ssh.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class BaseServlet extends HttpServlet{

	private ApplicationContext ctx;
	public void init(ServletConfig config)
		throws ServletException
	{
		super.init(config);
		// 获取Web应用中的ApplicationContext实例
		ctx = WebApplicationContextUtils
			.getWebApplicationContext(getServletContext());
	}
	// 返回Web应用中的Spring容器
	public ApplicationContext getCtx()
	{
		return this.ctx;
	}
}
