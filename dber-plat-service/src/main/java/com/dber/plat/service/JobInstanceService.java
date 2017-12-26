package com.dber.plat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dber.base.mapper.IMapper;
import com.dber.base.service.AbstractService;
import com.dber.plat.api.entity.JobInstance;
import com.dber.plat.mapper.IJobInstanceMapper;

/**
 * <li>文件名称: JobInstanceService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Service
public class JobInstanceService extends AbstractService<JobInstance> implements IJobInstanceService {

	@Autowired
	private IJobInstanceMapper mapper;

	@Override
	protected IMapper<JobInstance> getMapper() {
		return this.mapper;
	}

}
