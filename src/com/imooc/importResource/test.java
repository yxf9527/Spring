package com.imooc.importResource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class test extends UnitTestBase {
	
	public test(){
		super("classpath:springconfig/spring-jdbc.xml");
	}	
	
	@Test
	public void testJdbc(){
		MyDriverManager bean = super.getBean("driver");
		System.out.println(bean.getClass().getName());
	}
	
	@Test
	public void testScope(){
		MyDriverManager bean1 = super.getBean("scopeBean");
		System.out.println(bean1.hashCode());
		
		bean1 = super.getBean("scopeBean");
		System.out.println(bean1.hashCode());
	}

}
