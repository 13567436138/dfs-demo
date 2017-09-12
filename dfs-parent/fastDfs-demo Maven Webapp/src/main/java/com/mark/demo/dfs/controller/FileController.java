package com.mark.demo.dfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mark.demo.dfs.service.FastDFSClientWrapper;

/*
*hxp(hxpwangyi@126.com)
*2017年9月12日
*
*/
@Component
@RequestMapping("/admins/file")
public class FileController {
	
	@Autowired
	private FastDFSClientWrapper dfsClient;

	@RequestMapping("/upload")
	@ResponseBody
	public String uploadFile(){
		return null;
	}
	
	@RequestMapping("/show")
	public void showFile(){
		
	}
}
