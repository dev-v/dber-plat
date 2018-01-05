package com.dber.plat.api.entity;

import lombok.Data;

/**
 * <li>文件名称: JobInstance.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class JobInstance {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private Integer jobId;

	/**
	 * 状态：1-初始化，2-触发任务等待执行，3-执行中，4-过期失效，5-成功，6-失败
	 */
	private Integer status;

	/**
	 * 内置参数：包括本次执行时间，上次成功执行时间
	 */
	private String params;

	/**
	 * 用户执行参数
	 */
	private String customParams;

	/**
	 * 
	 */
	private java.sql.Date createTime;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
