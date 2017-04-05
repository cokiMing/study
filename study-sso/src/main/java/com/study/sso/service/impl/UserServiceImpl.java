package com.study.sso.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.common.pojo.CommonResult;
import com.study.manager.mapper.UserMapper;
import com.study.manager.pojo.User;
import com.study.sso.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public CommonResult selectByNameAndPwd(String name, String pwd) {
		User user = userMapper.selectByNameAndPwd(name, pwd);
		if(user!=null){		
			return CommonResult.ok(user);	
		}
		return CommonResult.build(400, "Account or password is incorrect!");
	}

}
