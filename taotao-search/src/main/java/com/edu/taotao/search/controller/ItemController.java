package com.edu.taotao.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.taotao.search.dao.IItemMapper;
import com.taotao.common.pojo.TaotaoResult;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月6日
 * @description
 */
@Controller
public class ItemController {

	@Autowired
	private IItemMapper itemMapper;

	@RequestMapping("/transforItemsToSolr")
	@ResponseBody
	public TaotaoResult transforItemsToSolr() {
		return TaotaoResult.ok(itemMapper.listSolrAnalyItems());
	}

}
