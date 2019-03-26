package com.hxxCommunity.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @Title: TestC.java 
 * @Package: com.hxxCommunity.controllers
 * @Description: 测试专用类
 * @author: luolight
 * @date: 2019年3月26日 下午1:59:19  
 * @version 0.1
 */

@Controller
@RequestMapping(value = "/test", produces = "application/json;charset=UTF-8", method = RequestMethod.POST)
@ResponseBody
public class TestC {

	@RequestMapping("/test")
	public String tests() {
		return "test";
	}
	
	@RequestMapping("/setSession")
	public String setSession(String name, String value, HttpServletRequest request) {
		request.getSession().setAttribute(name, value);
		return request.getSession().getId();
	}
	
	@RequestMapping("/getSession")
	public Object getSession(String name, HttpServletRequest request) {
		return request.getSession().getAttribute(name);
	}
	
	@RequestMapping("/tst1")
	public String tests2() {
		return "test2";
	}
}
