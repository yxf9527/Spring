package com.imooc.ioc.service;

import com.imooc.ioc.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {

	private InjectionDao dao;
	
	public InjectionServiceImpl(){}
	
	/**
	 * 注入方式1
	 * 设置注入
	 * */
	public void setDao(InjectionDao dao) {
		this.dao = dao;
	}
	
	/**
	 * 注入方式2
	 * 构造注入
	 * */
	public InjectionServiceImpl(InjectionDao dao){
		this.dao = dao;
	}
	
	@Override
	public void save() {
		System.out.println("业务类InjectionServiceImpl实现save操作");
		dao.save();
	}


}
