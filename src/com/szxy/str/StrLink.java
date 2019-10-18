package com.szxy.str;

/**
 *  
 * @author zwer
 *
 */
public class StrLink {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = s1+"b"; 
		String s3 = "a"+"b"; // javac 编译在编译期间对字符串常量相加优化
		System.out.println(s2 == "ab");
		System.out.println(s3 == "ab");
		/**
		 * 第一条语句打印的结果为 false，第二条语句打印的结果为 true，这说明
		 * javac 编译可以对字符串常量直接相加的表达式进行优化，不必要等到运行
		 * 期去进行加法运算处理，而是在编译时去掉其中的加号，直接将其编译成一
	     * 个这些常量相连的结果。
		 */
		String s4 = "a"+"b"+"c"+"d";//只创建一个对象
		System.out.println(s4); 
	}
}
