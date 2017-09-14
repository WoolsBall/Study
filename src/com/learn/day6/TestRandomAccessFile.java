package com.learn.day6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.junit.Test;

/**
 * ����RandomAccessFile
 */
public class TestRandomAccessFile {
	/**
	 * ����д����write������
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
	 * ���Զ�ȡ��read������
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
	 * ����RandomAccessFile��read(byte[])��write(byte[])����
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
		System.out.println("��ȡ���ˣ�" + len + "���ֽ�");
		System.out.println(new String(sub));
		raf.close();
	}

	/**
	 * ����ָ����ط���
	 * 
	 * @throws Exception
	 */
	@Test
	public void testPointer() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("raf1.dat", "r");
		// ���ָ��λ��,Ĭ�ϴ�0��ʼ(�ļ��ĵ�һ���ֽ�λ��)
		System.out.println("ָ��λ��:" + raf.getFilePointer());
		raf.skipBytes(5);
		System.out.println("ָ��λ��:" + raf.getFilePointer());
		// ��ȡworld��5���ֽ�
		byte[] buf = new byte[5];
		raf.read(buf);
		System.out.println(new String(buf));
		System.out.println("ָ��λ��:" + raf.getFilePointer());
		raf.seek(0);
		System.out.println("ָ��λ��:" + raf.getFilePointer());
		raf.close();
	}
}
