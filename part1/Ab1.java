package com.rakuten.oops.part1;

abstract class a{
	int b;
	a(int b){
		this.b=b;
	}
	
	abstract void f1();
}

class c extends a{
	c(int b){
		super(b);
	}
	void f1() {
		System.out.println("b value is : "+(b+10));
	}
}
class d extends a{
	d(int b){
		super(b);
	}
	void f1() {
		System.out.println("b value is : "+(b+20));
	}
}

public class Ab1 {
	public static void main(String[] args) {
	c abc=new c(12);
	abc.f1();
	d abc1=new d(12);
	abc1.f1();
	}
}
