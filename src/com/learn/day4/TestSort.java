package com.learn.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class TestSort {
	/**
	 * 测试sort方法
	 */
	@Test
	public void testSort() {
		Random r=new Random(1);
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(100));
		}
		System.out.println(list);
		
		//使用sort方法进行排序
		Collections.sort(list);
		System.out.println(list);

	}
	
	/**
	 * 测试comparator接口实现排序
	 */
	@Test
	public void testComparator(){
		List<Cell> cells=new ArrayList<Cell>();
		cells.add(new Cell(2,3));
		cells.add(new Cell(5,1));
		cells.add(new Cell(3,2));
		System.out.println(cells);
		 // 按照col值的大小排序
        Collections.sort(cells, new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                return o1.col - o2.col;
            }
        });
        System.out.println(cells); // [(5,1), (3,2), (2,3)]
	}
}
