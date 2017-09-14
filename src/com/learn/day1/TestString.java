package com.learn.day1;

import org.junit.Test;

public class TestString {
	/**
	 * 测试String常量池
	 */
	@Test
	public void testConstantPool() {
		String str1="Hello";
		String str2="Hello";
		System.out.println(str1==str2); //true
		// 不会创建新的String对象，而是使用常量池中已有的"Hello".
		
		String str3=new String("Hello");
		System.out.println(str1==str3);//false
		// 使用new关键字会创建新的String对象.
	}
	
	/**
     * 获取String对象的长度
     */
	@Test
	public void testLength(){
		String str1=new String("Hello");
		String str2=new String("你好，String");
		System.out.println(str1.length());//5
		System.out.println(str2.length());//9
	}
	
	/**
     * 在一个字符串中检索另外一个字符串
     */
	@Test
	public void testIndexOf(){
		String str="i can because i think i can";
		int index=str.indexOf("can");
		System.out.println(index);//2
		
		index=str.lastIndexOf("can");
		System.out.println(index);//24
		
		index=str.indexOf("can", 6);
		System.out.println(index);//24
		
		//要检索的字符串不存在的情况,找不到则返回-1。
		index=str.indexOf("Can");
		System.out.println(index);//-1
	}
	
	 /**
     * 在一个字符串中截取指定的字符串
     */
	@Test
	public void testSubstring(){
		String str="www.oracle.com";
		String sub=str.substring(4, 10);
		System.out.println(sub);//oracle
		
		sub=str.substring(4);
		System.out.println(sub);//oracle.com

	}
	
	/**
     * 去掉一个字符串的前导和后继空字符
     */
	@Test
	public void testTrim(){
		String str=" testTrim ";
		String trim=str.trim();
		System.out.println(str.length());//10
		System.out.println(trim.length());//8
		System.out.println(trim);//testTrim
	}
	
	/**
     * 遍历一个字符串中的字符序列
     */
	@Test
	public void testCharAt(){
		String str="Hello World";
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			System.out.print(c+"\t");
			//H  e  l  l  o     W  o  r  l  d
		}
	}
	
	 /**
     * 检测一个字符串是否以指定字符串开头或结尾
     */
	@Test
	public void testStartsEndsWith(){
		String str="hero comes and go,but legend is forever";
		System.out.println( str.startsWith("H"));//false
		System.out.println(str.startsWith("c", 5));//true
		System.out.println(str.endsWith("r"));//true
	}
	
	/**
     * 转换字符串中英文字母的大小写形式
     */
	@Test
	public void testToUpperCaseAndToLowerCase(){
		String str="我喜欢Java";
		str=str.toLowerCase();
		System.out.println(str);//我喜欢java
		str=str.toUpperCase();
		System.out.println(str);//我喜欢JAVA
	}
	
	/**
     * 将其他类型转换为字符串类型
     */
	@Test
	public void testValueOf(){
		double pi=3.1415926;
		int value=123;
		boolean flag=true;
		char[] charArr={'a','b','c','d'};
		
		String str=String.valueOf(pi);
		System.out.println(str);
		str=String.valueOf(value);
	    System.out.println(str);
	    str=String.valueOf(flag);
	    System.out.println(str);
	    str=String.valueOf(charArr);
	    System.out.println(str);
	}
}
