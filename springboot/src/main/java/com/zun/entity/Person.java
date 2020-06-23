package com.zun.entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * @ConfigurationProperties 读取配置文件中以person为前缀的配置属性
 * 和@Vaule相区别
 * 如果不指定配置文件位置 默认在application的配置文件中寻找
 * 也可以指定配置文件的位置 加注解@PropertySource
 * 
 * 
 * 
 * xxxxAutoConfigurartion：自动配置类；给容器中添加组件
 * xxxxProperties:封装配置文件中相关属性；
 * @author wangzunmin
 *
 */
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix="person")
public class Person {

	 private String lastName;
	 private Integer age;
	 private Boolean boss;
	 private Date birth;
	 
	 private Map<String,Object> maps;
	 private List<Object> list;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Boolean getBoss() {
		return boss;
	}
	public void setBoss(Boolean boss) {
		this.boss = boss;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Map<String, Object> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, Object> maps) {
		this.maps = maps;
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	 
	 
	 

}
