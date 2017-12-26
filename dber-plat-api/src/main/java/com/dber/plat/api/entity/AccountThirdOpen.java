package com.dber.plat.api.entity;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

/**
 * <li>文件名称: AccountThirdOpen.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class AccountThirdOpen {
	
	/**
	 * 
	 */
	private Long id;

	/**
	 * 三方平台昵称
	 */
	private String name;

	/**
	 * 
	 */
	private String openId;

	/**
	 * 
	 */
	private Integer customerId;

	/**
	 * 
	 */
	private Integer coacherId;

	/**
	 * 账号平台类型：1-微信，2-QQ，3-支付宝，4-新浪微薄
	 */
	private Integer type;

	/**
	 * 
	 */
	private Integer shopManageId;

	/**
	 * 
	 */
	private Date createTime;

	/**
	 * 
	 */
	private Timestamp modifyTime;


}
