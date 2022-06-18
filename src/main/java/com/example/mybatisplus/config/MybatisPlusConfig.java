package com.example.mybatisplus.config;

import com.alibaba.druid.filter.FilterAdapter;
import com.alibaba.druid.pool.DruidDataSource;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.github.osinn.druid.multi.tenant.plugin.filter.RewriteSqlDruidFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@Configuration
@MapperScan("com.example.mybatisplus.mapper*")
public class MybatisPlusConfig {

    /**
     * mybatis-plus分页插件<br>
     * 文档：http://mp.baomidou.com<br>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

//    @ConfigurationProperties("spring.datasource")
//    @Bean(initMethod = "init", destroyMethod = "close")
//    public DruidDataSource dataSource() {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        druidDataSource.setProxyFilters(Collections.singletonList(rewriteSqlDruidFilter()));
//        return druidDataSource;
//    }
//
//    @Bean
//    public FilterAdapter rewriteSqlDruidFilter() {
//        return new RewriteSqlDruidFilter();
//    }

}
