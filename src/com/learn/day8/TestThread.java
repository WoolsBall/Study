package com.learn.day8;
/**
 * �����߳���
 * @author Administrator
 *
 */
public class TestThread {
  
	/**
     * ���Զ��̲߳�������
     */
	public static void main(String[] args){
		Thread t1=new MyThread();
		Thread t2=new MyThread();
		t1.start();
		t2.start();
	
	}
	
}
/**
 *�߳� 
 */
class MyThread extends Thread{
	public void run(){
		for (int i = 0; i <=100; i++) {
			System.out.println(i);
		}
	}
}