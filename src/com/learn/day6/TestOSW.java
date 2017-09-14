package com.learn.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 * 测试字符输出流
 * @author Administrator
 *
 */

public class TestOSW {

	/**
	 * 按照指定编码将字符串写出
	 * @throws Exception 
	 */
	@Test
	public void testOSW() throws Exception{
		FileOutputStream fos=new FileOutputStream("osw.txt");
		 //根据指定编码写出字符串，编码名称忽略大小写
		OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
		osw.write("Mr范");
		osw.close();
	}
	
	/**
	 * 按照指定编码将字符串读出
	 * @throws Exception 
	 */
	@Test
	public void testISR() throws Exception{
		FileInputStream fis=new FileInputStream("osw.txt");
		InputStreamReader isr=new InputStreamReader(fis,"GBK");
		int chs=-1;
		while((chs=isr.read())!=-1){
			System.out.println((char)chs);
		}
		isr.close();
	}
}
