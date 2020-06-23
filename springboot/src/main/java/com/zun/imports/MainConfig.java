package com.zun.imports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Import 注解支持导入普通 java 类，并将其声明成一个bean。主要用于将多个分散的 java config 配置类融合成一个更大的 config 类
 * @author wangzunmin
 *
 */
@Import({Circle.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MainConfig {

	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class); 
		Circle bean = context.getBean(Circle.class);
		bean.sayHi();
		Triangle bean2 = context.getBean(Triangle.class);
		bean2.sayHi();
		
		Rectangle bean3 = (Rectangle)context.getBean("rectangle");
		bean3.sayHi();
		
	}

}
