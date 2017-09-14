package com.learn.day5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class TestHashMap {

	/**
	 * ͳ�Ƹ������������վ��PM2.5�����ֵ ʹ�õ���key�ķ�ʽ����map����
	 */
	@Test
	public void test1() {
		String pm25 = "ũչ��=423,����=378,��̨��԰=406,��̳=322,����������=398,"
				+ "��԰=406,ͨ��=366,��ƽ��=248,������=306,����=231,ǰ��=422,"
				+ "���ֵ�=368,�ų�=268,��ƽ��=423,������=267,����=377,ǰ��=299,"
				+ "���ֵ�=285,��ˮ��=277,ũչ��=348,����=356,��̨��԰=179,��̳=277,"
				+ "����������=270,��԰=268,ͨ��=315";
		String[] arr = pm25.split("[,=]");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i += 2) {
			if (!map.containsKey(arr[i])
					|| Integer.parseInt(arr[i + 1]) > map.get(arr[i])) {
				map.put(arr[i], Integer.parseInt(arr[i + 1]));
			}
		}
		System.out.println(map);

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

	/**
	 * ʹ�õ���Entry�ķ�ʽ����map����
	 */
	@Test
	public void test3() {
		String pm25 = "ũչ��=423,����=378,��̨��԰=406,��̳=322,����������=398,"
				+ "��԰=406,ͨ��=366,��ƽ��=248,������=306,����=231,ǰ��=422,"
				+ "���ֵ�=368,�ų�=268,��ƽ��=423,������=267,����=377,ǰ��=299,"
				+ "���ֵ�=285,��ˮ��=277,ũչ��=348,����=356,��̨��԰=179,��̳=277,"
				+ "����������=270,��԰=268,ͨ��=315";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] arr = pm25.split("[,=]");
		for (int i = 0; i < arr.length; i += 2) {
			if (!map.containsKey(arr[i])
					|| Integer.parseInt(arr[i + 1]) > map.get(arr[i])) {
				map.put(arr[i], Integer.parseInt(arr[i + 1]));
			}
		}
		System.out.println(map);
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	
	 /**
     * ����key�����˳���������
     */
    @Test
    public void test4() {
        String pm25 = "ũչ��=423,����=378,��̨��԰=406,��̳=322,����������=398,"
                + "��԰=406,ͨ��=366,��ƽ��=248,������=306,����=231,ǰ��=422,"
                + "���ֵ�=368,�ų�=268,��ƽ��=423,������=267,����=377,ǰ��=299,"
                + "���ֵ�=285,��ˮ��=277,ũչ��=348,����=356,��̨��԰=179,��̳=277,"
                + "����������=270,��԰=268,ͨ��=315";
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] arr = pm25.split("[,=]");
        for (int i = 0; i < arr.length; i += 2) {
            if (!map.containsKey(arr[i])
                    || Integer.parseInt(arr[i + 1]) > map.get(arr[i])) {
                map.put(arr[i], Integer.parseInt(arr[i + 1]));
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
    }
    /**
     * ����key�����˳���������
     */
    @Test
    public void test5() {
        String pm25 = "ũչ��=423,����=378,��̨��԰=406,��̳=322,����������=398,"
                + "��԰=406,ͨ��=366,��ƽ��=248,������=306,����=231,ǰ��=422,"
                + "���ֵ�=368,�ų�=268,��ƽ��=423,������=267,����=377,ǰ��=299,"
                + "���ֵ�=285,��ˮ��=277,ũչ��=348,����=356,��̨��԰=179,��̳=277,"
                + "����������=270,��԰=268,ͨ��=315";
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] arr = pm25.split("[,=]");
        for (int i = 0; i < arr.length; i += 2) {
            if (!map.containsKey(arr[i])
                    || Integer.parseInt(arr[i + 1]) > map.get(arr[i])) {
                map.put(arr[i], Integer.parseInt(arr[i + 1]));
            }
        }
        Set<Map.Entry<String, Integer>> entrys = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrys) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}


