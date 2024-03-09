package com.jsp.lms.model;

public class Book {
	private String bookName;
	 private String bookAuthor;
	 private double bookPrice;
	 
	@Override
	public String toString() {
		return "Book [Book Name=" + bookName + ",\nBook Author=" + bookAuthor + ", \nBook Price=" + bookPrice + "]";
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	 
  
}
