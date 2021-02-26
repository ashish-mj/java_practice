package com.rakuten.oops.part4;



public class Product {
 private int id;
 private String  name;
 private float price;
 public float ratings;
 
 public Product(int id,String name,float price,float ratings) {
	 this.id=id;
	 this.name=name;
	 this.price=price;
	 this.ratings=ratings;
 }
 
 @Override
 public String toString() {
	 return "product [id - "+id+" Name - "+name+" Price - "+price+" Ratings - "+ratings+"]";
 }
	

@Override
 public int compareTo (Product p) {
  if (this.ratings<p.ratings)
      return -1;
  else
	  return 1;
 
}
 
}
   