package com.szxy.str;

public class smallT {
	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = new String("Hello World");
		String s3 = "Hello "+"World";
		System.out.println(s1 == s2); 
		System.out.println(s1 == s3 );
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));		
		// intern 方法：对于任意两个字符串 s 和 t，当且仅当 s.equals(t)
	    // 为 true 时，s.intern() == t.intern() 才为 true。
		System.out.println(s1.intern() == s2.intern());
		
	}
}
