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
		// intern �������������������ַ��� s �� t�����ҽ��� s.equals(t)
	    // Ϊ true ʱ��s.intern() == t.intern() ��Ϊ true��
		System.out.println(s1.intern() == s2.intern());
		
	}
}
