package com.learn.day4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

public class TestQueueAndDeque {
	/**
     * 测试Queue的用法
     */
    @Test
    public void testQueue() {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        System.out.println(queue); // [a, b, c]
        String str = queue.peek();
        System.out.println(str); // a
        while (queue.size() > 0) {
            str = queue.poll();
            System.out.print(str + " "); // a b c
        }
    }
    
    /**
     * 测试Stack的用法
     */
    @Test
    public void testStack() {
        Deque<String> stack = new LinkedList<String>();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack); // [c, b, a]
        String str = stack.peek();
        System.out.println(str); // c
        while (stack.size() > 0) {
            str = stack.pop();
            System.out.print(str + " "); // c b a
        }
    }
}
