package com.dber.plat.entity;

import lombok.Data;

/**
* <li>文件名称: Dict.java</li>
* <li>修改记录: ...</li>
* <li>内容摘要: ...</li>
* <li>其他说明: ...</li>
* @version  1.0
* @since    2017年12月19日
* @author   dev-v
*/
@Data
public class Dict {
	private Integer id;
	
	private Integer categoryId;
	
	private String enumName;
	
	private String value;
	
	private String label;
	
	private String content;
}


