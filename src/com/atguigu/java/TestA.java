package com.atguigu.java;

class TestA {

	private int age;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		TestA a = new TestA();
		int age2 = a.getAge();
		//成员变量有默认初始值
		System.out.println(age2);
		
		//局部变量没有默认初始值
		int i = 0 ;
		System.out.println(i);
		
	}
}
