package com.github.tide.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用一致性框架的注解
 *
 * @author likai
 */
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import({ConsistencyTaskSelector.class})
public @interface EnableTendConsistencyTask {
}
