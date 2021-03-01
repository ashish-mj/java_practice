package com.rakuten.oops.part6;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c= (a,b)-> a+b;
		eval(c,12.2f,23.2f);

	}
	
	static void eval(Calculator c,float a,float b) {
		System.out.println("Sum is "+c.eval(a, b));
	}

}

interface Calculator{
	float eval(float a,float b);
}