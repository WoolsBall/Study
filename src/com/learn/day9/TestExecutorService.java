package com.learn.day9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutorService {
	public static void main(String[] args) {
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		 for(int i=0;i<5;i++){
	            Handler handler = new Handler();
	            threadPool.execute(handler);
	        }
	}

}
class Handler implements Runnable{

	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("执行当前任务的线程为:"+name);
		for(int i=0;i<10;i++){        
            System.out.println(name+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}
}