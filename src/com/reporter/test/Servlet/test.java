package com.reporter.test.Servlet;

import java.util.List;

import com.reporter.test.Entity.FileUploadDownload;
import com.reporter.test.Service.FileService;
import com.reporter.test.Service.FileServiceImpl;

public class test {
	
	private static FileService fileService = new FileServiceImpl();
	
	public static void main(String args[])
	{
		String username = "tom";
		
		List<FileUploadDownload> list = fileService.list(username);
		
		
		for (FileUploadDownload fileUploadDownload : list) {
			
			System.out.println(fileUploadDownload);
		}
		
	}
}
