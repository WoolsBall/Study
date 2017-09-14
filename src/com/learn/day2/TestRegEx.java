package com.learn.day2;

import java.util.Arrays;

import org.junit.Test;

public class TestRegEx {
	 /**
     * 
     * 测试email是否合法
     */
    @Test
    public void email() {
    	String emailRegEx =
   			 "^[a-zA-Z0-9_\\.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9]{2,4}$";
    	  
    	String email = "bjliyi@tarena.com.cn";
        System.out.println(email.matches(emailRegEx));
    }   
    
    /**
     * 使用split方法拆分字符串
     * 
     */
    @Test
    public void testSplit() {
    	//按空格拆分
        String str="c# java cpp php c";
        String[] arr=str.split("\\s");
        System.out.println(Arrays.toString(arr));
        
       // 按+、-、=符号拆分
        String line = "100+200-150=150";
        arr = line.split("[\\+\\-=]");
        System.out.println(Arrays.toString(arr));
    }
    
    /**
     * 使用replaceAll方法实现字符串替换
     * 
     */
    @Test
    public void testReplaceAll() {
        // 将str中的所有数字替换为“数字”二字
        String str = "abc123bcd45ef6g7890";
        str = str.replaceAll("\\d+", "数字");
        System.out.println(str);
    }
}
