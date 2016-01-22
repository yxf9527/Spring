package com.imooc.configWire;

public class StringStore implements Store{
	
	public void init(){
		System.out.println("实现类StringStore的init方法");
	}
	
	public void destroy(){
		System.out.println("实现类StringStore的destory方法");
	}

}
