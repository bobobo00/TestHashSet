package cn.test.collection;
/**
 * set:���򲻿��ظ�������equals���������ʱ���ܼ��뵫���ᱨ��
 * list:������ظ���
 */

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();//�ײ�ʵ�ֵ���HashMap,ֻʹ����map�е�key��value��һ���̶�ֵ��
		set.add(1);
		set.add(2);
		set.add(1);
		System.out.println(set);
		set.remove(1);
		System.out.println(set);
		
		Set<Integer> set1=new HashSet<>();
		set1.add(5);
		set1.add(6);
		set.addAll(set1);
		System.out.println(set);
	}

}
