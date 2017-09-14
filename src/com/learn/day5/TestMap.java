package com.learn.day5;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class TestMap {
	private Map<Emp, String> employees = new HashMap<Emp, String>();

	@Before
	public void testPut() {
		// ��map�����Ԫ��
		employees.put(new Emp("����", 25, "��", 5000), "����");
		employees.put(new Emp("����", 21, "Ů", 6000), "����");
	}
	
	@Test
	public void testGet(){
		Emp zhangsan=new Emp("����",25,"��",5000);
	    String name=employees.get(zhangsan);
	    System.out.println(name);
	}
	
	@Test
	public void testContainsKey(){
		Emp zhangsan=new Emp("����",25,"��",5000);
		boolean has=employees.containsKey(zhangsan);
		System.out.println("�Ƿ���Ա������: "+has);
	}
}
