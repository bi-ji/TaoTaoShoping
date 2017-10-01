package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.ItemListVO;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemCriteria;
import com.taotao.service.ITbItemService;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月1日
 * @description 
 */
@Service
public class TbItemServiceImpl implements ITbItemService{
	
	@Autowired
	private TbItemMapper tbItemMapper;

	@Override
	public TbItem findOne(Long id) throws Exception {
		return tbItemMapper.selectByPrimaryKey(id);
	}

	@Override
	public ItemListVO listItem(Integer page, Integer rows) {
		TbItemCriteria example = new TbItemCriteria();
		PageHelper.startPage(page,rows);
		List<TbItem> list = tbItemMapper.selectByExample(example);
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		ItemListVO vo = new ItemListVO();
		vo.setTotal(pageInfo.getTotal());
		vo.setRows(list);
		return vo;
	}

	
	
	
}
