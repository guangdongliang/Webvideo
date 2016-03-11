package ssh.daoImpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ssh.beans.User;
import ssh.dao.BaseDao;

public class UserDao extends HibernateDaoSupport implements BaseDao {

	@Override
	public boolean register(String userName,String password) throws HibernateException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setUserName(userName);
		user.setPassword(password);
		Serializable a=getHibernateTemplate().save(user);
		return user.getUserId()==0?false:true;
	}

	@Override
	public User findByUserName(String userName,String password) {
		// TODO Auto-generated method stub
		List<User> lUser= (List<User>)getHibernateTemplate().find("from User as user where user.userName=? and user.password=?", new Object[]{ userName,password});
		if (lUser.size() == 1)
		{
			return (User)lUser.get(0);
		}
		return null;
	}
    
}
