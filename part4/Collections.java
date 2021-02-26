package com.rakuten.oops.part4;

import java.util.Vector; 

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Vector <String> v=new Vector<String>();
		System.out.println("Default "+v.capacity());
		Vector <String> v1=new Vector<String>(2);
		System.out.println("Customed "+v1.capacity());
		v1.add("Pune");
		v1.add("Bengaluru");
		System.out.println("Size "+v1.size());
		v1.add("Kanpur");
		v1.add(1,"Goa");
		System.out.println("capacity "+v1.capacity());
		System.out.println("Current size "+v1.size());
		
		for (String s:v1) {
			System.out.println(s);
		}
		System.out.println(v1);
	}

}
