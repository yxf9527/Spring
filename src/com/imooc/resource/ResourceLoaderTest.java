package com.imooc.resource;


import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

public class ResourceLoaderTest {
	
	/**
	 * 通过ResourceLoader获取资源
	 * */
	@Test
	public void test(){
		ResourceLoader loader = new DefaultResourceLoader();
		Resource source = loader.getResource("https://www.baidu.com/index.php?tn=16046049_dg");
		System.out.println(source instanceof UrlResource);//true
		System.out.println(source instanceof ClassPathResource);//false
		
		source = loader.getResource("classpath:springconfig/spring-life.xml");
		System.out.println(source instanceof UrlResource);//true
		System.out.println(source instanceof ClassPathResource);//false
		
	}

}
