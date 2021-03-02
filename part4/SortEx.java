package com.rakuten.oops.part4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;



public class SortEx{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Product p1 =new Product(101,"Redmi",3000.0f,9.6f);
     Product p2 =new Product(102,"LG",7000.8f,9.2f);
     Product p3 =new Product(103,"VU",6000.1f,9.3f);
     Product p4 =new Product(104,"Micromax",5000.3f,9.5f);
     Product p5 =new Product(105,"Samsung",13000.5f,9.1f);
     
     ArrayList <Product> productlist=new ArrayList <Product>();
     productlist.add(p1);
     productlist.add(p2);
     productlist.add(p3);
     productlist.add(p4);
     productlist.add(p5);
     
     System.out.println(productlist);
 	 Collections.sort(productlist);
 	 Collections.sort(productlist,new SortByRatings());
 	 System.out.println("---After sorting ----");
 	 System.out.println(productlist);
 	 
 	double s =  productlist.stream().mapToDouble(p->p.get_price()).sum();
     System.out.println(s);
     Optional<Product> p22 =productlist.stream().min((p10,p11)->(p10.get_price()>p11.get_price())?1:-1);
     System.out.println(p22);
 }
 }

 class SortByRatings implements Comparator<Product>{
 	public int compare(Product p1, Product p2) {
 		return (p1.ratings>p2.ratings?1:-1);
 	}
 	
 }
     
     

