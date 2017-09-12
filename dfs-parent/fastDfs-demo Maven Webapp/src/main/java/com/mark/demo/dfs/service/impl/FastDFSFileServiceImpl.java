package com.mark.demo.dfs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mark.demo.dfs.base.GenericServiceImpl;
import com.mark.demo.dfs.entity.FastDFSFile;
import com.mark.demo.dfs.mapper.FastDFSFileMapper;
import com.mark.demo.dfs.service.FastDFSFileService;

/*
*hxp(hxpwangyi@126.com)
*2017年9月12日
*
*/
@Component
public class FastDFSFileServiceImpl extends GenericServiceImpl<FastDFSFile>implements FastDFSFileService {
	private FastDFSFileMapper fastDFSFileMapper;
	
	@Autowired(required=true)
	public FastDFSFileServiceImpl(FastDFSFileMapper dao) {
		super(dao);
		fastDFSFileMapper=dao;
	}
	
}
