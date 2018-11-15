package com.reporter.test.Service;

import java.util.List;

import com.reporter.test.Service.FileService;
import com.reporter.test.Dao.FileDao;
import com.reporter.test.Dao.FileDaoImpl;
import com.reporter.test.Entity.FileUploadDownload;

public class FileServiceImpl implements FileService {
	
	private FileDao FileDao;
	
	public FileServiceImpl()
	{
		FileDao = new FileDaoImpl();
	}
	
	
	@Override
	public void insert(FileUploadDownload fud) {
		
		FileDao.insert(fud);
	}

	@Override
	public List<FileUploadDownload> list(String username) {
		
		List<FileUploadDownload> list = FileDao.list(username);
		return list;
	}

	@Override
	public FileUploadDownload select(String username) {
		
		FileUploadDownload fud = FileDao.select(username);
		return fud;
	}

}
