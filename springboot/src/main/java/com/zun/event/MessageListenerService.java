package com.zun.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
/**
 * 定义事件监听的服务
 * @author wangzunmin
 *
 */
public class MessageListenerService implements ApplicationListener<UserRegisterEvent> {


	@Override
	public void onApplicationEvent(UserRegisterEvent event) {
		System.out.println("用户" + event.getSource() + "发送短信成功");
	}

}


class EmailListenerService implements ApplicationListener<UserRegisterEvent>{

	@Override
	public void onApplicationEvent(UserRegisterEvent event) {
		System.out.println("用户" + event.getSource() + "发送Email成功");
	}
	
}
