package com.learn.day6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;


/**
 * 测试文件字节输出流
 */
public class TestFileOutputStream {

	/**
	 * 测试覆盖写方式
	 * @throws Exception 
	 */
	@Test
	public void testFos() throws Exception{
		//创建文件字节输出流
        //FileOutputStream fos = new FileOutputStream(new File("fos.dat"));
		FileOutputStream fos=new FileOutputStream("fos.dat");
		fos.write("HelloWorld".getBytes());
		fos.close();
	}
	
	  /**
     * 测试追加写的方式
     */
    @Test
    public void testFosByAppend()throws Exception{
    	//创建文件字节输出流
        //FileOutputStream fos = new FileOutputStream(new File("fos.dat"),true );
    	FileOutputStream fos=new FileOutputStream("fos.dat",true);
		fos.write("HelloWorld".getBytes());
		fos.close();
    }
}
