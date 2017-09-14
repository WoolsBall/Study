package com.learn.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestList {

	/**
	 * 测试List的get、set方法
	 */
	@Test
	public void testSetAndGet() {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("cpp");
		list.add("php");
		list.add("c#");
		list.add("objective-c");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toUpperCase());
		}
		String str=list.set(1, "c++");
		System.out.println(str);
		System.out.println(list);
		list.set(1, list.set(3, list.get(1)));
		System.out.println(list);
	}
	
	 /**
     * 测试插入和移除元素
     */
    @Test
    public void testInsertAndRemove() {
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c#");
        System.out.println(list); // [java, c#]
        list.add(1, "c++");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
    
    /**
     * 测试subList方法
     */
    @Test
    public void testSubList() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
			list.add(i);
		}
    	System.out.println(list);
    	
    	List<Integer> subList=list.subList(3, 8);
        System.out.println(subList);
        
        for (int i = 0; i < subList.size(); i++) {
			subList.set(i, subList.get(i)*10);
		}
        System.out.println(subList);
        System.out.println(list);
        
        list.subList(3, 8).clear();
        System.out.println(list);
    }
    
    /**
     * 测试toArray方法
     */
    @Test
    public void testListToArray() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        String[] strArr = list.toArray(new String[] {});
        System.out.println(Arrays.toString(strArr)); // [a, b, c]
        
    }
    
    /**
     * 测试asList方法
     */
    @Test
    public void testArrayToList() {
        String[] strArr = { "a", "b", "c" };
        
        
        List<String> list = Arrays.asList(strArr);
        System.out.println(list); // [a, b, c]
        // list.add("d"); // 会抛出UnsupportedOperationException
        System.out.println(list.getClass().getName()); // java.util.Arrays$ArrayList
        
        //数组转换而来的集合的正确使用方式
        List<String> list1 = new ArrayList<String>();
        list1.addAll(Arrays.asList(strArr));
    }
}
