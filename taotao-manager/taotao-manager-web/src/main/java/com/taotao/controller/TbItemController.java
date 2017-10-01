package com.taotao.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.taotao.common.pojo.ItemListVO;
import com.taotao.pojo.TbItem;
import com.taotao.service.ITbItemService;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月1日
 * @description 
 */
@Controller
public class TbItemController {

	@Autowired
	private ITbItemService tbItemService;
	
	@RequestMapping(value = "/item/findOne/{id}",method = RequestMethod.GET)
	@ResponseBody
	public TbItem findById(@PathVariable Long id) throws Exception{
		return tbItemService.findOne(id);
	}
	
	@RequestMapping(value = "/item/list",method = RequestMethod.GET)
	@ResponseBody
	public ItemListVO listItem(Integer page,Integer rows) {
		return tbItemService.listItem(page,rows);
	}
	
	
	
}
