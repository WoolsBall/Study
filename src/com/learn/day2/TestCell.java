package com.learn.day2;

import org.junit.Test;

public class TestCell {

	/**
	 * 测试toString方法
	 */
	@Test
	public void testToString(){
		Cell cell=new Cell(6,3);
		//默认调用是指输出对象时会默认调用toString方法。
		System.out.println(cell);//6,3
	}
	
	/**
	 * 测试equals方法
	 */
	@Test
	public void testEquals(){
		Cell cell1=new Cell(6,3);
		Cell cell2=new Cell(6,3);
		System.out.println(cell1==cell2);//flase
		System.out.println(cell1.equals(cell2));//true
	}
}
