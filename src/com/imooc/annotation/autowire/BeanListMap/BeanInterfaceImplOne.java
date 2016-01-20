package com.imooc.annotation.autowire.BeanListMap;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=2)
@Component
public class BeanInterfaceImplOne implements BeanInterface {

	@Override
	public void say(String msg) {
		System.out.println("BeanInterfaceImplOne实现类");
	}
	
	

}
