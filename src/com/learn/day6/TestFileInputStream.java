package com.learn.day6;

import java.io.FileInputStream;

import org.junit.Test;

/**
* �����ļ�������
*/
public class TestFileInputStream {

	/**
     *  �����ļ��������Ĵ����Լ���ȡ����
     */
    @Test
    public void testFis()throws Exception{
    	//���ݸ�����File���󴴽��ļ�������
        //FileInputStream fis = new FileInputStream(new File("fos.dat"));
        //���ݸ������ļ�·�������ļ�������
        FileInputStream fis = new FileInputStream("fos.dat");
        int d=-1;
        while((d=fis.read())!=-1){
        	System.out.println((char)d+" ");
        }
        fis.close();
    }
}
