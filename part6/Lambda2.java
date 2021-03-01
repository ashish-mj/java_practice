package com.rakuten.oops.part6;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Greetings g= (s)->"Good morning "+s; 
      greetService(g,"Ashish");
      greetService(g,"Darick");
     }
	
	static void greetService(Greetings g,String name) {
		System.out.println(g.wish(name));
	}

}

interface Greetings{
	String wish(String name);
}
