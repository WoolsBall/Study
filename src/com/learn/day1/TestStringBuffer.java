package com.learn.day1;

import org.junit.Test;

public class TestStringBuffer {
    
	/**
     * 测试StringBuilder的append方法
     */
	@Test
	public void testAppend(){
		StringBuffer sb=new StringBuffer("Programming Language:");
		sb=sb.append("java").append("cpp").append("php").append("c#").append("objective-c");
		System.out.println(sb.toString());
	}
	
	/**
     * 测试StringBuilder的insert方法
     */
    @Test
    public void testInsert() {
    	StringBuffer sb=new StringBuffer("Programming Language:javacppc#");
    	sb.insert(25, "php");
    	System.out.println(sb.toString());
    }
    
    /**
     * 测试StringBuffer的delete方法
     */
    @Test
    public void testDelete(){
    	StringBuffer sb=new StringBuffer("Programming Language:javacppc#");
    	sb.delete(25, 25+3);
    	System.out.println(sb.toString());
    	/*sb.deleteCharAt(25);
    	System.out.println(sb.toString());*/
    }
}
