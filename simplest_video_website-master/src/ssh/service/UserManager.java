package ssh.service;

import ssh.forms.UserForm;

public interface UserManager {
	 public boolean register(String userName,String password);  
	 public int login(String userName,String password);
}
