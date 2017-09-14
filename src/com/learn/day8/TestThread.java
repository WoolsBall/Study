package com.learn.day8;
/**
 * 测试线程类
 * @author Administrator
 *
 */
public class TestThread {
  
	/**
     * 测试多线程并发运行
     */
	public static void main(String[] args){
		Thread t1=new MyThread();
		Thread t2=new MyThread();
		t1.start();
		t2.start();
	
	}
	
}
/**
 *线程 
 */
class MyThread extends Thread{
	public void run(){
		for (int i = 0; i <=100; i++) {
			System.out.println(i);
		}
	}
}