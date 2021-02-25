package com.rakuten.oops.part1;


class product{
	int code;
	String Name;
	
	product(int code,String Name) {
		this.code=code;
		this.Name=Name;
	}
	
	void display() {
		System.out.println("Code "+code);
		System.out.println("Name "+Name);
	}
	
}

public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product p[] = new product[5];
		p[0]=new product(100,"AB");
		p[1]=new product(101,"BC");
		p[2]=new product(102,"CD");
		p[3]=new product(103,"DE");
		p[4]=new product(104,"EF");
		for (product a:p) {
			a.display();
		}
		
		
		
	}
}
