package com.mark.demo.dfs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mark.demo.dfs.base.GenericServiceImpl;
import com.mark.demo.dfs.entity.FastDFSFile;
import com.mark.demo.dfs.mapper.ImageMapper;
import com.mark.demo.dfs.service.ImageService;

/*
*hxp(hxpwangyi@126.com)
*2017年9月14日
*
*/
@Component
public class ImageServiceImpl extends GenericServiceImpl<FastDFSFile> implements ImageService {
	private ImageMapper imageMapper;
	
	@Autowired(required=true)
	public ImageServiceImpl(ImageMapper dao) {
		super(dao);
		this.imageMapper=dao;
	}

	
	
}
