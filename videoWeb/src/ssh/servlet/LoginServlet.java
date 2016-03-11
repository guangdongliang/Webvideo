package ssh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.json.JSONException;
import org.json.JSONObject;

import ssh.forms.UserForm;
import ssh.service.UserManager;
@WebServlet(urlPatterns="/android/login.jsp")
public class LoginServlet extends BaseServlet{

	public void service(HttpServletRequest request ,
			HttpServletResponse response)
			throws IOException , ServletException
		{
		    System.out.println("asdf");
			String userName = request.getParameter("userName");
			String password = request.getParameter("password");

			// 获取系统的业务逻辑组件
			UserManager userManager = (UserManager)getCtx().getBean("userManager");
			// 验证用户登录
			int userId = userManager.login(userName, password);
			response.setContentType("text/html; charset=GBK");
			// 登录成功
			if (userId > 0)
			{
				request.getSession(true).setAttribute("userId" , userId);
			}
			try
			{
				// 把验证的userId封装成JSONObject
				JSONObject jsonObj = new JSONObject()
					.put("userId" , userId);
				// 输出响应
				response.getWriter().println(jsonObj.toString());
			}
			catch (JSONException ex)
			{
				ex.printStackTrace();
			}
		}
}
