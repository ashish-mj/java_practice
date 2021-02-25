package com.rakuten.oops.part2;

package com.rakuten.oops.part2;

public class Apparal extends product {
private String color;
private String size;
public void display() {
	super.display();
	System.out.println("Color: "+color);
	System.out.println("Size : "+size);
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}

}
