package com.xyc.initanddestorybean.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 可以使用注解@Component注册，也可以用xml配置文件：
 * <bean id="testComponent" class="com.xyc.initanddestorybean.component.TestComponent" init-method="postConstruct" destroy-method="preDestroy"></bean>
 * Created by xyc on 2017/8/20 0020.
 */
@Component
public class TestComponent implements InitializingBean, DisposableBean {
    /**
     * 执行顺序-1，初始化Bean
     */
    @PostConstruct
    public void postConstruct() {
        System.out.println("执行postConstruct了......");
    }

    /**
     * 执行顺序-2，初始化Bean，InitializingBean接口提供
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行afterPropertiesSet了......");
    }

    /**
     * 执行顺序-3，销毁Bean
     */
    @PreDestroy
    public void preDestroy() {
        System.out.println("执行preDestroy了......");
    }

    /**
     * 执行顺序-4，销毁Bean，DisposableBean接口提供
     *
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("执行destroy了......");
    }
}
