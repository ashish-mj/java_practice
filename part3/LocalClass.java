package com.rakuten.oops.part3;

public class LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		class Local{
			void f1() {
				System.out.println("local class f1 method"+x);
			}
		}
		Local l=new Local();
		l.f1();

	}

}


