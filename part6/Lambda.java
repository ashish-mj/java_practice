package com.rakuten.oops.part6;

import java.util.ArrayList;


public class Lambda {

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
         //filter(productlist);
         /*
     	 * ProductFilter filterByPrice=new ProductFilter() { public boolean test(Product
     	 * p) { return p.getPrice()<25000; } };
     	 */
     	//ProductFilter f=p->p.getPrice()<25000;
     	filter(productlist,p->p.get_price()<8000);
	}
	
	static void filter(ArrayList <Product> productlist,ProductFilter filter) {
		for (Product p:productlist) {
			if(filter.test(p)) { 
				System.out.println(p.get_name());
			}
				
		}
			
	}

}
interface ProductFilter{
	public Boolean test(Product p);
}
