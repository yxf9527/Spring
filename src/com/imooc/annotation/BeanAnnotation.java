package com.imooc.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("bean")
@Component
@Scope("singleton")
public class BeanAnnotation {

	public void say(String msg){
		System.out.println("annotation:"+msg);
	}
	
	public void myhash(){
		System.out.println("scope:"+this.hashCode());
	}
}
