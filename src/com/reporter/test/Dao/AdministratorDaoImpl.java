package com.reporter.test.Dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.reporter.test.Entity.Administrator;
import com.reporter.test.utils.JDBCUtils;

public class AdministratorDaoImpl implements AdministratorDao {
	
	
	
	QueryRunner runner = new QueryRunner(JDBCUtils.getDataSource());
	
	@Override
	public Administrator login(String name, String password) {
		try{
			
			String sql="select * from administrator where name=? and password=? ";
			
			Object params[] = {name,password};
			
			Administrator administrator = (Administrator)runner.query(sql, params, new BeanHandler(Administrator.class));
			
			return administrator;
			
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
