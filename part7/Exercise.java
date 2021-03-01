package com.rakuten.oops.part7;

import java.util.ArrayList;





class emp{
	static int count=0;
	int id;
	String name;
		
	emp(String name){
		count+=1;
		this.id=count;
		this.name=name;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("ID : "+id);
		
	}
	
}

class per_emp extends emp{
	
	float salary;
	
	per_emp(String name,float salary){
		super(name);
		this.salary=salary;
	}
	
	void display() {
		super.display();
		System.out.println("salary : "+salary);
	}
	
	
}


class contract extends emp{
	
	int months;
	float stipend;
	
	contract (String name,int months,float stipend){
		super(name);
		this.months=months;
		this.stipend=stipend;
	}
	
	void display() {
		super.display();
		System.out.println("salary : "+(this.stipend*this.months));
	}
	
	
}


public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <emp> employees=new ArrayList <emp>();
		
		 contract e1 =new contract("Ashish",6,25000.0f);
	     per_emp e2 =new per_emp("Samarth",1000000.5f);
	     contract e3 =new contract("Dheeraj",6,15000.0f);
	     
	     employees.add(e1);
	     employees.add(e2);
	     employees.add(e3);
	     
	     employees.stream().forEach(e->e.display());

	}

}
