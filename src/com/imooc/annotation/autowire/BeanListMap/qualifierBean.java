package com.imooc.annotation.autowire.BeanListMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class qualifierBean {

	//@Qualifier限制接口的实现类
	@Autowired
	@Qualifier("beanInterfaceImplTwo")
	private BeanInterface impl;
	
	public void say(){
		if(impl!=null){
			System.out.println(impl.getClass().getName());
		}
	}
	
	
	
}
