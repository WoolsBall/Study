package com.learn.day3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import org.junit.Test;

public class TestCalendar {

	/**
	 * ����getInstance����
	 */
	@Test
	public void testGetInstance() {
		Calendar c = Calendar.getInstance();
		// ���Calendar����������ʵ������
		System.out.println(c.getClass().getName());
		// getTime�������ض�Ӧ��Date����
		System.out.println(c.getTime());
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());

	}

	/**
	 * ����set����
	 */
	@Test
	public void testSet() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2017);
		c.set(Calendar.MONTH, Calendar.DECEMBER);
		c.set(Calendar.DATE, 24);
		System.out.println(c.getTime());

		c.set(Calendar.DATE, 32);// û��32����ת����һ����
		System.out.println(c.getTime());
	}

	/**
	 * ����get����
	 */
	@Test
	public void testGet() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2017);
		c.set(Calendar.MONTH, Calendar.AUGUST);
		c.set(Calendar.DATE, 24);

		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
	}

	/**
	 * ����ĳһ��ĸ����·ݵ�����
	 */
	@Test
	public void testGetActualMaximum() {
		int year = 2017;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.DATE, 1);
		for (int month = Calendar.JANUARY; month < Calendar.DECEMBER; month++) {
			c.set(Calendar.MONTH, month);
			System.out.println(year + "��" + (month + 1) + "��"
					+ c.getActualMaximum(Calendar.DATE) + "��");

		}
	}

	/**
	 * ����Add����
	 */
	@Test
	public void testAdd() {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, 1);
		c.add(Calendar.MONTH, -3);
		System.out.println("year" + c.get(Calendar.YEAR));
		System.out.println("month" + (c.get(Calendar.MONTH) + 1));
		System.out.println("day" + c.get(Calendar.DATE));
	}

	/**
	 * ʹDate��ʾ��������Calendar��ʾ�����ڽ��л���
	 */
	@Test
	public void testSetTimeAndGetTime() {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		calendar.setTime(date);// ��Dateת��ΪCalendar
		date = calendar.getTime();// ��Calendarת��ΪDate
	}
}
