package com.cwh.springbootMybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cwh.springbootMybatis.entity.User;
import com.cwh.springbootMybatis.service.UserService;
  
@RestController  
@RequestMapping("/user")  
public class UserController {  
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUserInfo")
    public List<User> getUserInfo() {
		List<User> user = userService.getUserInfo();
        System.out.println(user.toString());
        return user;
    }
	
	@RequestMapping("/addUserInfo")
    public String addUserInfo() {
		User user = new User();
		user.setId(3L);
		user.setName("cwh");
		userService.insert(user);
        return "success:"+user.toString();
    }
	
	
}  
