package com.imooc.junit;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {
	
	private ClassPathXmlApplicationContext context;
	
	private String springXmlpath;
	
	public UnitTestBase(){}
	
	public UnitTestBase(String springXmlpath){
		this.springXmlpath = springXmlpath;
	}
	
	//单元化测试方法执行之前执行
	@Before
	public void before(){
		System.out.println("即将开始单元化测试！");
		if(StringUtils.isEmpty(springXmlpath)){
			springXmlpath = "classpath*:config/spring-*.xml";
		}
		try{
			context = new ClassPathXmlApplicationContext(springXmlpath.split("[,\\s]+"));
			context.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//单元化测试方法执行后执行
	@After
	public void after(){
		context.destroy();
		System.out.println("单元化测试结束！");
	}
	
	/**
	 * 工具方法  
	 * 根据beanId获取spring配置文件中的bean
	 * */
	public <T extends Object> T getBean(String beanId){
		try{
			return (T)context.getBean(beanId);
		}catch(BeansException e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 工具方法
	 * 根据类的类对象class获取bean
	 * */
	public <T extends Object> T getBean(Class<T> clazz){
		try{
			return context.getBean(clazz);
		}catch(BeansException e){
			e.printStackTrace();
			return null;
		}
	}
	
}
