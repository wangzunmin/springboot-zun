package com.zun.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
/**
 * 定义用户注册服务(事件发布者)
 * @author wangzunmin
 *
 */
public class UserServiceImpl implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	/**
	 * 用户注册
	 * @param name
	 */
	public void regist(String name) {
		applicationEventPublisher.publishEvent(new UserRegisterEvent(name));
	}

}
