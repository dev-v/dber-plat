package com.dber.plat.config;

import com.dber.config.SystemConfig;
import com.dber.cache.ICacheService;
import com.dber.base.enums.DberSystem;
import com.dber.base.util.BaseKeyUtil;
import com.dber.plat.api.PlatLoginHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.dber.base.config.BaseWebConfig;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <li>文件名称: WebConfig.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2017年12月21日
 */
@Configuration
@Import({PlatServiceConfig.class, BaseWebConfig.class, PlatLoginHelper.class})
@ComponentScan("com.dber.plat.web")
public class PlatWebConfig implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {

    private static final Log log = LogFactory.getLog(PlatWebConfig.class);

    @Autowired
    SystemConfig systemConfig;

    @Autowired
    ICacheService cacheService;

    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent event) {
        int port = event.getEmbeddedServletContainer().getPort();
        String ip = null;

        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            log.error(e);
        }

        cacheService.put(BaseKeyUtil.getBaseKey(DberSystem.PLAT), "http://" + ip + ":" + port);
    }
}
