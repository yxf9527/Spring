package com.imooc.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class ScopeTest extends UnitTestBase {
	
	public ScopeTest(){
		super("classpath:springconfig/spring-beanscope.xml");
	}
	
	/**
	 * scope="singleton"模式下容器启动到销毁只生成一个单例bean
	 * scope="prototype"模式下容器启动到销毁 每次都生成一个bean
	 */
	@Test
	public void testSingleton(){
		
		BeanScope bean1 = super.getBean("beanscope");
		bean1.say();
		
		BeanScope bean2 = super.getBean("beanscope");
		bean2.say();
	}
	
	

}
