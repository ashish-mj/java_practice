package com.rakuten.oops.part5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Loop {
	public static void main(String[] args) {
	HashMap<String, String> map1=new HashMap<String, String>();
	map1.put("R101", "Ashish");
	map1.put("R102", "Darshan");
	map1.put("R103", "Dheerah");
	map1.put("R104", "Mahesh");
	map1.put("R105", "Pritam");
	map1.put("R103", "Dheeraj KR"); //overwrites ....
	System.out.println(map1);
	String name=map1.get("R102");
	System.out.println(name);
	//returns only keys and store in  Set
	Set<String> employeeIds=map1.keySet();
	System.out.println(employeeIds);
	//returns only values
	Collection<String> empNames=map1.values();
	System.out.println(empNames);
	//Map is not iterable ....
	for(String n:empNames) {
		System.out.println(n);
	}
	
	//returns key-value pair & stored in Entry obj... 
	Set<Entry<String,String>>  records=map1.entrySet();
	System.out.println("Id  \t  Name");
	System.out.println("------------------");
	for(Entry<String,String> record:records) {
		String id=record.getKey();
		String empName=record.getValue();
		System.out.println(id+" \t "+empName);
	}

}
}
