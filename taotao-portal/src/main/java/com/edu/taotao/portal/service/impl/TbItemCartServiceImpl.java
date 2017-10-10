package com.edu.taotao.portal.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.edu.taotao.portal.service.ITbItemCartService;
import com.google.gson.reflect.TypeToken;
import com.taotao.common.pojo.ItemCartVO;
import com.taotao.common.pojo.TaotaoResult;
import com.taotao.common.utils.CookieUtils;
import com.taotao.common.utils.GsonUtil;

/**
 * @author ZhuTao
 * @version 1.0
 * @Date 2017年10月10日
 * @description 购物车实现
 */
@Service
public class TbItemCartServiceImpl implements ITbItemCartService {

	@Value("${rest.url}")
	private String restUrl;

	@Value("${restApi.itemInf}")
	private String restApiItemInfo;

	
	@Override
	public TaotaoResult addItemToCart(Long itemId, int num, HttpServletRequest request, HttpServletResponse response) {
		// 获取cookies中是否有
		String ttCart = CookieUtils.getCookieValue(request, "TT_CART");
		List<ItemCartVO> cartVOs;
		if (ttCart == null) {
			cartVOs = new ArrayList<>();
		} else {
			cartVOs = GsonUtil.getGson().fromJson(ttCart, new TypeToken<List<ItemCartVO>>() {
			}.getType());
			List<ItemCartVO> exist = cartVOs.stream().map(item -> {
				if (item.getId().equals(itemId)) {
					item.setNum(item.getNum() + num);
					return item;
				}
				return item;

			}).collect(Collectors.toList());

		}
		// 查询商品信息
		return TaotaoResult.ok();
	}

}
