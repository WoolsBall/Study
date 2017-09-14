package com.learn.day6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;


/**
 * �����ļ��ֽ������
 */
public class TestFileOutputStream {

	/**
	 * ���Ը���д��ʽ
	 * @throws Exception 
	 */
	@Test
	public void testFos() throws Exception{
		//�����ļ��ֽ������
        //FileOutputStream fos = new FileOutputStream(new File("fos.dat"));
		FileOutputStream fos=new FileOutputStream("fos.dat");
		fos.write("HelloWorld".getBytes());
		fos.close();
	}
	
	  /**
     * ����׷��д�ķ�ʽ
     */
    @Test
    public void testFosByAppend()throws Exception{
    	//�����ļ��ֽ������
        //FileOutputStream fos = new FileOutputStream(new File("fos.dat"),true );
    	FileOutputStream fos=new FileOutputStream("fos.dat",true);
		fos.write("HelloWorld".getBytes());
		fos.close();
    }
}
