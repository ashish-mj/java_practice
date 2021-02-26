package com.rakuten.oops.part3;

public class GenericsEx1 {
	/*
	 * Generics - Parameterized type
	 * 			-Accepts similar type of object
	 * 			-while reading no of typecasting ...
	 */

public static void main(String[] args) {
	GenericData<String> data1=new GenericData<String>();
	data1.setVal("Bangalore");//accepts only string..
	
	GenericData<Integer> data2=new GenericData<Integer>();
	data2.setVal(999);
	
	String s1=data1.getVal();//No need of typing
	int x=data2.getVal();
	System.out.println(s1);
	System.out.println(x);
}
}

class GenericData<E>{
	private  E val;

	public E getVal() {
		return val;
	}

	public void setVal(E val) {
		this.val = val;
	}
	
	
}


	




