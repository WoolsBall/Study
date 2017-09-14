package com.learn.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import org.junit.Test;

public class TestSort {
	/**
	 * ����sort����
	 */
	@Test
	public void testSort() {
		Random r=new Random(1);
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(100));
		}
		System.out.println(list);
		
		//ʹ��sort������������
		Collections.sort(list);
		System.out.println(list);

	}
	
	/**
	 * ����comparator�ӿ�ʵ������
	 */
	@Test
	public void testComparator(){
		List<Cell> cells=new ArrayList<Cell>();
		cells.add(new Cell(2,3));
		cells.add(new Cell(5,1));
		cells.add(new Cell(3,2));
		System.out.println(cells);
		 // ����colֵ�Ĵ�С����
        Collections.sort(cells, new Comparator<Cell>() {
            @Override
            public int compare(Cell o1, Cell o2) {
                return o1.col - o2.col;
            }
        });
        System.out.println(cells); // [(5,1), (3,2), (2,3)]
	}
}
