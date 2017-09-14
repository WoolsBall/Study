package com.learn.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

public class TestCollection {

	/**
	 * ���ϳ��ж��������
	 */
	@Test
	public void testRsf() {
		Collection<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell(1, 2));
		Cell cell = new Cell(2, 3);
		cells.add(cell);
		System.out.println(cell);
		System.out.println(cells);
		cell.drop();
		System.out.println(cell);
		System.out.println(cells);
	}

	/**
	 * ����add����
	 */
	@Test
	public void testAdd() {
		Collection<String> c = new ArrayList<String>();
		System.out.println(c); // []
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c); // [a, b, c]
	}

	/**
	 * ����contains����
	 */
	@Test
	public void testContains() {
		Collection<Cell> cells = new ArrayList<Cell>();
		Cell c1 = new Cell(1, 2);
		Cell c2 = new Cell(1, 3);
		Cell c3 = new Cell(2, 2);
		Cell c4 = new Cell(2, 3);
		cells.add(c1);
		cells.add(c2);
		cells.add(c3);
		cells.add(c4);
		Cell cell = new Cell(1, 3);
		boolean flage = cells.contains(cell);
		System.out.println(flage);
	}

	/**
	 * ����size������clear������isEmpty����
	 */
	@Test
	public void testSizeAndClearAndIsEmpty() {
		Collection<String> c = new HashSet<String>();
		System.out.println(c.isEmpty());
		c.add("java");
		c.add("cpp");
		c.add("php");
		c.add("c#");
		c.add("objective-c");
		System.out.println("isEmpty:" + c.isEmpty() + ",size: " + c.size());
		// isEmpty:false, size: 5
		c.clear();
		System.out.println("isEmpty:" + c.isEmpty() + ", size: " + c.size());
		// isEmpty:true, size: 0
	}

	/**
	 * ����addAll�����Լ�containsAll����
	 */
	@Test
	public void testAddAllAndContainsAll() {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("java");
		c1.add("cpp");
		c1.add("php");
		c1.add("c#");
		c1.add("objective-c");
		System.out.println(c1); // [java, cpp, php, c#, objective-c]

		Collection<String> c2 = new HashSet<String>();
		c2.addAll(c1);
		System.out.println(c2);

		Collection<String> c3 = new ArrayList<String>();
		c1.add("java");
		c1.add("cpp");
		c1.add("php");
		boolean flage = c1.containsAll(c3);
		System.out.println(flage);
	}
	
	 /**
     * ����Iterator��hasNext������next����
     */
    @Test
    public void testHasNextAndNext() {
        Collection<String> c = new HashSet<String>();
        c.add("java");
        c.add("cpp");
        c.add("php");
        c.add("c#");
        c.add("objective-c");
        Iterator<String> it=c.iterator();
        while(it.hasNext()){
        	String str=it.next();
        	System.out.println(str);
        }
    }
    
    /**
     * ����Iterator��remove����
     */
    @Test
    public void testRemove() {
        Collection<String> c = new HashSet<String>();
        c.add("java");
        c.add("cpp");
        c.add("php");
        c.add("c#");
        c.add("objective-c");
        System.out.println(c); // [cpp, php, c#, java, objective-c]
        Iterator<String> it=c.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (str.indexOf('c') != -1) {
                it.remove();
            }
        }
        System.out.println(c); // [php, java]
    }
    
    /**
     * ����foreachѭ��(��ǿforѭ��)
     */
    @Test
    public void testForeach() {
        Collection<String> c = new HashSet<String>();
        c.add("java");
        c.add("cpp");
        c.add("php");
        c.add("c#");
        c.add("objective-c");
        for (String str : c) {
            System.out.print(str.toUpperCase() + " ");
        }
        // CPP PHP C# JAVA OBJECTIVE-C
    }
}
