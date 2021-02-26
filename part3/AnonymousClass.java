package com.rakuten.oops.part3;

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p=new Person() { 
    	   public String get() {
    		  return "Im a superman";
    	  }
      };
      System.out.println(p.get());
	}

}

interface Person{
	String get();
}