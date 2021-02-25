package com.rakuten.oops.part3;


public class Cast {
public static void main(String[] args) {
	hello(new Cat());
	System.out.println("**********");
	hello(new Dog());
}
//this method can receive Dog and Cat instances...
static void hello(Animal animal) { 
	if(animal instanceof Cat) {
		Cat cat=(Cat)animal;
		System.out.println("Typecasting success with Cat...");
	}
	else
	{
		Dog dog=(Dog)animal;
		System.out.println("Typecasting cannot do for Dog..");
	}
}
}
class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}