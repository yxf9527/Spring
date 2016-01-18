package com.imooc.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.imooc.junit.UnitTestBase;

@RunWith(BlockJUnit4ClassRunner.class)
public class AnnotationTest  extends UnitTestBase{
	
	public AnnotationTest(){
		super("classpath:springconfig/spring-annotation.xml");
	}
	
	@Test
	public void  testAnnotation(){
		//类名首字母小写  默认生成的id=类名（首字母小写）
		BeanAnnotation bean = super.getBean("beanAnnotation");
		bean.say("java");
	}
	
	@Test
	public void testScope(){
		BeanAnnotation b1 = super.getBean("beanAnnotation");
		b1.myhash();
		
		b1 = super.getBean("beanAnnotation");
		b1.myhash();
	}
	

}
