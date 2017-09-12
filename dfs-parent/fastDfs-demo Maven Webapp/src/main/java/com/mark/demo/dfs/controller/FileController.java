package com.mark.demo.dfs.controller;

import java.io.IOException;

import org.apache.commons.io.FilenameUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mark.demo.dfs.entity.FastDFSFile;
import com.mark.demo.dfs.entity.User;
import com.mark.demo.dfs.service.FastDFSClientWrapper;
import com.mark.demo.dfs.service.FastDFSFileService;

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
	@Autowired
	private FastDFSFileService fastDFSFileService;

	@RequestMapping("/upload")
	@ResponseBody
	public String uploadFile(MultipartFile file) throws IOException{
		String path=dfsClient.uploadFile(file);
		Subject subject=SecurityUtils.getSubject();
		FastDFSFile entity=new FastDFSFile(path, file.getOriginalFilename(),FilenameUtils.getExtension(file.getOriginalFilename()) , file.getSize(), ((User)subject.getPrincipal()).getUserName());
		fastDFSFileService.insert(entity);
		return "ok";
	}
	
	@RequestMapping("/show")
	public void showFile(){
		
	}
}
