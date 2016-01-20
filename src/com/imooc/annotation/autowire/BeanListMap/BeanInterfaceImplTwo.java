package com.imooc.annotation.autowire.BeanListMap;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(value=1)
@Component
public class BeanInterfaceImplTwo implements BeanInterface {

	@Override
	public void say(String msg) {
		System.out.println("BeanInterfaceImplTwo实现类");
	}

}
