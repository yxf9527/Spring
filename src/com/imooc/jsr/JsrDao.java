package com.imooc.jsr;

import org.springframework.stereotype.Repository;

@Repository
public class JsrDao {
	
	public void save(){
		System.out.println("数据库save保存方法");
	}

}
