package com.szxy.integer;

public class IntegerTest {
	public static void main(String[] args) {
		Integer a1=100,a2=100,a3=150,a4=150,a6=128;
		/**
		 *  Integer 自动装箱底层是调用 valueOf 方法
		 *  当调用 valueOf 方法时，会对传入的 int 类型的变量做判断
		 *  若该 int 变量大于 -128 而小于 127
		 *  则直接从 Integer 数组中取出该 int 变量对应的 Integer 对象实例
		 *  反之则新创建一个 Integer 对象
		 */
		Integer a5 = Integer.valueOf(128);
		System.out.println((a1 == a2) +" "+ (a6 == a5));
		System.out.println(a3 == a4);
	}
}
