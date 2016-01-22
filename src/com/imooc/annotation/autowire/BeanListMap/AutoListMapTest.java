package com.imooc.annotation.autowire.BeanListMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AutoListMapTest extends UnitTestBase {
	
	public AutoListMapTest(){
		super("classpath:springconfig/spring-annotation.xml");
	}
	
	@Test
	public void sayList(){
		BeanListMap bean = super.getBean("beanListMap");
		bean.say();
	}
	
	@Test
	public void testQualfier(){
		qualifierBean bean = super.getBean("qualifierBean");
		bean.say();
	}

}
