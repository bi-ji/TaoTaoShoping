package com.edu.taotao.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月6日
 * @description
 */
@Controller
public class TestController {

	@RequestMapping(value = "/test")
	@ResponseBody
	public String test() {
		return "hello";
	}

}
