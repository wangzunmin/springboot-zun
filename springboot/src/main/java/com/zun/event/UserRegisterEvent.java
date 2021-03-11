package com.zun.event;

import org.springframework.context.ApplicationEvent;
/**
 * 定义用户注册事件
 * @author wangzunmin
 *
 */
public class UserRegisterEvent extends ApplicationEvent{

	public UserRegisterEvent(Object source) {
		super(source);
	}


}
