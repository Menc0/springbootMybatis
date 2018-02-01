package com.cwh.springbootMybatis.service;

import java.util.List;

import com.cwh.springbootMybatis.entity.User;

public interface UserService {
    public List<User> getUserInfo();
    
    public void insert(User user);
}
