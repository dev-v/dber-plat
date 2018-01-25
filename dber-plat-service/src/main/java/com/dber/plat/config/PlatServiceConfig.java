package com.dber.plat.config;

import com.dber.base.mybatis.plugin.pagination.PaginationInterceptor;
import com.dber.base.util.DBUtil;
import com.dber.cache.config.CacheConfig;
import com.dber.config.SystemConfig;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * <li>文件名称: PlatService.java</li>
 * <li>修改记录: ...</li>
 * <li>内容摘要: ...</li>
 * <li>其他说明: ...</li>
 *
 * @author dev-v
 * @version 1.0
 * @since 2017年12月21日
 */
@Configuration
@EnableConfigurationProperties({SystemConfig.class})
@EnableAutoConfiguration
@EnableTransactionManagement
@Import({CacheConfig.class})
@ComponentScan("com.dber.plat.service")
@MapperScan(basePackages = {"com.dber.plat.mapper"})
public class PlatServiceConfig {
    @Autowired
    private SystemConfig systemConfig;

    @Bean
    public DataSource platDataSource() {
        DataSource platDataSource = DBUtil.dataSource(systemConfig.getService().getDatabase());
        return platDataSource;
    }

    @Bean
    public DataSourceTransactionManager platTransactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(platDataSource());
        return transactionManager;
    }

    @Bean
    public org.apache.ibatis.session.Configuration platMybatisConfiguration() {
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.getTypeAliasRegistry().registerAliases("com.dber.plat.api.entity");
        return configuration;
    }

    @Bean
    public SqlSessionFactoryBean platSqlSessionFactoryBean() throws IOException {
        SqlSessionFactoryBean platSqlSessionFactoryBean = new SqlSessionFactoryBean();

        platSqlSessionFactoryBean.setDataSource(platDataSource());

        platSqlSessionFactoryBean.setConfiguration(platMybatisConfiguration());

        PathMatchingResourcePatternResolver resourceResolver = new PathMatchingResourcePatternResolver();
        platSqlSessionFactoryBean
                .setMapperLocations(resourceResolver.getResources("classpath*:/mapper/*_mapper.xml"));

        Interceptor[] interceptors = {PaginationInterceptor.getInstance()};
        platSqlSessionFactoryBean.setPlugins(interceptors);

        return platSqlSessionFactoryBean;
    }
}
