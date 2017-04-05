package com.study.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author Coki
 * 页面跳转
 */
@Controller
public class PageController {
	/*
	 * 默认跳转至index页面
	 */
	@RequestMapping("/")
	public String defaultPage(){
		return "index";
	}
	/*
	 * 跳转至指定页面
	 */
	@RequestMapping("/{page}")
	public String refPage(@PathVariable String page){
		return page;
	}
	
}
