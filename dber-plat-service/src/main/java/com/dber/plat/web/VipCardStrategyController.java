package com.dber.plat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.base.web.controller.AbstractController;
import com.dber.plat.api.entity.VipCardStrategy;
import com.dber.plat.service.IVipCardStrategyService;

/**
 * <li>文件名称: VipCardStrategyController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/vip_card_strategy")
public class VipCardStrategyController extends AbstractController<VipCardStrategy> {

	@Autowired
	private IVipCardStrategyService service;

	@Override
	protected IService<VipCardStrategy> getService() {
		return this.service;
	}
}
