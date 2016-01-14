package com.imooc.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.ioc.service.InjectionService;
import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class Testioc extends UnitTestBase {


	public Testioc(){
		super("classpath:springconfig/spring-injection.xml");
	}
	
	@Test
	public void testSetter(){
		InjectionService service = (InjectionService)super.getBean("injectionService");
		service.save();
	}
	
}
