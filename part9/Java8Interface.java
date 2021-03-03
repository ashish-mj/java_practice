package com.rakuten.oops.part9;

public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Greet g=new Greet();
      g.greet("Ashish");
	}

}

interface Greet1{
	
	default public void greet(String name) {
		System.out.print("Hi "+name+"\n");
	}
}

interface Greet2{
	
	default public void greet(String name) {
		System.out.print("Good morning "+name+"\n");
	}
}


class Greet implements Greet1,Greet2{
	
	public void greet(String name) {
		Greet1.super.greet(name);
		Greet2.super.greet(name);
	}
	
}