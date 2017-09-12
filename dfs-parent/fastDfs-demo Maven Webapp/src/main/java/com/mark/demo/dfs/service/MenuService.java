package com.mark.demo.dfs.service;

import java.util.List;

import com.mark.demo.dfs.base.GenericService;
import com.mark.demo.dfs.entity.Menu;

/*
*hxp(hxpwangyi@126.com)
*2017年9月7日
*
*/
public interface MenuService extends GenericService<Menu>{
	List<Menu> getMenuTopLever();
	List<Menu> getMenuChildren(int pid);
	boolean updateMenu(Menu menu);
}	
