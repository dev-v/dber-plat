package com.dber.plat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * <li>文件名称: PlatConfig.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 * 
 * @version 1.0
 * @since 2017年12月20日
 * @author dev-v
 */
@Configuration
@Import({ PlatServiceConfig.class, PlatWebConfig.class })
public class PlatAppConfig {
}
