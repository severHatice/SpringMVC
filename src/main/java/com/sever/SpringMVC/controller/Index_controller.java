package com.sever.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index_controller{
	
	@RequestMapping("/")//bununla aracilik yapip iletisim sagliyor
	public String Home() {
		return "index";
	}

}
