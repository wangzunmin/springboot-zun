package com.zun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {"com.zun","vue.sb.lg"})
@EnableJpaRepositories(basePackages= {"vue.sb.lg.dao"})//扫描倒@Repository
@EntityScan(basePackages= {"vue.sb.lg.entity"})//扫描到@Entity
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
	
}
