package com.learn.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class TestOisAndOos {
	 /**
     * ʹ��OOSʵ�ֶ�������л�
     */
    @Test
    public void testOOS()throws Exception{
    	FileOutputStream fos=new FileOutputStream("emp.obj");
    	ObjectOutputStream oos=new ObjectOutputStream(fos);
    	Emp emp=new Emp("����",15,"��",4000);
    	oos.writeObject(emp);
    	System.out.println("���л����");
    	oos.close();
    }
    
    /**
     * ʹ��OISʵ�ֶ���ķ����л�
     */
    @Test
    public void testOIS()throws Exception{
    	FileInputStream fis=new FileInputStream("emp.obj");
    	ObjectInputStream ois=new ObjectInputStream(fis);
    	Emp emp=(Emp) ois.readObject();
    	System.out.println("�����л����");
        System.out.println(emp);
        ois.close();
    }
}
