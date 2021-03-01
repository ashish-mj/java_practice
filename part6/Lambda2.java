package com.rakuten.oops.part6;

public class Lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Greetings g= (s)->"Good morning "+s; 
      greetService(g,"Ashish");
      greetService(g,"Darick");
      
      Favorite f = (n)-> 10+(int)n;
      add(f,20.35f);
      
     }
	
	static void greetService(Greetings g,String name) {
		System.out.println(g.wish(name));
	}
	
	static void add(Favorite f,float n) {
		System.out.println(f.tell(n));
	}
	
	

}

interface Greetings{
	String wish(String name);
}

interface Favorite{
	int tell(float n);
}
