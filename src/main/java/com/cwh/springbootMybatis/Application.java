package com.cwh.springbootMybatis;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cwh.springbootMybatis.controller.UserController;
import com.cwh.springbootMybatis.service.UserService;
import com.cwh.springbootMybatis.service.impl.UserServiceImpl;

@SpringBootApplication
//add by test
public class Application implements CommandLineRunner{

	@Autowired
    DataSource dataSource;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
	/**
	 * 查看用了什么数据库连接池
	 */
//	add by test2
	public void run(String... args) throws Exception {
        System.out.println("DATASOURCE = " + dataSource);
    }
}
