/**
 * 
 */
package com.rakuten.oops.part8;

/**
 * @author ashish
 *
 */
public class ExceptionEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int a=10;
		int b=5;
		int c=2;
		int res = a/(b*c-a)+a*a;
		System.out.println(res);

	}
		catch (ArithmeticException e) {
			System.out.println("Catch Block1");
			System.out.println("Divide by zero");
		}
		catch (Exception e) {
			System.out.println("Catch Block");
			System.out.println(e);
		}

}
}
