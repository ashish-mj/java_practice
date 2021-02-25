package com.rakuten.oops.part1;
 
class emp{
	int a=10;
	static int b=100;
	emp(){
		System.out.println("IM parent");
	}
	emp(String a){
		System.out.println("Hello");
	}
}

class child extends emp{
	child(){
		super("Ashish");
		System.out.println("Hi");
	}
}
public class practice3 {
	public static void main(String[] args) {
		emp  e[]=new emp[5];
		
	}

}
