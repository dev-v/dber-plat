package com.dber.plat.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dber.base.mapper.IMapper;
import com.dber.base.service.AbstractService;
import com.dber.plat.api.entity.BookingStrategy;
import com.dber.plat.mapper.IBookingStrategyMapper;

/**
 * <li>文件名称: BookingStrategyService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Service
public class BookingStrategyService extends AbstractService<BookingStrategy> implements IBookingStrategyService {

	@Autowired
	private IBookingStrategyMapper mapper;

	@Override
	protected IMapper<BookingStrategy> getMapper() {
		return this.mapper;
	}

}
