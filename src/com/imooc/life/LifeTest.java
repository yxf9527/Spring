package com.imooc.life;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class LifeTest extends UnitTestBase {
	
	public LifeTest(){
		super("classpath:springconfig/spring-life.xml");
	}
	
	@Test
	public void testMethod(){
		BeanLife bean = super.getBean("beanlife");
	}
	
	@Test 
	public void testImplInter(){
		BeanInitializing bean = super.getBean("initBean");
	}
	

}
