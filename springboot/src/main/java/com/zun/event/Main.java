package com.zun.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
		bean.regist("xxx");
	}
	
	@Bean
	public MessageListenerService getMessageListener() {
		return new MessageListenerService();
	}
	
	@Bean
	public EmailListenerService getEmailListener() {
		return new EmailListenerService();
	}
	
	@Bean
	public UserServiceImpl getUserService() {
		return new UserServiceImpl();
	}
}
