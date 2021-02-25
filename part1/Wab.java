package com.rakuten.oops.part1;

class e{
	int b;
	e(int b){
		this.b=b;
	}
	
	void f1() {
		
	}
}

class f extends e{
	f(int b){
		super(b);
	}
	void f1() {
		System.out.println("b value is : "+(b+10));
	}
}
class g extends e{
	g(int b){
		super(b);
	}
	void f1() {
		System.out.println("b value is : "+(b+20));
	}
}



public class Wab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		e abc=new f(12);
		abc.f1();
	}

}
