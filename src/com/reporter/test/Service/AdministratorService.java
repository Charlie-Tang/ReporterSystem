package com.reporter.test.Service;

import org.springframework.stereotype.Service;

import com.reporter.test.Entity.Administrator;

@Service
public interface AdministratorService {
	
	public Administrator login(String name, String password);
}
