package com.szxy.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 *  测试 TreeSet
 */
public class TreeSetTest {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// JDK7 钻石语法， TreeSet 后面不需要加泛型 T
		Set<Student> tset = new TreeSet<>();
	
		List<Student> stuList = new ArrayList<>();
		Student xiaoming = new Student("血纯茗雅", 24);
		stuList.add(xiaoming);
		stuList.add(xiaoming);
		stuList.add(new Student("店小二", 25));
		stuList.add(new Student("小张", 27));
		stuList.add(new Student("小李子", 19));
		for (Student stu : stuList) {
			System.out.println(stu);
		}
		System.out.println("====================");
		// 去掉 stuList 中重复元素，包括年龄相同的，也不添加
		// 按照年龄降序升序 
		tset.addAll(stuList);
		for (Student stu : tset) {
			System.out.println(stu);
		}
		/***
		 *   使用 Collections 排序，按照名字升序排列
		 */
		System.out.println("====================");
		Collections.sort(stuList, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		for (Student stu : stuList) {
			System.out.println(stu);
		}
	}
}
