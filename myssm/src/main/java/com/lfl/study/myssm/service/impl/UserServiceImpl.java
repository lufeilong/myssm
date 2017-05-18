package com.lfl.study.myssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lfl.study.myssm.dao.UserMapper;
import com.lfl.study.myssm.domain.User;
import com.lfl.study.myssm.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

}
