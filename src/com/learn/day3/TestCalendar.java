package com.learn.day3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

import org.junit.Test;

public class TestCalendar {

	/**
	 * 测试getInstance方法
	 */
	@Test
	public void testGetInstance() {
		Calendar c = Calendar.getInstance();
		// 输出Calendar对象所属的实际类型
		System.out.println(c.getClass().getName());
		// getTime方法返回对应的Date对象
		System.out.println(c.getTime());
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.getTime());

	}

	/**
	 * 测试set方法
	 */
	@Test
	public void testSet() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2017);
		c.set(Calendar.MONTH, Calendar.DECEMBER);
		c.set(Calendar.DATE, 24);
		System.out.println(c.getTime());

		c.set(Calendar.DATE, 32);// 没有32，跳转到下一个月
		System.out.println(c.getTime());
	}

	/**
	 * 测试get方法
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
	 * 测试某一年的各个月份的天数
	 */
	@Test
	public void testGetActualMaximum() {
		int year = 2017;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.DATE, 1);
		for (int month = Calendar.JANUARY; month < Calendar.DECEMBER; month++) {
			c.set(Calendar.MONTH, month);
			System.out.println(year + "年" + (month + 1) + "月"
					+ c.getActualMaximum(Calendar.DATE) + "天");

		}
	}

	/**
	 * 测试Add方法
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
	 * 使Date表示的日期与Calendar表示的日期进行互换
	 */
	@Test
	public void testSetTimeAndGetTime() {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		calendar.setTime(date);// 将Date转换为Calendar
		date = calendar.getTime();// 将Calendar转换为Date
	}
}
