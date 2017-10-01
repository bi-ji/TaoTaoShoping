package com.taotao.service;

import com.taotao.common.pojo.ItemListVO;
import com.taotao.pojo.TbItem;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月1日
 * @description
 */
public interface ITbItemService {

	TbItem findOne(Long id) throws Exception;

	/**
	 * 查询展示列表
	 * 
	 * @param page
	 * @param rows
	 * @return
	 */
	ItemListVO listItem(Integer page, Integer rows);

}
