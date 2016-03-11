package ssh.forms;

public class UserForm {

	public String userName;  
    public String password;  
    public int gender;  
  
    
    public UserForm(String userName, String password, int gender) {
		super();
		this.userName = userName;
		this.password = password;
		this.gender = gender;
	}

	public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String username) {  
        this.userName = username;  
    }  
  
    public String getPassword() {  
        return password;  
    }  
  
    public void setPassword(String password) {  
        this.password = password;  
    }  
  
    public int getGender() {  
        return gender;  
    }  
  
    public void setGender(int gender) {  
        this.gender = gender;  
    }  
  
}
