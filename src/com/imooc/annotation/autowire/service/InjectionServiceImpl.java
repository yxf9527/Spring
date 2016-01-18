package com.imooc.annotation.autowire.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.annotation.autowire.dao.InjectionDao;


@Service
public class InjectionServiceImpl{

//	@Autowired
	private InjectionDao dao;
	
	
//	@Autowired
	public void setDao(InjectionDao dao) {
		this.dao = dao;
	}
	
	@Autowired
	public InjectionServiceImpl(InjectionDao dao){
		this.dao = dao;
	}



	public void save() {
		dao.save();
		System.out.println("InjectionServiceImpl业务处理类");
	}

}
