package com.imooc.life;

public class BeanLife {
	
	public void init(){
		System.out.println("通过init-method配置初始化的方法");
	}
	
	public void destroy(){
		System.out.println("通过init-method配置销毁的方法");
	}
	
	
	public void defaultInit(){
		System.out.println("通过默认全局配置的方式default-init-method初始化");
	}
	
	public void defaultDestroy(){
		System.out.println("通过默认全局配置的方式default-destroy-method销毁");
	}

}
