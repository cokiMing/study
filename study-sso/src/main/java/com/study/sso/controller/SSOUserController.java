package com.study.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.common.pojo.CommonResult;
import com.study.common.utils.CookieUtils;
import com.study.manager.pojo.User;
import com.study.sso.service.UserService;

@Controller
@RequestMapping("/sso")
public class SSOUserController {
	
	@Autowired
	private UserService userService;
	/**
	 * 登录到study网
	 * @param name 用户名	
	 * @param password 密码
	 * @param remember 是否记忆
	 * @param response 
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	@ResponseBody
	public CommonResult login(String name,String password,
			@RequestParam(defaultValue="0")int remember,HttpServletResponse response,HttpServletRequest request){	
		CommonResult result = userService.selectByNameAndPwd(name, password);
		if(result.getStatus()==200){		
			if(remember==1){
				CookieUtils.setCookie("token",((User)result.getData()).getName(), response);
			}
		}
		
		return result;
		
	}
}
