package com.github.tide.annotation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 组件扫描配置
 *
 * @author likai
 */
@Configuration
@ComponentScan(value = {"com.github.tide"})
@MapperScan(basePackages = {"com.github.tide.mapper"})
public class ComponentScanConfig {


}
