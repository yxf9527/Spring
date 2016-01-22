package com.imooc.configWire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//通过该类生成配置文件
@Configuration
public class StoreConfig {
	
	//默认返回生成的bean的id是方法名getStore
	@Bean(name="store",initMethod="init",destroyMethod="destroy")
	public Store getStore(){
		return new StringStore();
	}
	

}
