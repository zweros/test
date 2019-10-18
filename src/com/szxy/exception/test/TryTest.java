package com.szxy.exception.test;

public class TryTest {
	
	public static void main(String[] args) {
		/*int i = hello();
		System.out.println(i);*/
		TestOuterAndInner();
		
	}
	
	@SuppressWarnings("finally")
	public static int hello(){
		try{
			throw new RuntimeException();
			//return 1;
		}finally{
			System.out.println("TryTest.hello() ==> finally");
			return 0;
		}
	}
	
	public  static void   TestOuterAndInner() {
		outer: for (int i = 0; i < 3; i++)
		inner: for (int j = 0; j < 2; j++) {
			if (j == 1)
				continue outer;
				System.out.println(j + " and " + i);
			} 
	}
	
	public static void example(){
		System.out.println("TryTest.example()");
	}
	
	public static void example(int m){
		System.out.println("TryTest.example()");
	}
	
	public static void example(long m){
		System.out.println("TryTest.example()");
	}
	
	/*private  void example(long m){
		System.out.println("TryTest.example()");
	}*/
	
	//类方法，使用 static 修改
	/*public static int example(int m){
		System.out.println("TryTest.example()");
		return m;
	}*/
	
	public static void example(int m,float f){
		System.out.println("TryTest.example()"+m+" "+f);
	}
	
	
}
