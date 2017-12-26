package com.dber.plat.api.entity;

import java.sql.Timestamp;

import lombok.Data;

/**
 * <li>文件名称: Msg.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Data
public class Msg {
	
	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String content;

	/**
	 * 消息类型：1-系统消息
	 */
	private Integer type;

	/**
	 * 
	 */
	private Timestamp modifyTime;


}
