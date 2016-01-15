package com.imooc.aware;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AwareTest extends UnitTestBase {
	
	public AwareTest(){
		super("classpath:springconfig/spring-aware.xml");
	}
	
	@Test
	public void test(){
		//System.out.println("testunit:"+super.getBean("application").hashCode());
	}

}
