package com.rakuten.oops.part8;

import java.util.Scanner;

public class ThrowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		System.out.println("Enter amount");
		Scanner sc=new Scanner(System.in);
		
		int amount=sc.nextInt();
		if (amount%100!=0)
			throw new ArithmeticException();
			
		else
			System.out.println("Successfull");

	}

}
