package com.learn.day8;

public class TestCurrentThread {
	/**
     * ���Բ�ͬ�̵߳��ø÷���ʱ����ȡ����߳�
     */
    public static void testCurrent(){
        System.out.println("����testCurrent�������߳���:"+Thread.currentThread());
    }
    
    public static void main(String[] args) {
    	 System.out.println("����main�������߳�:"+Thread.currentThread());
         testCurrent();
         Thread t=new Thread(){
        	 public void run(){
        		 System.out.println("�߳�t:"+Thread.currentThread());
        		 testCurrent();
        	 }
         };
         t.start();
	}
}
