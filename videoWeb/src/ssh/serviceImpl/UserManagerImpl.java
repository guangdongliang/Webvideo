package ssh.serviceImpl;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;

import ssh.beans.User;
import ssh.dao.BaseDao;
import ssh.forms.UserForm;
import ssh.service.UserManager;

public class UserManagerImpl implements UserManager{
	
	private BaseDao dao;
	public void setDao(BaseDao dao){
		this.dao=dao;
	}

	public BaseDao getDao() {
		return dao;
	}

	@Override
	public boolean register(String userName,String password) throws HibernateException {
		// TODO Auto-generated method stub
        return dao.register(userName,password);  
	}

	@Override
	public int login(String userName, String password) {
		// TODO Auto-generated method stub
		User user=dao.findByUserName(userName, password);
		if(user==null)
		{
			return -1;
		}
		return user.userId;
	}
    
}
