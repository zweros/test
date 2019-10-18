package com.szxy.hash;

import java.util.HashSet;

public class HashTest {
	
	private String hello;
	private int i;
	
	
	public HashTest() {
		super();
	}

	public HashTest(String hello, int i) {
		this.hello = hello;
		this.i = i;
	}

	public static void main(String[] args) {
		HashTest test = new HashTest();
		System.out.println(test.hashCode());
		HashSet hs = new HashSet();
		hs.add(test);
		System.out.println(hs);
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hello == null) ? 0 : hello.hashCode());
		result = prime * result + i;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashTest other = (HashTest) obj;
		if (hello == null) {
			if (other.hello != null)
				return false;
		} else if (!hello.equals(other.hello))
			return false;
		if (i != other.i)
			return false;
		return true;
	}
}
