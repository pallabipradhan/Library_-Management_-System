package com.jsp.lms.view;

import java.util.Scanner;

import com.jsp.lms.controller.Controller;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;

public class View {
	static private Library library = new Library();// creation of library

	public static Library getLibrary() {// to access the private we use getter and setter method
		return library;
	}

	public static void setLibrary(Library library) {
		View.library = library;
	}

	static Scanner myInput = new Scanner(System.in);// create scanner class because we take input from user
	static Controller controller = new Controller();// controller consist of business logic so we need the logic in view
	static {
		System.out.println("----Welcome to Library Management System----");
		System.out.println("enter name of library");
		String libraryName = myInput.nextLine();
		library.setLibraryName(libraryName);
		//
		System.out.println("enter address of libarary");
		library.setLibraryAddress(myInput.nextLine());
		System.out.println("enter pincode");
		library.setPinCode(myInput.nextInt());
	}

	public static void main(String[] args) {
//     System.out.println("name: "+library.getLibraryName());
//     System.out.println("address: "+library.getLibraryAddress());
//     System.out.println("pincode: "+library.getPinCode());
		do {
			System.out.println("select option to perform");
			System.out.println("1.Add book\n2.Remove book\n3.Update book\n4.Get book\n0.Exit");
			System.out.println("Enter digit respective to desired option: ");
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("----E X I T E D----");
				System.exit(0);
				break;
			case 1:
				// case 1: for add book
				Book book = new Book();
				System.out.println("enter name of the book: ");
				book.setBookName(myInput.nextLine());
				System.out.println("enter the author name: ");
				book.setBookAuthor(myInput.nextLine());
				System.out.println("enter the price: ");
				book.setBookPrice(myInput.nextDouble());
				myInput.nextLine();
				controller.addBook(book);

				break;

			case 2:
				// case 2:for remove the book in the library
				System.out.println("Enter book name to be remove");
				String bookToremove = myInput.nextLine();
				if (controller.removeBook(bookToremove)) {
					System.out.println("Requsted book has  been removed");
				} else {
					System.out.println("Book does not exist cannot be removed");

				}
				break;

			case 3:
				// case 3:for update the book in the library
				System.out.println("Enter book name to update");
				Book bookExist = controller.getBook(myInput.nextLine());
				
				if (bookExist != null) {// book existed
					Book bookToUpdate =bookExist; //new Book();
					System.out.println("What to update");
					System.out.println("1.Book name\n2.Author name\n3.Book price");
					System.out.println("Enter digit respective to desired option: ");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.println("Enter book name to update");
						bookToUpdate.setBookName( myInput.nextLine());
						break;
					case 2:
						System.out.println("Enter book author to update");
						bookToUpdate.setBookAuthor( myInput.nextLine());

						break;
					case 3:
						System.out.println("Enter book price to update");
						double newBookPrice = myInput.nextDouble();
						myInput.nextLine();
						bookToUpdate.setBookPrice(newBookPrice);
						break;

					default:
						System.out.println("- - - -INVALID SELECTION- - - -");
						break;
					}
					if (controller.update(bookExist,bookToUpdate)) {
						System.out.println("updated");
					} else {
						System.out.println("not updated");

					}
				}
				else {
					System.out.println("");
				}

				break;
			case 4:
				// case 4: for fetch or get the book
				System.out.println("enter book name you are looking for : ");
				Book fetchedBook = controller.getBook(myInput.nextLine());
				if (fetchedBook != null) {
					System.out.println("Book is available");
					System.out.println("Detalis: ");
					System.out.println(fetchedBook);
				} else {
					System.out.println("Book is not available");

				}

				break;

			default:
				System.out.println("Invalid selection");
				break;
			}
		} while (true);
	}

}
