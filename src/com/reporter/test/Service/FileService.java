package com.reporter.test.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reporter.test.Entity.FileUploadDownload;

@Service
public interface FileService {
	
	public void insert(FileUploadDownload fud);

	public List<FileUploadDownload> list(String username);

	public FileUploadDownload select(String username);
}
