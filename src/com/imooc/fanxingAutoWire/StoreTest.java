package com.imooc.fanxingAutoWire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class StoreTest extends UnitTestBase {
	
	public StoreTest(){
		super("classpath:springconfig/spring-jdbc.xml");
	}
		
	
	@Test
	public void test(){
		StoreConfig bean = super.getBean("storeConfig");
		bean.syso();
	}
	

}
