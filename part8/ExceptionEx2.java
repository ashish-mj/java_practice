package com.rakuten.oops.part8;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stuby
		try {
			System.out.println("Hello");
			System.out.println(5/5);
			try {
				int a[]= {1,2,3,4,5};
				System.out.println(a[5]);
			}
			catch (ArithmeticException e) {
				System.out.println("Catch Block1");
				System.out.println("Divide by zero");
			}
		}
		
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}
		

	}

}
