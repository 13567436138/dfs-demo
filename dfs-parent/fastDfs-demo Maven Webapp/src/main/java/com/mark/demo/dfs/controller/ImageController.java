package com.mark.demo.dfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
*hxp(hxpwangyi@126.com)
*2017年9月13日
*
*/
@Controller
@RequestMapping("/image")
public class ImageController {
	
	@RequestMapping("/list")
	public String list(){
		return "image/list";
	}
}
