package com.cwh.springbootMybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cwh.springbootMybatis.entity.User;
import com.cwh.springbootMybatis.mapper.UserMapper;
import com.cwh.springbootMybatis.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
    private UserMapper userMapper;

    public List<User> getUserInfo(){
        return userMapper.findUserInfo();
    }

    //@Transactional开启事务
    @Transactional
	public void insert(User user) {
		userMapper.addUserInfo(user);
		int i=1/0;
		userMapper.addUserInfo(user);
		
	}
}
