package ssh.dao;

import java.util.List;

import org.hibernate.HibernateException;

import ssh.beans.User;

public interface BaseDao {
	public boolean register(String userName,String password) throws HibernateException;  
	public User findByUserName(String userName,String password);
}
