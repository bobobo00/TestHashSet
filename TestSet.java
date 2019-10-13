package cn.test.collection;
/**
 * set:无序不可重复，调用equals方法当相等时不能加入但不会报错。
 * list:有序可重复。
 */

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();//底层实现调用HashMap,只使用了map中的key。value是一个固定值。
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
