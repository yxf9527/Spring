package com.imooc.resource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;

public class ResourceTest {
	
	/*
	 * ClassPathResource获取类路径下资源
	 * */
	@Test
	public void testClassPathResource() throws IOException{
		ClassPathResource cpr = new ClassPathResource("classpath:springconfig/spring-life.xml");
		System.out.println(cpr.getFilename());
		if(cpr.isReadable()){
			InputStream is = cpr.getInputStream();
		}
	}
	
	/**
	 * FileSystemResource可以获取文件系统的文件资源
	 * @throws IOException 
	 * */
	@Test
	public void testFileSystemResource() throws IOException{
		FileSystemResource fsr = new FileSystemResource("f:/demo.txt");
		if(fsr.isReadable()){
			InputStream is = fsr.getInputStream();
			byte[] buff = new byte[1024];
			int a;
			while((is.read(buff, 0, buff.length))!=-1){
				String s = new String(buff,"gbk");
				System.out.println(s);
			}
			is.close();
		}
	}
	
	/**
	 * URLResource通过url获取资源
	 * 打印html源代码
	 * @throws IOException 
	 * */
	@Test
	public void testUrlResource() throws IOException{
		UrlResource ur = new UrlResource("http://haohaoxuexi.iteye.com/blog/2016305");
		if(ur.isReadable()){
			InputStream is = ur.getInputStream();
			int a;
			byte[] buff = new byte[1024];
			while((a=is.read(buff, 0, buff.length))!=-1){
				String s = new String(buff,"utf-8");
				System.out.println(s);
			}
			is.close();
		}
	}

}
