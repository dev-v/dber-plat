package com.dber.plat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dber.base.mapper.IMapper;
import com.dber.base.service.AbstractService;
import com.dber.plat.api.entity.AccountThirdOpen;
import com.dber.plat.mapper.IAccountThirdOpenMapper;

/**
 * <li>文件名称: AccountThirdOpenService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Service
public class AccountThirdOpenService extends AbstractService<AccountThirdOpen> implements IAccountThirdOpenService {

	@Autowired
	private IAccountThirdOpenMapper mapper;

	@Override
	protected IMapper<AccountThirdOpen> getMapper() {
		return this.mapper;
	}

}
