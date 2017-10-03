package com.edu.taotao.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月3日
 * @description
 */
@Controller
public class PageController {

	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}

}
