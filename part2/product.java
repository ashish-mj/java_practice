package com.rakuten.oops.part2;

public class product { 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b=new Child();
		b.f1();
		b.f2();

	}

}

class Base{
	void f1() {
		System.out.println("Base class : f1");
	}
	static void f2() {
		System.out.println("base class : f2");
	}
}

class Child extends Base{
	void f1() {
		System.out.println("Child class : f1");
	}
	static void f2() {
		System.out.println("Child class : f2");
	}
}
