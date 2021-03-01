package com.rakuten.oops.part7;
import java.util.ArrayList;

import com.rakuten.oops.part6.Product;

public class Streams {

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
	     
	     productlist.stream().filter(p->p.get_price()<8000).forEach(p->System.out.println(p.get_name()));;
	}

}
