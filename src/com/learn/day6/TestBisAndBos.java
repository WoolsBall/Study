package com.learn.day6;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

/**
 * ���Ի��ڻ������ĸ����ļ�
 */
public class TestBisAndBos {
   /**
    * ���Ի��ڻ������ĸ����ļ�
 * @throws Exception 
    */
	@Test
	public void testCopy() throws Exception{
		//���������ֽ�������
        FileInputStream fis = new FileInputStream("fos.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);
        
        //���������ֽ������
        FileOutputStream fos = new FileOutputStream("fos_copy3.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        int d = -1;
        while((d = bis.read()) != -1){
            bos.write(d);
        }
        
        System.out.println("�������");
        bis.close();
        bos.close();
	}
	
	
}
