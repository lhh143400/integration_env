package com.lhh.springboot.config.mybatis;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis dao扫描配置
 *
 * @author lhh
 * @Date 2019/10/26 10:25
 */
@Configuration
public class MyBatisConfig {


    /**
     * mybatis dao扫描配置
     *
     * @return
     */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        //扫描该路径下的dao层
        mapperScannerConfigurer.setBasePackage("com.lhh.springboot.oauth.dao, com.lhh.springboot.modules.*.dao");

        return mapperScannerConfigurer;
    }
}
