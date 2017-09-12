package com.mark.demo.dfs.entity;

import com.mark.demo.dfs.base.GenericEntity;
import com.mark.demo.dfs.constant.FileManagerConfig;

/*
*hxp(hxpwangyi@126.com)
*2017年9月12日
*
*/
public class FastDFSFile extends GenericEntity{
	private String path;
    private String name;
    private String ext;
    private long length;
    private String author = FileManagerConfig.FILE_DEFAULT_AUTHOR;
    
    public FastDFSFile(String path, String ext) {
        this.path = path;
        this.ext = ext;
    }

    public FastDFSFile(String path, String name, String ext) {
    	this.path = path;
        this.name = name;
        this.ext = ext;
    }

    public FastDFSFile(String path, String name, String ext, long length,
            String author) {
    	this.path = path;
        this.name = name;
        this.ext = ext;
        this.length = length;
        this.author = author;
    }
    
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExt() {
		return ext;
	}
	public void setExt(String ext) {
		this.ext = ext;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}
    
    
}
