package com.learn.day6;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import org.junit.Test;

public class TestFile {

	/**
	 * 测试文件长度
	 */
	@Test
	public void testLength() {
		File file = new File("demo" + File.separator + "HelloWorld.txt");
		System.out.println(file + "占用字节量:" + file.length());
	}

	/**
	 * 创建空文件
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
	 * 删除文件夹
	 */
	@Test
	public void testDeleteFile() {
		File file = new File("E:/javafile/demo/HelloWorld.txt");
		file.delete();
	}

	/**
	 * 创建文件目录
	 */
	@Test
	public void testMkDir() {
		File dir = new File("myDir");
		dir.mkdir();
		// 创建多级目录
		File file = new File("a" + File.separator + "b" + File.separator + "c");
		file.mkdirs();
	}

	/**
	 * 删除目录
	 */
	@Test
	public void testDeleteDir() {
		File file = new File("a" + File.separator + "b" + File.separator + "c");
		file.delete();
	}
	
	/**
	 * 输出当前目录下所有的内容
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
	 * 测试FileFilter方法
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
