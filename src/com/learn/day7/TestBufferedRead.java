package com.learn.day7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.Test;

public class TestBufferedRead {
	  /**
     * 使用缓冲字符输入流读取文本文件
     * @throws Exception
     */
    @Test
    public void testBufferedReader()throws Exception{
        FileInputStream fis=new FileInputStream("pw.txt");
        InputStreamReader isd=new InputStreamReader(fis);
        BufferedReader bd=new BufferedReader(isd);
        String line=null;
        while((line=bd.readLine())!=null){
        	System.out.println(line);
        }
        bd.close();
    }
}
