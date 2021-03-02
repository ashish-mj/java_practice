package com.rakuten.oops.part7;
import com.rakuten.oops.part4.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class Instreams {
public static void main(String[] args) {
	Product p1=new Product(101,"OnePlus TV",15999,3.1f);
	Product p2=new Product(102,"Redmi TV",14999,4.3f);
	Product p3=new Product(103,"Samsung TV",23999,4.6f);
	Product p4=new Product(105,"Sony TV",51999,4.5f);
	Product p5=new Product(104,"LG TV",45999,3.8f);
	List<Product> productList=Arrays.asList(p1,p2,p3,p4,p5);
	Optional<Product> optional=productList.stream().findAny();
	if(optional.isPresent()) {
		Product p=optional.get();
		System.out.println(p.getProdName());
	}
	
	productList.stream().findAny().get();
	
	//Is there any product price which is less than or eq to 25000
	boolean b1=productList.stream().anyMatch(p->p.get_price()<=25000);
	System.out.println(b1);
	
	//To Chk all products price which is less than or eq to 25000
	 b1=productList.stream().allMatch(p->p.get_price()<=25000);
		System.out.println(b1);
}
}

