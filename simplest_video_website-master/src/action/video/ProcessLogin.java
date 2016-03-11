package action.video;

import javax.servlet.http.HttpSession;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import ssh.beans.User;

public class ProcessLogin extends ActionSupport{

	public User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("用户1"+user.password+user.userName);
		if((user.userName.equals("13667257846"))&&(user.password.equals("13667257846")))
		{
			System.out.println("用户"+user.password+user.userName);
			ActionContext.getContext().getSession().put("userId", "13667257846");
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
	
	

}
