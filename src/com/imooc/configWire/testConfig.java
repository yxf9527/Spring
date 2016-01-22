package com.imooc.configWire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class testConfig extends UnitTestBase {
	
	public testConfig(){
		super("classpath:springconfig/spring-config.xml");
	}
	
	@Test
	public void testConfig(){
		Store bean = super.getBean("store");
		System.out.println(bean.getClass().getName());
	}

}
