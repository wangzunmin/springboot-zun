package com.zun.condition;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Conditional 注释可以实现只有在特定条件满足时才启用一些配置
 * @author wangzunmin
 *
 */
@Configuration
@Conditional(MyCondition.class)//MyCondition中的matches方法返回true，配置类才能生效，否则不能
public class ConditionConfig {

	@Bean
	public ConditionBean conditionBean() {
		return new ConditionBean();
	}

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class); 
		ConditionBean conditionBean = context.getBean(ConditionBean.class); 
		conditionBean.sayHi();
	}
}
