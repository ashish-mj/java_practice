package com.rakuten.oops.part3;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Outer outer=new Outer();
     Outer.Inner inner=outer.new Inner();
     inner.print();
     Outer.Inner1 inn = new Outer.Inner1();
     inn.print();
	}

}

class Outer{
	int x=10;
	class Inner{
		int x=20;
		void print() {
			System.out.println("inner class method "+Outer.this.x);
		}
	}
	static class Inner1{
		void print() {
			System.out.println("Static inner class method ");
		}
	}
	
}