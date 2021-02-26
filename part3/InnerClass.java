package com.rakuten.oops.part3;

public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Outer outer=new Outer();
     Outer.Inner inner=outer.new Inner();
     inner.print();
	}

}

class Outer{
	int x=10;
	class Inner{
		int y=20;
		void print() {
			System.out.println("inner class method "+y);
		}
	}
	
}