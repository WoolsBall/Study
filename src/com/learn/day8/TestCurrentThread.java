package com.learn.day8;

public class TestCurrentThread {
	/**
     * 测试不同线程调用该方法时，获取这个线程
     */
    public static void testCurrent(){
        System.out.println("运行testCurrent方法的线程是:"+Thread.currentThread());
    }
    
    public static void main(String[] args) {
    	 System.out.println("运行main方法的线程:"+Thread.currentThread());
         testCurrent();
         Thread t=new Thread(){
        	 public void run(){
        		 System.out.println("线程t:"+Thread.currentThread());
        		 testCurrent();
        	 }
         };
         t.start();
	}
}
