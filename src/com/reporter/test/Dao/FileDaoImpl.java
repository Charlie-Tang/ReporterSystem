package com.reporter.test.Dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.reporter.test.Entity.FileUploadDownload;
import com.reporter.test.utils.JDBCUtils;

public class FileDaoImpl implements FileDao {

		QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());

		@Override
		public void insert(FileUploadDownload fud) {// 上传文件

			/*
			 * 
			 * private String id; private String uuidname; //上传文件的名称，文件的uuid名
			 * private String filename; //上传文件的真实名称 private String savepath;
			 * //记住文件的位置 private Date uploadtime; //文件的上传时间 private String
			 * description; //文件的描述 private String username;
			 */
			Object[] param = { fud.getId(), fud.getUuidname(), fud.getFilename(),
					fud.getSavepath(), fud.getDescription(), fud.getUsername() };// 没有时间：fud.getUploadtime()
			try {
				qr.update("insert into file values(?,?,?,?,null,?,?)", param);
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}

		@Override
		public List<FileUploadDownload> list(String username) {// 根据用户登录信息查询文件
			try {
				
				
				String sql = "select * from file where username =?";
				Object[] param = { username};
				List<FileUploadDownload> list = qr.query(sql,param,new BeanListHandler<FileUploadDownload>(FileUploadDownload.class));
				return list;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	 
		@Override
		public FileUploadDownload select(String username) {//通过username获得文件的全部信息
			try {
				String sql = "select * from file where username=?";
				Object[] param = { username};
				FileUploadDownload fud=qr.query(sql,param,new BeanHandler<FileUploadDownload>(FileUploadDownload.class));
				return fud;
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
			}
		}
	}


