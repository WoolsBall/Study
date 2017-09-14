package com.learn.day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class TestCopy {

	/**
	 * ����ʹ���ֽ���ʽ�����ļ�
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
		System.out.println("������ϣ�");
		fis.close();
		fos.close();
	}
	
	/**
     * ����ʹ���ֽ�������ʽ�����ļ�
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
		System.out.println("�������");
        fis.close();
        fos.close();
    }
}
