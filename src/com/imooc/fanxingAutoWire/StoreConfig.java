package com.imooc.fanxingAutoWire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
public class StoreConfig {
	
	@Autowired
	private Store<String> s1;
	
	@Autowired
	private Store<Integer> s2;
	
	@Bean
	public StringStore stringStore(){
		return new StringStore();
	}
	
	@Bean
	public IntegerStore integerStore(){
		return new IntegerStore();
	}
	
	public void syso(){
		System.out.println(s1.getClass().getName());
		System.out.println(s2.getClass().getName());
	}
	
	

}
