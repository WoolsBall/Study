package com.learn.day9;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TestBlockingQueue {
	/**
	 * ������ӷ���
	 */
	@Test
	public void testOffer() {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
		 for(int i=0;i<20;i++){
	            try {
	                //����5�볬ʱ��5����Ԫ����û����ӵ������У��򷵻�false
	                boolean b = queue.offer(i,2,TimeUnit.SECONDS);
	                System.out.println("�����Ƿ�ɹ�:"+b);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }    
	}
	
	 /**
     * ���Գ��ӷ���
     */
    @Test
    public void testPull() {
        BlockingQueue<Integer> queue 
            = new ArrayBlockingQueue<Integer>(10);
        for(int i=0;i<10;i++){
            queue.offer(i);
        }    
        for(int i =0;i<20;i++){
            //��ȡԪ�أ�����5�볬ʱ,5���ڻ�û��Ԫ�ؿ�ȡ���򷵻�null
            try {
                Integer num = queue.poll(2, TimeUnit.SECONDS);
                System.out.println("Ԫ��:"+num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
