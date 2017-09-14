package com.learn.day2;

import org.junit.Test;

public class TestCell {

	/**
	 * ����toString����
	 */
	@Test
	public void testToString(){
		Cell cell=new Cell(6,3);
		//Ĭ�ϵ�����ָ�������ʱ��Ĭ�ϵ���toString������
		System.out.println(cell);//6,3
	}
	
	/**
	 * ����equals����
	 */
	@Test
	public void testEquals(){
		Cell cell1=new Cell(6,3);
		Cell cell2=new Cell(6,3);
		System.out.println(cell1==cell2);//flase
		System.out.println(cell1.equals(cell2));//true
	}
}
