package com.edu.taotao.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.taotao.rest.service.IContentService;
import com.taotao.mapper.TbContentMapper;
import com.taotao.pojo.TbContent;
import com.taotao.pojo.TbContentCriteria;
import com.taotao.pojo.TbContentCriteria.Criteria;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月4日
 * @description
 */
@Service
public class ContentServiceImpl implements IContentService {

	@Autowired
	private TbContentMapper tbContentMapper;

	@Override
	public List<TbContent> listContentsByCategoryId(Long id) {
		TbContentCriteria example = new TbContentCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(id);
		return tbContentMapper.selectByExample(example);
	}
}
