package com.reporter.test.Dao;

import com.reporter.test.Entity.Administrator;

public interface AdministratorDao {
	
	public Administrator login(String name, String password);
}
