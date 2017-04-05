package com.study.sso.service;

import com.study.common.pojo.CommonResult;

public interface UserService {
	CommonResult selectByNameAndPwd(String name,String pwd);
}
