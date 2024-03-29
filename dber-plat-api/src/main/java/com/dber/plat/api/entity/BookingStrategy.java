package com.dber.plat.api.entity;

import lombok.Data;

/**
 * <li>文件名称: BookingStrategy.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class BookingStrategy {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 策略名称
	 */
	private String name;

	/**
	 * 当天可预约起始时间，单位分钟
	 */
	private Integer beginTime;

	/**
	 * 当天可预约结束时间，单位分钟
	 */
	private Integer endTime;

	/**
	 * 被预约时间段前置强制占用时间
	 */
	private Integer bookBeforeTime;

	/**
	 * 被预约时间段后置强制占用时间
	 */
	private Integer bookAfterTime;

	/**
	 * 最短预约时长
	 */
	private Integer bookShortestTime;

	/**
	 * 最长预约时长
	 */
	private Integer bookLongestTime;

	/**
	 * 预订起始时间隔当前时间至少为多长，单位分钟
	 */
	private Integer bookCurrentStartOffset;

	/**
	 * 描述
	 */
	private String content;

	/**
	 * 
	 */
	private java.sql.Date createTime;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
