package com.example.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author zhou
 * date 2017年3月9日 下午12:42:18
 * version 1.0
 */
@Controller
public class JspController {

	@RequestMapping("/jspController")
	public String index(Map<String,Object> map){
		map.put("name", "JSP");
		return "index";
	}
}
