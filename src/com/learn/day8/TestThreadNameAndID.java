package com.learn.day8;

public class TestThreadNameAndID {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		Thread t1=new Thread();
		System.out.println(t1.getName());
		System.out.println(t1.getId());
		
		Thread t2=new Thread("MyThread¿ªÊ¼");
		System.out.println(t2.getName());
		System.out.println(t2.getId());

	}
}
