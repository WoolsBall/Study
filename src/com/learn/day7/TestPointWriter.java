package com.learn.day7;

import java.io.PrintWriter;

import org.junit.Test;

public class TestPointWriter {
	/**
     * ���Ի����ַ������
     * @throws Exception
     */
    @Test
    public void testPrintWriter()throws Exception{
        PrintWriter pw=new PrintWriter("pw.txt");
        pw.println("��Һ�!");
        pw.println("hello!");
        pw.println("bye!");
        pw.close();
    }
}
