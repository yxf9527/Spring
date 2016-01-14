package com.imooc.ioc.dao;

public class InjectionDaoImpl implements InjectionDao {

	@Override
	public void save() {
		System.out.println("dao层InjectionDaoImpl类模拟数据库保存操作");
	}

}
