package com.learn.day6;

import java.io.FileInputStream;

import org.junit.Test;

/**
* 测试文件输入流
*/
public class TestFileInputStream {

	/**
     *  测试文件输入流的创建以及读取数据
     */
    @Test
    public void testFis()throws Exception{
    	//根据给定的File对象创建文件输入流
        //FileInputStream fis = new FileInputStream(new File("fos.dat"));
        //根据给定的文件路径创建文件输入流
        FileInputStream fis = new FileInputStream("fos.dat");
        int d=-1;
        while((d=fis.read())!=-1){
        	System.out.println((char)d+" ");
        }
        fis.close();
    }
}
