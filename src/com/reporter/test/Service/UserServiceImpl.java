package com.reporter.test.Service;

import java.util.List;

import com.reporter.test.Dao.UserDao;
import com.reporter.test.Dao.UserDaoImpl;
import com.reporter.test.Entity.User;

public class UserServiceImpl implements UserService {
	
	private UserDao UserDao;
	
	public UserServiceImpl() {
		UserDao = new UserDaoImpl();
	}
	

	@Override
	public void AddUser(User user) {

		UserDao.AddUser(user);
	}

	@Override
	public User find(String name) {
		
		User user = UserDao.find(name);
		return user;
	}

	@Override
	public User login(String name, String password) {
		
		User user = UserDao.login(name, password);
		return user;
	}

	@Override
	public User login1(String name, String password) {
		
		
		User user = UserDao.login1(name, password);
		return user;
	}

	@Override
	public List<User> list() {
		
		List<User> userlist = UserDao.list();
		return userlist;
	}

	@Override
	public int updateinfo(String name) {
		
		int n = UserDao.updateinfo(name);
		return n;
	}

}
