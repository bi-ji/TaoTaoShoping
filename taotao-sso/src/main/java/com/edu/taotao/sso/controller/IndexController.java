package com.edu.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月8日
 * @description
 */
@Controller
public class IndexController {

	@RequestMapping("/")
	@ResponseBody
	public String login() {
		return "welocome sso login page";
	}

}
