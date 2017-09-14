package com.learn.day6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * 测试基于缓冲流的复制文件
 */
public class TestBisAndBos {
   /**
    * 测试基于缓冲流的复制文件
 * @throws Exception 
    */
	@Test
	public void testCopy() throws Exception{
		//创建缓冲字节输入流
        FileInputStream fis = new FileInputStream("fos.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        //创建缓冲字节输出流
        FileOutputStream fos = new FileOutputStream("fos_copy3.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        int d = -1;
        while((d = bis.read()) != -1){
            bos.write(d);
        }
        
        System.out.println("复制完毕");
        bis.close();
        bos.close();
	}
	
	
}
