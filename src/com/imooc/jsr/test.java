package com.imooc.jsr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class test extends UnitTestBase {
	
	public test(){
		super("classpath:springconfig/spring-scanjsr.xml");
	}

	@Test
	public void testRes(){
		JsrService service = super.getBean("jsr");
		service.save();
	}
	
	@Test 
	public void testname(){
		JsrService service = super.getBean("jsr");
		service.name();
	}
}
