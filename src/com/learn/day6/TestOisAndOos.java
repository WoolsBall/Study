package com.learn.day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class TestOisAndOos {
	 /**
     * 使用OOS实现对象的序列化
     */
    @Test
    public void testOOS()throws Exception{
    	FileOutputStream fos=new FileOutputStream("emp.obj");
    	ObjectOutputStream oos=new ObjectOutputStream(fos);
    	Emp emp=new Emp("张三",15,"男",4000);
    	oos.writeObject(emp);
    	System.out.println("序列化完毕");
    	oos.close();
    }
    
    /**
     * 使用OIS实现对象的反序列化
     */
    @Test
    public void testOIS()throws Exception{
    	FileInputStream fis=new FileInputStream("emp.obj");
    	ObjectInputStream ois=new ObjectInputStream(fis);
    	Emp emp=(Emp) ois.readObject();
    	System.out.println("反序列化完毕");
        System.out.println(emp);
        ois.close();
    }
}
