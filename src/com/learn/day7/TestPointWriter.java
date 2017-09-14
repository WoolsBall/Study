package com.learn.day7;

import java.io.PrintWriter;

import org.junit.Test;

public class TestPointWriter {
	/**
     * 测试缓冲字符输出流
     * @throws Exception
     */
    @Test
    public void testPrintWriter()throws Exception{
        PrintWriter pw=new PrintWriter("pw.txt");
        pw.println("大家好!");
        pw.println("hello!");
        pw.println("bye!");
        pw.close();
    }
}
