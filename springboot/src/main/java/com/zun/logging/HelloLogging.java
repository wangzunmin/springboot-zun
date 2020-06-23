package com.zun.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * 日志门面（抽象） 和 日志实现
 * 选用slf4j（simple log facade for java）    和  logback
 * 以后开发的时候，日志记录方法的调用，不应该来直接调用日志的实现类，而是调用日志抽象层里面的方法；
给系统里面导入slf4j的jar和 logback的实现jar
 */
public class HelloLogging {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloLogging.class);
		//日志的级别；
		//由低到高 trace<debug<info<warn<error
		//可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
		logger.trace("这是trace日志...");
		logger.debug("这是debug日志...");
		//SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root
//		级别
		logger.info("这是info日志...");
		logger.warn("这是warn日志...");
		logger.error("这是error日志...");
	}

}
