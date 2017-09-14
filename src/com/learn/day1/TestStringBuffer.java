package com.learn.day1;

import org.junit.Test;

public class TestStringBuffer {
    
	/**
     * ����StringBuilder��append����
     */
	@Test
	public void testAppend(){
		StringBuffer sb=new StringBuffer("Programming Language:");
		sb=sb.append("java").append("cpp").append("php").append("c#").append("objective-c");
		System.out.println(sb.toString());
	}
	
	/**
     * ����StringBuilder��insert����
     */
    @Test
    public void testInsert() {
    	StringBuffer sb=new StringBuffer("Programming Language:javacppc#");
    	sb.insert(25, "php");
    	System.out.println(sb.toString());
    }
    
    /**
     * ����StringBuffer��delete����
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
