package com.learn.day8;

public class TestDaemonThread {
	public static void main(String[] args) {
		Thread d=new Thread(){
			public void run(){
				while(true){
					System.out.println("后台线程");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		d.setDaemon(true);
		d.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 //进程中所有前台线程结束后，后台线程强制结束
        System.out.println("main线程结束了");

	}
}
