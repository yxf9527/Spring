package com.imooc.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class JunitTest extends UnitTestBase{
	
	public JunitTest(){
		super("classpath:springconfig/spring-injection.xml");
	}
	
	@Test
	public void test(){
		System.out.println("测试方法test");
	}
	
	
	

}
