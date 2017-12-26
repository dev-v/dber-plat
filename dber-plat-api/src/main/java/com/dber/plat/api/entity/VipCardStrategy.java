package com.dber.plat.api.entity;

import lombok.Data;

/**
 * <li>文件名称: VipCardStrategy.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class VipCardStrategy {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 卡片名称
	 */
	private String name;

	/**
	 * 实际可使用天数
	 */
	private Integer days;

	/**
	 * 折扣天数，用来评估年卡最低购买价（折扣天数*店铺常规消费价=卡片价值）
	 */
	private Integer discountDays;

	/**
	 * 转让系统自动折扣价百分数
	 */
	private Integer transferSysDiscount;

	/**
	 * 转让自我最大折扣百分数
	 */
	private Integer transferSelfDiscount;


}
