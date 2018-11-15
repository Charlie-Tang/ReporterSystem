package com.reporter.test.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reporter.test.Entity.User;


@Service
public interface UserService {
	
public void AddUser(User user);
	
	public User find(String name);
	
	//设置为id=1登录时
	public User login(String name, String password);
	
	//设置为id=0工作时
	public User login1(String name, String password);
	
	//将未审核的注册用户信息显示出来
		//在数据库中为空的值是用where key is null来查询的
	public List<User> list();
	
	//修改用户id
	public int updateinfo(String name);
}
