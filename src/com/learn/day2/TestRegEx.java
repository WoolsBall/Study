package com.learn.day2;

import java.util.Arrays;

import org.junit.Test;

public class TestRegEx {
	 /**
     * 
     * ����email�Ƿ�Ϸ�
     */
    @Test
    public void email() {
    	String emailRegEx =
   			 "^[a-zA-Z0-9_\\.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
    	  
    	String email = "bjliyi@tarena.com.cn";
        System.out.println(email.matches(emailRegEx));
    }   
    
    /**
     * ʹ��split��������ַ���
     * 
     */
    @Test
    public void testSplit() {
    	//���ո���
        String str="c# java cpp php c";
        String[] arr=str.split("\\s");
        System.out.println(Arrays.toString(arr));
        
       // ��+��-��=���Ų��
        String line = "100+200-150=150";
        arr = line.split("[\\+\\-=]");
        System.out.println(Arrays.toString(arr));
    }
    
    /**
     * ʹ��replaceAll����ʵ���ַ����滻
     * 
     */
    @Test
    public void testReplaceAll() {
        // ��str�е����������滻Ϊ�����֡�����
        String str = "abc123bcd45ef6g7890";
        str = str.replaceAll("\\d+", "����");
        System.out.println(str);
    }
}
