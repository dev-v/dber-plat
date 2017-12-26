package com.dber.plat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dber.base.service.IService;
import com.dber.base.web.controller.AbstractController;
import com.dber.plat.api.entity.Job;
import com.dber.plat.service.IJobService;

/**
 * <li>文件名称: JobController.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月21日
 * @author dev-v
 */
@RestController
@RequestMapping("/job")
public class JobController extends AbstractController<Job> {

	@Autowired
	private IJobService service;

	@Override
	protected IService<Job> getService() {
		return this.service;
	}
}
