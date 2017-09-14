package com.learn.day6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/**
 * 测试RandomAccessFile
 */
public class TestRandomAccessFile {
	/**
	 * 测试写出（write）方法
	 * 
	 * @throws Exception
	 */
	@Test
	public void testWrite() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		raf.write(1);
		raf.close();
	}

	/**
	 * 测试读取（read）方法
	 * 
	 * @throws IOException
	 */
	@Test
	public void testRead() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.dat", "rw");
		int d = raf.read();
		System.out.println(d);
		raf.close();
	}

	/**
	 * 测试RandomAccessFile的read(byte[])和write(byte[])方法
	 * 
	 * @throws IOException
	 */
	@Test
	public void testWriteByteArray() throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "rw");
		byte[] buf = "HelloWorld".getBytes();
		raf.write(buf);
		raf.close();
	}

	@Test
	public void testReadByteArray() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "r");
		byte[] sub = new byte[10];
		int len = raf.read(sub);
		System.out.println("读取到了：" + len + "个字节");
		System.out.println(new String(sub));
		raf.close();
	}

	/**
	 * 测试指针相关方法
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPointer() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "r");
		// 输出指针位置,默认从0开始(文件的第一个字节位置)
		System.out.println("指针位置:" + raf.getFilePointer());
		raf.skipBytes(5);
		System.out.println("指针位置:" + raf.getFilePointer());
		// 读取world这5个字节
		byte[] buf = new byte[5];
		raf.read(buf);
		System.out.println(new String(buf));
		System.out.println("指针位置:" + raf.getFilePointer());
		raf.seek(0);
		System.out.println("指针位置:" + raf.getFilePointer());
		raf.close();
	}
}
