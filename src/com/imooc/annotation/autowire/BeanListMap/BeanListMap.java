package com.imooc.annotation.autowire.BeanListMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanListMap {
	
	//@Autowired注解可以初始化list元素 @Order注解只可以改变list集合的顺序  不能通过注解的方式改变map的元素顺序
	@Autowired
	private List<BeanInterface> list;
	
	//@Autowired注解可以初始化map，，生成的key值是生成的配置的bean的id，
	@Autowired
	private Map<String,BeanInterface> map;
	
	public void say(){
		if(list!=null && list.size()!=0){
			for (BeanInterface inter : list) {
				System.out.println(inter.getClass().getName());
			}
		}
		
		if(map!=null && map.size()!=0){
			for (Entry<String, BeanInterface> inter : map.entrySet()) {
				System.out.println(inter.getKey()+"-->"+inter.getValue().getClass().getName());
			}
		}
	}
	
	

}
