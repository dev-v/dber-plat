package com.dber.plat.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.base.web.controller.AbstractController;
import com.dber.plat.api.entity.FitnessService;
import com.dber.plat.service.IFitnessServiceService;

/**
 * <li>文件名称: FitnessServiceController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/fitness_service")
public class FitnessServiceController extends AbstractController<FitnessService> {

	@Autowired
	private IFitnessServiceService service;

	@Override
	protected IService<FitnessService> getService() {
		return this.service;
	}
}
