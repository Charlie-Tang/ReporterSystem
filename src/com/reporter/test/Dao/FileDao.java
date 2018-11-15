package com.reporter.test.Dao;

import java.util.List;


import com.reporter.test.Entity.FileUploadDownload;

//dao接口
public interface FileDao {
	
	public void insert(FileUploadDownload fud);

	public List<FileUploadDownload> list(String username);

	public FileUploadDownload select(String username);
}