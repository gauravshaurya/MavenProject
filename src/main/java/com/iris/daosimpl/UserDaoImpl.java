package com.iris.daosimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.iris.daos.UserDao;
import com.iris.models.User;
import com.iris.utility.SessionFactoryProvider;

public class UserDaoImpl implements UserDao {

	SessionFactory sf=SessionFactoryProvider.getSessionFactory();
	
	public boolean registerUser(User uObj) {
		try {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.save(uObj);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public User loginUser(int userId, String password) throws Exception { 
		
			Session session=sf.openSession();
			User userObj=session.get(User.class,userId);
		if(userObj==null) {
			return null;
		}
		else {
			String s=userObj.getPassword();
				if(s.contentEquals(password)) {
					return userObj;
				}
			}
			
		return null;
	}

	public User getUser(int userId) {
		try {
			Session session=sf.openSession();
			User user=session.get(User.class,userId);
			return user;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}
	
	public List<User> getAllUsers() {
		try {
			Session session=sf.openSession();
			Query<User> query=
					session.createQuery("from com.iris.models.User");
			List<User> userList=query.list();
			return userList;
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
	}

	public boolean deleteUser(int userId) throws Exception {
		Session session=sf.openSession();
		
		User userObj=session.get(User.class,userId);
		Transaction tx=session.beginTransaction();
		
		if(userObj==null) {
			return false;
		}
		else {
			session.delete(userObj);
			tx.commit();
			session.close();
			return true;
		}
		
	}
	
	public boolean updateUser(User obj)  {
		try {
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.merge(obj);
		tx.commit();
		session.close();
		return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}