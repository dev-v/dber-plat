package com.dber.plat.api.entity;

import lombok.Data;

/**
 * <li>文件名称: Job.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class Job {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 任务所属系统:1-平台、2-账单、3-店铺、4-会员、5-教练等
	 */
	private Integer system;

	/**
	 * 状态：1-启用，2-停用
	 */
	private Integer status;

	/**
	 * JOB触发类型：1-秒，2-cron表达式
	 */
	private Integer triggerType;

	/**
	 * 触发周期表达式：秒或者cron
	 */
	private String triggerExpression;

	/**
	 * 
	 */
	private String name;

	/**
	 * 任务类型：1-http请求，2-本地Class实现，3-client(msg-key)
	 */
	private Integer taskType;

	/**
	 * 任务http链接或Class类名
	 */
	private String task;

	/**
	 * 任务描述
	 */
	private String des;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;

	/**
	 * 
	 */
	private java.sql.Date createTime;


}
