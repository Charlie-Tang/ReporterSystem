package com.reporter.test.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

//文件上传之后的信息记录
@Entity(name ="file")
public class FileUploadDownload {
	
	
	private String id;
	private String uuidname; // 上传文件的名称，文件的uuid名
	private String filename; // 上传文件的真实名称
	private String savepath; // 记住文件的位置
	private Date uploadtime; // 文件的上传时间
	private String description; // 文件的描述
	private String username;// 上传者

	public FileUploadDownload() {
	}

	public FileUploadDownload(String id, String uuidname, String filename, String savepath, Date uploadtime,
			String description, String username) {
		super();
		this.id = id;
		this.uuidname = uuidname;
		this.filename = filename;
		this.savepath = savepath;
		this.uploadtime = uploadtime;
		this.description = description;
		this.username = username;
	}
	
	@Id
	@Column(name="id",nullable=false,length=32,unique=true)
	@GenericGenerator(name="generator",strategy="uuid.hex")
	@GeneratedValue(generator="generator")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Column(name="uuidname",length=255)
	public String getUuidname() {
		return uuidname;
	}

	public void setUuidname(String uuidname) {
		this.uuidname = uuidname;
	}
	@Column(name="filename",length=255)
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Column(name="savepath",length=255)
	public String getSavepath() {
		return savepath;
	}

	public void setSavepath(String savepath) {
		this.savepath = savepath;
	}
	@Column(name="uploadtime",length=255)
	public Date getUploadtime() {
		return uploadtime;
	}

	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}
	@Column(name="description",length=255)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="username",length=255)
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

}
