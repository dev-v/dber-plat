package com.dber.plat.api.entity;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

/**
 * <li>文件名称: ElementMedal.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class ElementMedal {
	
	/**
	 * 按元素周期表排名
	 */
	private Integer id;

	/**
	 * 元素名称
	 */
	private String name;

	/**
	 * 原子量
	 */
	private Integer quality;

	/**
	 * 活跃等级：1-活跃元素、2-半活跃元素，3-稳定元素、4-惰性元素
	 */
	private Integer activeLevel;

	/**
	 * 该元素值多少积分
	 */
	private Integer score;

	/**
	 * 当会员分数大于该值时，可点亮该元素勋章
	 */
	private Integer needScore;

	/**
	 * 元素介绍
	 */
	private String des;

	/**
	 * 元素奖励，进行一次公益活动或者个人奖励
	 */
	private Integer award;


}
