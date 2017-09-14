package com.learn.day9;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TestBlockingQueue {
	/**
	 * 测试入队方法
	 */
	@Test
	public void testOffer() {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
		 for(int i=0;i<20;i++){
	            try {
	                //设置5秒超时，5秒内元素仍没有入队到队列中，则返回false
	                boolean b = queue.offer(i,2,TimeUnit.SECONDS);
	                System.out.println("存入是否成功:"+b);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }    
	}
	
	 /**
     * 测试出队方法
     */
    @Test
    public void testPull() {
        BlockingQueue<Integer> queue 
            = new ArrayBlockingQueue<Integer>(10);
        for(int i=0;i<10;i++){
            queue.offer(i);
        }    
        for(int i =0;i<20;i++){
            //获取元素，设置5秒超时,5秒内还没有元素可取出则返回null
            try {
                Integer num = queue.poll(2, TimeUnit.SECONDS);
                System.out.println("元素:"+num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
