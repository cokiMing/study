package com.study.manager.mapper;

import org.apache.ibatis.annotations.Param;

import com.study.manager.pojo.User;

public interface UserMapper {
	User selectByNameAndPwd(@Param("name")String name,@Param("pwd")String pwd);
}
