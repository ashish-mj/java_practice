package com.rakuten.oops.part2;

public class Book extends product{
private String genre;
private String authour;
public void display() {
	super.display();
	System.out.println("Genre : "+genre);
	System.out.println("Authour : "+authour);
}

public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getAuthour() {
	return authour;
}
public void setAuthour(String authour) {
	this.authour = authour;
}

}