package com.learn.day8;

public class TestDaemonThread {
	public static void main(String[] args) {
		Thread d=new Thread(){
			public void run(){
				while(true){
					System.out.println("��̨�߳�");
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
		 //����������ǰ̨�߳̽����󣬺�̨�߳�ǿ�ƽ���
        System.out.println("main�߳̽�����");

	}
}
