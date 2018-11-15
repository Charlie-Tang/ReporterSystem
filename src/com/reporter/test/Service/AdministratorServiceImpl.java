package com.reporter.test.Service;

import com.reporter.test.Dao.AdministratorDao;
import com.reporter.test.Dao.AdministratorDaoImpl;
import com.reporter.test.Entity.Administrator;

public class AdministratorServiceImpl implements AdministratorService {
	
	private AdministratorDao AdministratorDao;
	
	public AdministratorServiceImpl() {
			
		AdministratorDao = new AdministratorDaoImpl();
	}
	
	
	@Override
	public Administrator login(String name, String password) {
		
		Administrator administrator = AdministratorDao.login(name, password);
		return administrator;
	}

}
