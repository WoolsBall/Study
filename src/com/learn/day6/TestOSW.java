package com.learn.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.junit.Test;

/**
 * �����ַ������
 * @author Administrator
 *
 */

public class TestOSW {

	/**
	 * ����ָ�����뽫�ַ���д��
	 * @throws Exception 
	 */
	@Test
	public void testOSW() throws Exception{
		FileOutputStream fos=new FileOutputStream("osw.txt");
		 //����ָ������д���ַ������������ƺ��Դ�Сд
		OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
		osw.write("Mr��");
		osw.close();
	}
	
	/**
	 * ����ָ�����뽫�ַ�������
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
