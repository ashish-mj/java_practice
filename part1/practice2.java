package com.rakuten.oops.part1;
class employee{
	static int count;
	int id;
	String firstName;
	String lastName;
	float salary;
    int grade;
    
    employee(String first,String last,float salary,int grade){
    	count+=1;
    	this.id=count;
    	this.firstName=first;
    	this.lastName=last;
    	this.salary=salary;
    	this.grade=grade;
    }
    
    void display() {
    	System.out.println("Employeeid :"+id);
    	System.out.println("Name :"+firstName+" "+lastName);
    	System.out.println("Salary : "+salary);
    	System.out.println("Grade : "+grade);
    }
    
    static void get_total() {
    	System.out.println("Total Employees : "+count);
    }
	
}

public class practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1= new employee("Ashish","Raj",90000.5f,8);
		e1.display();
		employee e2= new employee("Yash","Raj",50000.8f,5);
		e2.display();
		employee e3= new employee("Vishal","Raj",10000.8f,3);
		e3.display();
		System.out.println("------------------");
		e1.get_total();
		System.out.println(e2.id);
	}
}

