package com.zun.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import vue.sb.lg.interceptor.LoginInterceptor;
/**
 * 继承WebMvcConfigurerAdapter扩展springmvc的功能，如interceptor等
 * @author wangzunmin
 *
 */
//@EnableWebMvc//全面接管springmvc，用户自己配置springmvc的相关配置，springboot的自动配置无效，建议不使用
@Configuration
public class ExtendsMvcConfig extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//访问localhost:8080/thymeleaf就可访问到hello.html页面的内容了
		registry.addViewController("/thymeleaf").setViewName("hello");
//		registry.addViewController("/").setViewName("index");//默认设置首页
	}

	//所有的WebMvcConfigurerAdapter组件都会一起起作用 	
	
	@Bean // //将组件注册在容器 
	public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
		WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("index");//默认设置首页
			}
			
		};
		return adapter;
	}

//	@Override
//	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
//		configurer.favorPathExtension(false);
//	}
	
	
	/**
	 *嵌入式的容器的端口等编码配置
	 *和全局配置文件中的配置一样的效果 
	 * @return
	 */
	@Bean//将此加入至容器中去
	public EmbeddedServletContainerCustomizer embeddedServletContainerCustomizer(){
		return new EmbeddedServletContainerCustomizer() {
			@Override
			public void customize(ConfigurableEmbeddedServletContainer container) {
				System.out.println("--------***************----------");
				container.setPort(8443);//server.port=8443
			}
		};
	}
	
	@Autowired
	private LoginInterceptor loginInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(loginInterceptor)
		.addPathPatterns("/**").excludePathPatterns("/index.html");
	}
	
	
	
	
}
