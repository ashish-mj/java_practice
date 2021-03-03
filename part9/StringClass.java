package com.rakuten.oops.part9;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2=" World";
		System.out.println(s1==s2);
		String s3=new String("Hello");
		System.out.println(s1.equals(s3));
		
		s1=s1.concat(s2);
		System.out.println(s1);
		

	}

}
