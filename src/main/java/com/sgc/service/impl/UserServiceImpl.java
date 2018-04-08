package com.sgc.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.sgc.mapper.UserMapper;
import com.sgc.model.User;
import com.sgc.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int addUser(User user) {
		return userMapper.insert(user);
	}

	@Override
	public Page<User> findAllUser(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		Page<User> userList = userMapper.selectAllUser() ;
		return userList;
	}

}
