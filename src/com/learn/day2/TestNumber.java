package com.learn.day2;

import org.junit.Test;

public class TestNumber {
	/**
	 * 测试Number的intValue方法和doubleValue方法
	 */
	@Test
	public void testIntValueAndDoubleValue(){
		Number d=123.45;
		Number n=123;
		System.out.println(d.getClass().getName());
		System.out.println(n.getClass().getName());
		double d1=d.doubleValue();
		double n1=n.doubleValue();
		System.out.println(d1+","+n1);
		int d2=d.intValue();
		int n2=n.intValue();
		System.out.println(d2+","+n2);
	}
	
	/**
	 * 测试Integer的parseInt方法
	 */
	@Test
	public void testParseInt(){
		String str="123";
		int str1=Integer.parseInt(str);
		System.out.println(str1);
		String num="壹佰贰拾叁";
		int num1=Integer.parseInt(num);
		System.out.println(num1);
				
	}
	
	/**
	 * 测试Double的parseDouble方法
	 */
	@Test
	public void testParseDouble(){
		String str="123.00";
		double str1=Double.parseDouble(str);
		System.out.println(str1);
		String num="¥123.00";
		double num1=Double.parseDouble(num);
				
	}

}
