package com.lalethbook;

public class bookshop {
	private String name;
	private String shop_name;
	private String book_name;
	private String author;
	private int price;
	private String cust_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCust_id() {
		return cust_id;
	}
	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}
public bookshop() {
		
	}
public bookshop(String name, String shop_name, String book_name, String author, int price, String cust_id) {
	super();
	this.name = name;
	this.shop_name = shop_name;
	this.book_name = book_name;
	this.author = author;
	this.price = price;
	this.cust_id = cust_id;
}
@Override
public String toString() {
	return "bookshop [name=" + name + ", shop_name=" + shop_name + ", book_name=" + book_name + ", author=" + author
			+ ", price=" + price + ", cust_id=" + cust_id + "]";
}

}
