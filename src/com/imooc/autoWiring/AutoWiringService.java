package com.imooc.autoWiring;

public class AutoWiringService {
	
	private AutoWiringDAO dao;
	
	public void say(String msg){
		this.dao.say(msg);
	}

	public void setDao(AutoWiringDAO dao) {
		System.out.println("通过属性名自动装配");
		this.dao = dao;
	}
	
	public AutoWiringService(){}
	
	public AutoWiringService(AutoWiringDAO dao){
		System.out.println("通过构造器自动装配");
		this.dao = dao;
	}
	
	 

}
