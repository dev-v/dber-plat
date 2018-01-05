package com.dber.plat.api.entity;

import lombok.Data;

/**
 * <li>文件名称: Account.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class Account {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 本平台昵称
	 */
	private String name;

	/**
	 * 手机号
	 */
	private String cellphone;

	/**
	 * 手机登录密码
	 */
	private String password;

	/**
	 * 本账户被绑定的账户id，被绑定后，本账户数据将迁移到被绑定账户上，并且实现本账户
	 */
	private Integer bindId;

	/**
	 * 账户状态：
常规状态：
1-启用
2-绑定失效（被认证的其他账户绑定，数据已被迁移到其他账号上）
3-登录锁定
	 */
	private Integer status;

	/**
	 * 密码是否过期：1-否，2-是
	 */
	private Integer pwExpired;

	/**
	 * 账户类型：1-健身者，2-私教，3-店铺管理员
	 */
	private Integer type;

	/**
	 * 
	 */
	private java.sql.Date createTime;

	/**
	 * 
	 */
	private java.sql.Timestamp modifyTime;


}
