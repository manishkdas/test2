package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/")
	public String idx() {
		System.out.println("Show() Called.....");
		return "index.jsp";
	}

	@RequestMapping("/hi")
	@ResponseBody
	public String show() {
		System.out.println("Show() Called.....");
		return "<h1>Welcome .....</h1>";
	}
}
