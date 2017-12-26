package com.dber.plat.api.entity;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

/**
 * <li>文件名称: DictCategory.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class DictCategory {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 字典类型名称
	 */
	private String category;

	/**
	 * 系统名称
	 */
	private String sys;

	/**
	 * 描述
	 */
	private String content;

	/**
	 * 
	 */
	private Date createTime;

	/**
	 * 
	 */
	private Timestamp modifyTime;


}
