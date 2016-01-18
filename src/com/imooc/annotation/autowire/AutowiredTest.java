package com.imooc.annotation.autowire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.annotation.autowire.service.InjectionServiceImpl;
import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AutowiredTest extends UnitTestBase {
	
	public AutowiredTest(){
		super("classpath:springconfig/spring-annotation.xml");
	}
	
	@Test
	public void test(){
		InjectionServiceImpl bean = super.getBean("injectionServiceImpl");
		bean.save();
	}

}
