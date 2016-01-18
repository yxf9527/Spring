package com.imooc.resource;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;


/**
 * 实现ApplicationContextAware接口自动装配
 * */
public class BeanResource implements ApplicationContextAware {
	
	private ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.context = arg0;
	}
	
	public void resource() throws IOException{
		Resource resource = this.context.getResource("classpath:springconfig/spring-life.xml");
		System.out.println(resource.getFilename());
		System.out.println(resource.contentLength());
	}
	

}
