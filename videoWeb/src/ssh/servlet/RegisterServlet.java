package ssh.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import ssh.service.UserManager;

@WebServlet(urlPatterns="/android/register.jsp")
public class RegisterServlet extends BaseServlet{


	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("register");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		// 获取系统的业务逻辑组件
		UserManager userManager = (UserManager)getCtx().getBean("userManager");
					try
					{
						// 把验证的userId封装成JSONObject
						JSONObject jsonObj = new JSONObject().put("result" , userManager.register(userName, password));
						// 输出响应
						response.getWriter().println(jsonObj.toString());
						response.getWriter().print("aaa");
						System.out.println("成功输出");
					}
					catch (JSONException ex)
					{
						ex.printStackTrace();
					}
	}

	
}
