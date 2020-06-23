package com.zun.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zun.entity.Department;
import com.zun.entity.Person;
import com.zun.entity.User;

/**
 * thymeleaf的默认的静态页面的路径/src/main/resources/templates
 * @author wangzunmin
 *
 */
@Controller
public class ThymeleafController {
	
	@RequestMapping("hello")
	public String hello(Model model) {
		model.addAttribute("host", "www.baidu.com");
		return "hello";
	}
	
	@RequestMapping("depart")
	@ResponseBody
	public Object department() {
		List<Department> list = new ArrayList<>();
		for(int i=0;i<20;i++) {
			list.add(new Department("tom" + i, i+"", "desc"+i, i+""));
		}
		return list;
	}
	
	@Autowired
	Person person;
	
	@RequestMapping("/person")
	@ResponseBody
	public Person person() {
		return person;
	}
	
	

	@RequestMapping("/user/{id}")
	@ResponseBody
	public User user(@PathVariable("id")Integer id) {
		User user = new User(id, "tom");
		return user;
	}
	
	
	@RequestMapping("vue")
	public String vue() {
		return "vue";
	}
}
