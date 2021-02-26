package com.rakuten.oops.part5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set1=new HashSet<String>();
		//Assume reading from multiple data source
		set1.add("Tata Altroz");
		set1.add("Kia Seltos");
		boolean b1=set1.add("Honda Amaze");
		set1.add("Audi");
		boolean b2=set1.add("Honda Amaze");//ignored ...
		System.out.println(b1+"\t"+b2);
		System.out.println(set1);
		/*
		 * TreeSet - Never accepts duplicates
		 * 			-uses Binary Tree
		 * 			-Elements are sorted..
		 */
		TreeSet<String> set2=new TreeSet<String>();
		set2.add("Tata Altroz");
		set2.add("Kia Seltos");
		set1.add("Honda Amaze");
		set2.add("Audi");
		set2.add("Honda Amaze");//ignored ...
		System.out.println(set2);
		/*
		 * LinkedHashSet -> Never accepts duplicates
		 * 				 -elements arranged in the insertion order
		 */
		LinkedHashSet<String> set3=new LinkedHashSet<String>();
		set3.add("Tata Altroz");
		set3.add("Kia Seltos");
		set3.add("Honda Amaze");
		set3.add("Audi");
		set3.add("Honda Amaze");//ignored ...
		System.out.println(set3);

	}

}
