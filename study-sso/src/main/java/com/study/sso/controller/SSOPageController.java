package com.study.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 页面跳转
 * @author Coki
 *
 */
@Controller
@RequestMapping("/sso")
public class SSOPageController {
	/*
	 * 默认跳转至login页面
	 */
	@RequestMapping("")
	public String defaultPage(){
		return "login";
	}
	@RequestMapping("/goal")
	public String goalPage(){
		return "setgoal";
	}
}
