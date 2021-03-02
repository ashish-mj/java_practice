package com.rakuten.oops.part8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExercise {
public static void main(String[] args) {
	ShoppingCart s1=new ShoppingCart(101, "Apparal", "T Shirt", 500);
	ShoppingCart s2=new ShoppingCart(102, "Electronics", "OnePlus moble", 25000);
	ShoppingCart s3=new ShoppingCart(103, "Apparal", "Jeans", 1000);
	ShoppingCart s4=new ShoppingCart(104, "Kitchen Items", "Mixer Grinder", 5000);
	ShoppingCart s5=new ShoppingCart(105, "Computers", "Pen Drive", 500);
	List<ShoppingCart> list=Arrays.asList(s1,s2,s3,s4,s5);
	//1. Group by the Product type
	//2. partition by the product price >=5000
	//3. Store in a map key=product id , value=productname
	
	Map<String,List<ShoppingCart>> cart= list.stream().collect(Collectors.groupingBy(e->e.getProductType()));
	System.out.println(cart);
	Map<Boolean,List<ShoppingCart>> cart1= list.stream().collect(Collectors.partitioningBy(e->e.getPrice()>=5000));
	System.out.println(cart1);
}
}

class ShoppingCart{
	private int id;
	private String productType;
	private String productName;
	private float price;
	
	
	
	@Override
	public String toString() {
		return "ShoppingCart [id=" + id + ", productType=" + productType + ", productName=" + productName + ", price="
				+ price + "]";
	}
	public ShoppingCart(int id, String productType, String productName, float price) {
		super();
		this.id = id;
		this.productType = productType;
		this.productName = productName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}