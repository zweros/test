package com.szxy.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 *  ���� TreeSet
 */
public class TreeSetTest {
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// JDK7 ��ʯ�﷨�� TreeSet ���治��Ҫ�ӷ��� T
		Set<Student> tset = new TreeSet<>();
	
		List<Student> stuList = new ArrayList<>();
		Student xiaoming = new Student("Ѫ������", 24);
		stuList.add(xiaoming);
		stuList.add(xiaoming);
		stuList.add(new Student("��С��", 25));
		stuList.add(new Student("С��", 27));
		stuList.add(new Student("С����", 19));
		for (Student stu : stuList) {
			System.out.println(stu);
		}
		System.out.println("====================");
		// ȥ�� stuList ���ظ�Ԫ�أ�����������ͬ�ģ�Ҳ�����
		// �������併������ 
		tset.addAll(stuList);
		for (Student stu : tset) {
			System.out.println(stu);
		}
		/***
		 *   ʹ�� Collections ���򣬰���������������
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
