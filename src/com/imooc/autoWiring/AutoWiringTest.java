package com.imooc.autoWiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringTest extends UnitTestBase{

	public AutoWiringTest(){
		super("classpath:springconfig/spring-autoWiring.xml");
	}
	
	@Test
	public void testByName(){
		AutoWiringService service = super.getBean("autoService");
		service.say("java");
	}
	
	
	
}
