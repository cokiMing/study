package com.study.common.utils;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtils {
	
	public static Cookie getCookie(String name,HttpServletRequest request){
		Cookie[] cookies = request.getCookies();
		Map<String,Cookie> map = new HashMap<String,Cookie>();
		
		if(cookies.length>0){		
			for (Cookie cookie : cookies) {
				map.put(cookie.getName(), cookie);
			}
			return map.get(name);
		}
		
		return null;
	}
	
	public static void setCookie(String name,String value,HttpServletResponse response){
		Cookie cookie = new Cookie(name, value);
		//默认设置cookie寿命为3天
		cookie.setMaxAge(3*24*60*60);
		response.addCookie(cookie);
	}
}
