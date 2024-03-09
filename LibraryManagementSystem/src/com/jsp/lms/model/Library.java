package com.jsp.lms.model;

import java.util.List;

public class Library {
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryAddress=" + libraryAddress + ", pinCode=" + pinCode
				+ ", books=" + books + "]";
	}
	private String libraryName;
	private String libraryAddress;
	private int pinCode;
	
	private List<Book>books;
	
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
