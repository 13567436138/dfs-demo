package com.mark.demo.dfs.mapper;

import java.util.List;

import com.mark.demo.dfs.anno.MyBatisDao;
import com.mark.demo.dfs.base.GenericMapper;
import com.mark.demo.dfs.entity.Menu;
import com.mark.demo.dfs.entity.User;

/*
*hxp(hxpwangyi@126.com)
*2017年9月5日
*
*/
@MyBatisDao
public interface UserMapper extends GenericMapper<User>{
	User getUserByUserName(String name);
	List<Menu> getMenuTopLever();
}
