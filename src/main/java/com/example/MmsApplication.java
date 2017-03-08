package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MmsApplication extends SpringBootServletInitializer{

	/**
	 * 重写SpringBootServletInitializer的configure方法
	 * 可在tomcat下运行
	 */
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return super.configure(builder);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MmsApplication.class, args);
	}
}
