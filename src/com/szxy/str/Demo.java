package com.szxy.str;

public class Demo {
	String str = new String("good");
	char[] c = {'a','b','c'};
	int  i = 10;
	
	public String change(String str,char[] c,int i){
		System.out.println(str+" "+c[0]+" "+i);
		str = "test Good!";
		c[0] = 'g';
		i = 11;
		return str;
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		String str = demo.change(demo.str, demo.c,demo.i);
		System.out.println(str);//test goods£¡
		System.out.println(demo.str);//test goods good
		System.out.println(demo.c);// g b c
		System.out.println(demo.i);//11 10
		//2*2  2*2*2  2*2*2*2
		System.out.println((2<<1)+" "+(2<<2)+" "+(2<<3));
		System.out.println("xyz".charAt(1)-'a');
		
	}
}
