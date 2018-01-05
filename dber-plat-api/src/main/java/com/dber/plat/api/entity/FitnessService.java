package com.dber.plat.api.entity;

import lombok.Data;

/**
 * <li>文件名称: FitnessService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class FitnessService {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 数据字典
	 */
	private Integer category;

	/**
	 * 
	 */
	private String name;

	/**
	 * 
	 */
	private String des;

	/**
	 * 是否支持场地共享：1-只支持场地共享，2-不支持场地共享，3-可支持、可不支持，店铺决定（但只能选择一种）
	 */
	private Integer shareSite;

	/**
	 * 是否支持团体：1-支持，2-不支持
	 */
	private Integer group;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
