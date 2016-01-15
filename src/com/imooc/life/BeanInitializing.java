package com.imooc.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanInitializing implements InitializingBean,DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("通过实现接口InitializingBean实现初始化Bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("通过实现接口DisposableBean方法实现销毁");
	}

}
