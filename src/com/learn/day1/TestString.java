package com.learn.day1;

import org.junit.Test;

public class TestString {
	/**
	 * ����String������
	 */
	@Test
	public void testConstantPool() {
		String str1="Hello";
		String str2="Hello";
		System.out.println(str1==str2); //true
		// ���ᴴ���µ�String���󣬶���ʹ�ó����������е�"Hello".
		
		String str3=new String("Hello");
		System.out.println(str1==str3);//false
		// ʹ��new�ؼ��ֻᴴ���µ�String����.
	}
	
	/**
     * ��ȡString����ĳ���
     */
	@Test
	public void testLength(){
		String str1=new String("Hello");
		String str2=new String("��ã�String");
		System.out.println(str1.length());//5
		System.out.println(str2.length());//9
	}
	
	/**
     * ��һ���ַ����м�������һ���ַ���
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
		
		//Ҫ�������ַ��������ڵ����,�Ҳ����򷵻�-1��
		index=str.indexOf("Can");
		System.out.println(index);//-1
	}
	
	 /**
     * ��һ���ַ����н�ȡָ�����ַ���
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
     * ȥ��һ���ַ�����ǰ���ͺ�̿��ַ�
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
     * ����һ���ַ����е��ַ�����
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
     * ���һ���ַ����Ƿ���ָ���ַ�����ͷ���β
     */
	@Test
	public void testStartsEndsWith(){
		String str="hero comes and go,but legend is forever";
		System.out.println( str.startsWith("H"));//false
		System.out.println(str.startsWith("c", 5));//true
		System.out.println(str.endsWith("r"));//true
	}
	
	/**
     * ת���ַ�����Ӣ����ĸ�Ĵ�Сд��ʽ
     */
	@Test
	public void testToUpperCaseAndToLowerCase(){
		String str="��ϲ��Java";
		str=str.toLowerCase();
		System.out.println(str);//��ϲ��java
		str=str.toUpperCase();
		System.out.println(str);//��ϲ��JAVA
	}
	
	/**
     * ����������ת��Ϊ�ַ�������
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
