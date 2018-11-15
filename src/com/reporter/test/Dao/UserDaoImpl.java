package com.reporter.test.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mysql.fabric.xmlrpc.base.Params;
import com.reporter.test.Entity.User;
import com.reporter.test.utils.JDBCUtils;

public class UserDaoImpl implements UserDao {

QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
	
	//添加
	public void AddUser(User user){
		   try{
				String sql = "insert into user(name,password) values(?,?)";
				Object params[] = {user.getName(),user.getPassword()};
				System.out.println("添加用户成功！");
				runner.update(sql, params);
			}catch (Exception e) {
				System.out.println("添加用户失败！");
				throw new RuntimeException(e);
			}
		}
	
	//查找是否存在用户
		public User find(String name){
		   try{
				String sql = "select * from user where name= ?";
				System.out.println("查找成功!");
				
				User user = (User) runner.query(sql,name, new BeanHandler(User.class));
				return user;
			}catch (Exception e) {
				System.out.println("查找失败!");
				throw new RuntimeException(e);
			}
		}
	
	//设置为id=1登录时
	public User login(String name, String password) {
		List<User> infoList=null;
		try{
			
			String sql="select * from user where id =? and name=? and password=? ";
			Object params[] = {1,name,password};
//			infoList=(List<User>)runner.query(sql, params, new BeanHandler(User.class));getClass();
//			
//			if(infoList.size())
			
			return (User)runner.query(sql, params, new BeanHandler(User.class));
		
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//设置为id=0工作时
	public User login1(String name, String password) {
		try{
			
			String sql="select * from user where id is null and name=? and password=? ";
			Object params[] = {name,password};
			return (User)runner.query(sql, params, new BeanHandler(User.class));
		
		
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//将未审核的注册用户信息显示出来
	//在数据库中为空的值是用where key is null来查询的
	public List<User> list()
	{
		
		try {
			String sql = "select * from user where id is null";
			Object[] params = {};
			
			
			List<User> userlist = new ArrayList<User>();
			userlist= (List<User>)runner.query( sql,new BeanListHandler<User>(User.class));
			 return userlist;
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	//修改用户id
	public int updateinfo(String name)
	{
		try {
			
			String sql = "update user set id =1 where name =?";
			Object [] params = {name};
			
			int userlist =runner.update(sql,params);
			
			return userlist;
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);
		}
	}

}
