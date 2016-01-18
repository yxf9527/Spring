package com.imooc.annotation.autowire.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDaoImpl implements InjectionDao {

	@Override
	public void save() {
		System.out.println("InjectionDaoImpl实现类实现save");
	}

}
