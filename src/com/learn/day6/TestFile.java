package com.learn.day6;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.junit.Test;

public class TestFile {

	/**
	 * �����ļ�����
	 */
	@Test
	public void testLength() {
		File file = new File("demo" + File.separator + "HelloWorld.txt");
		System.out.println(file + "ռ���ֽ���:" + file.length());
	}

	/**
	 * �������ļ�
	 * 
	 * @throws IOException
	 */
	@Test
	public void testCreateNewFile() throws IOException {
		File file = new File("E:/javafile/demo/HelloWorld.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
	}

	/**
	 * ɾ���ļ���
	 */
	@Test
	public void testDeleteFile() {
		File file = new File("E:/javafile/demo/HelloWorld.txt");
		file.delete();
	}

	/**
	 * �����ļ�Ŀ¼
	 */
	@Test
	public void testMkDir() {
		File dir = new File("myDir");
		dir.mkdir();
		// �����༶Ŀ¼
		File file = new File("a" + File.separator + "b" + File.separator + "c");
		file.mkdirs();
	}

	/**
	 * ɾ��Ŀ¼
	 */
	@Test
	public void testDeleteDir() {
		File file = new File("a" + File.separator + "b" + File.separator + "c");
		file.delete();
	}
	
	/**
	 * �����ǰĿ¼�����е�����
	 */
	@Test
	public void testListFile(){
		File dir=new File(".");
		File[] subs=dir.listFiles();
		for (File sub : subs) {
			System.out.println(sub);
		}
	}
	
	/**
	 * ����FileFilter����
	 */
	@Test
	public void testFileFilter(){
		File file=new File(".");
		File[] subs=file.listFiles(new FileFilter(){
				public boolean accept(File file){
					return file.getName().endsWith(".txt");
				}
		});
		for (File sub : subs) {
			System.out.println(sub);
		}
	}
	
	
	
}
