package com.zun.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zun.condition")
@ConditionalOnBean(ConditionBean.class)
public class ConditionOnBeanConfig {


	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class); 
		ConditionBean conditionBean = context.getBean(ConditionBean.class); 
		conditionBean.sayHi();
	}
}
