package com.rakuten.oops.part3;

public class WildcardEx1 {
public static void main(String[] args) {
	//GrapesJuice grapesJuice=new GrapesJuice();
	accept1(new Bottle<GrapesJuice>());
	accept2(new Bottle<Petrol>());
	accept3(new Bottle<Petrol>());
	accept4(new Bottle<Object>());
}

	static void accept1(Bottle<GrapesJuice> bottle) { //accepts only grapes juice..
		System.out.println("Grape");
	}
	static void accept2(Bottle<?> bottle) { //unbounded wild card
		System.out.println("Anytype");
	}
	//oil and its sub classes ..
	static void accept3(Bottle<? extends Oil> bottle) { //lower bound wild card
		System.out.println("Oil and subclasses");
	}
	//Juice and its base classes ...
	static void accept4(Bottle<? super Juice> bottle) { //upper bound wild card
		System.out.println("Juice and upperclasses");
	}
}

class Bottle<L>{
	private L liquid;
	public void setLiquid(L liquid) {
		this.liquid = liquid;
	}
}
interface Liquid{
	
}
class Oil  implements Liquid{
	
}
class Petrol extends Oil{
	
}
class Diesel extends Oil{
	
}

class Juice implements Liquid{
	
}
class GrapesJuice extends Juice{
	
}
class AppleJuice extends Juice{
	
}
