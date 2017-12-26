package com.dber.plat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dber.base.mapper.IMapper;
import com.dber.base.service.AbstractService;
import com.dber.plat.api.entity.ElementMedal;
import com.dber.plat.mapper.IElementMedalMapper;

/**
 * <li>文件名称: ElementMedalService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Service
public class ElementMedalService extends AbstractService<ElementMedal> implements IElementMedalService {

	@Autowired
	private IElementMedalMapper mapper;

	@Override
	protected IMapper<ElementMedal> getMapper() {
		return this.mapper;
	}

}
