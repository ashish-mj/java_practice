package com.rakuten.oops.part3;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p=new Person() { 
    	  String get() {
    		  return "Im a superman";
    	  }
      };
      System.out.println(p.get());
	}

}

class Person{
	String get() {
		return "Im a person";
	}
}