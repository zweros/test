package com.szxy.str;

public class StringTest {
	public static void main(String[] args) {

		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		String s3 = "Hello";
		String s4 = "Hello";
		System.out.println(s3 == s4);
		s1 = s3;
		s2 = s4;
		System.out.println(s1 == s2);
		
	}
}
