package com.rakuten.oops.part9;

public class Java8Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Greet g=new Greet();
      g.greet("Ashish");
      Greet1.hello();
      
	}

}

interface Greet1{
	
	default public void greet(String name) {
		System.out.print("Hi "+name+"\n");
	}
	static void hello() { //this method should be access only by interface name ...
		System.out.println("Hello static method from Greet1");
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
		hello();
	}
	static void hello() { 
		System.out.println("Hello static method from GreetImpl ...");
	}
	
}