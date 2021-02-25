package com.rakuten.oops.part1;

public class Inter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drive d = get("Ford");
		d.accelerator();
		d.brake();

	}
	
	static Drive get(String car) {
		if (car.contentEquals("Ford"))
		    return new ford();
		else
			return new audi();
	}

}

interface Drive{
	public void accelerator();
	public void brake();
}

class ford implements Drive{
	public void accelerator() {
		System.out.println("Ford car accelerator starts working");
	}
	public void brake() {
		System.out.println("Ford car brake starts working");
	}
}

class audi implements Drive{
	public void accelerator() {
		System.out.println("Audi car accelerator starts working");
	}
	public void brake() {
		System.out.println("Audi car brake starts working");
	}
}