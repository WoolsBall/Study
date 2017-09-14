package com.learn.day8;

public class TestJoin {

	public static void main(String[] args) {
		Thread t1=new Thread(){
			public void run(){
				for (int i = 0; i<=10; i++) {
					System.out.println("t1:��������ͼƬ��"+i*10+"%");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("ͼƬ�������");
			}
		};
		Thread t2=new Thread(){
			public void run(){
				System.out.println("t2:�ȴ�ͼƬ�������");
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t2:��ʾͼƬ");
			}
		};
		
		t1.start();
		t2.start();
	}
}
