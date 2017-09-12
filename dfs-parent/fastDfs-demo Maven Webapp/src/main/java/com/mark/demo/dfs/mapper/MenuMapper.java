package com.mark.demo.dfs.mapper;

import java.util.List;

import com.mark.demo.dfs.anno.MyBatisDao;
import com.mark.demo.dfs.base.GenericMapper;
import com.mark.demo.dfs.entity.Menu;

/*
*hxp(hxpwangyi@126.com)
*2017年9月7日
*
*/
@MyBatisDao
public interface MenuMapper extends GenericMapper<Menu>{
	List<Menu> getMenuTopLever();
	List<Menu> getMenuChildren(int pid);
	void updateMenu(Menu menu);
}
