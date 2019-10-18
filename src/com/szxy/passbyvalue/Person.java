package com.szxy.passbyvalue;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Pserson [name=" + name + ", age=" + age + "]";
	}

	public static void personCrossTest(Person person){
		System.out.println("传入的person的name："+person.getName()); 
		// 创建 Person 对象，并赋值给 person 变量
		// 相当于 person 变量指向新的内存地址，即形参的值与实参的值不一致
		person = new Person();
		person.setName("我是张小龙"); 
		System.out.println("方法内重新赋值后的name："+person.getName());
	}

	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("张三");
		p.setAge(28);
		System.out.println("方法执行前的  p 对象："+p);
		personCrossTest(p);
		System.out.println("方法执行后的  p 对象："+p);
	}

}
