package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanApplicationContext implements ApplicationContextAware,BeanNameAware {

	private String beanName;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("MoocApplicationContext:"+arg0.getBean(beanName).hashCode());
	}

	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
		//benaname:获取配置中加载的beanid
		System.out.println("benaname:"+arg0);
	}

}
