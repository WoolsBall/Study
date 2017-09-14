package com.learn.day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class TestMap {
	private Map<Emp, String> employees = new HashMap<Emp, String>();

	@Before
	public void testPut() {
		// 向map中添加元素
		employees.put(new Emp("张三", 25, "男", 5000), "张三");
		employees.put(new Emp("李四", 21, "女", 6000), "李四");
	}
	
	@Test
	public void testGet(){
		Emp zhangsan=new Emp("张三",25,"男",5000);
	    String name=employees.get(zhangsan);
	    System.out.println(name);
	}
	
	@Test
	public void testContainsKey(){
		Emp zhangsan=new Emp("张三",25,"男",5000);
		boolean has=employees.containsKey(zhangsan);
		System.out.println("是否有员工张三: "+has);
	}
}
