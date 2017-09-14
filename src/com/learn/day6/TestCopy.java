package com.learn.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class TestCopy {

	/**
	 * 测试使用字节形式复制文件
	 * @throws Exception 
	 */
	@Test
	public void testCopyFile1() throws Exception{
		FileInputStream fis=new FileInputStream("fos.dat");
		FileOutputStream fos=new FileOutputStream("fos_copy.dat");
		int d=-1;
		while((d=fis.read())!=-1){
			fos.write(d);
		}
		System.out.println("复制完毕！");
		fis.close();
		fos.close();
	}
	
	/**
     * 测试使用字节数组形式复制文件
     */
    @Test
    public void testCopyFile2()throws Exception{
    	FileInputStream fis=new FileInputStream("fos.dat");
		FileOutputStream fos=new FileOutputStream("fos_copy.dat");
		int d=-1;
		byte[] sub=new byte[30];
		while((d=fis.read(sub))!=-1){
			fos.write(sub, 0, d);;
		}
		System.out.println("复制完毕");
        fis.close();
        fos.close();
    }
}
