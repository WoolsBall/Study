package com.learn.day3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestDate {

	/**
	 * 测试getTime方法
	 */
	@Test
	public void testGetDate(){
		Date date=new Date();
		System.out.println(date);
		long time=date.getTime();
		System.out.println(time);
	}
	
	/**
	 * 测试setTime方法
	 */
	@Test
	public void testSetTime(){
		Date date=new Date();
		System.out.println(date);
		long time=date.getTime();
		time+=60*60*24*1000;
		date.setTime(time);
		System.out.println(date);
	}
	
	/**
	 * 测试format方法
	 */
	@Test
	public void testFormat(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String dateStr=sdf.format(date);
		System.out.println(dateStr);
				
	}
	
	/**
	 * 测试parse方法
	 */
	@Test
	public void testParse(){
		String str="2017-8-24";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=sdf.parse(str);
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
