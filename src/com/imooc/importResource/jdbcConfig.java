package com.imooc.importResource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
@ImportResource("classpath:springconfig/spring-jdbc.xml")
public class jdbcConfig {
	
	@Value("${jdbc.url}")
	private String url;
	
	//${username}获取的是计算机名
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean(name="driver")
	public MyDriverManager driverManagerFactory(){
		return new MyDriverManager(url, username, password);
	}
	
	@Bean(name="scopeBean")
 	@Scope(value="prototype")  //默认是单例模式singleton
	public MyDriverManager driverManagerScope(){
		return new MyDriverManager();
	}
	
}
