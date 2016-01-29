package com.imooc.jsr;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


//@Service
@Named("jsr")
public class JsrService {
	
	//此处@Resource注解同于@AutoWired
//	@Resource
	@Inject
	private JsrDao dao;
	
	private JsrInterface inter;
	
	@Inject
	public void setInter(@Named("impl1")JsrInterface inter) {
		this.inter = inter;
	}

	@Resource
	public void setDao(@Named("jsrDao")JsrDao dao) {
		this.dao = dao;
	}

	public void save(){
		System.out.println("业务类save方法");
		this.dao.save();
	}
	
	public void name(){
		System.out.println(this.inter.getClass().getName());
	}

	
}
