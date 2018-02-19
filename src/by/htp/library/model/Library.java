package by.htp.library.model;

import java.util.Arrays;

public class Library {
	public String titleLibrary;
	private Book[] books = new Book[0];

	public Library(String titleLibrary) {
		this.titleLibrary = titleLibrary;
	}

	public void setBooks(Book[] books) {
		if (books != null) {
			this.books = books;
		}
	}

	public Book[] getBooks() {
		return books;
	}

	public void addBooks(Book book) {

		Book[] newBooks = new Book[this.books.length + 1];

		for (int i = 0; i < this.books.length; i++) {
			newBooks[i] = this.books[i];
		}

		newBooks[newBooks.length - 1] = book;
		this.books = newBooks;

	}

	public void findBook(String surName) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				if (books[i].getSurName().equals(surName)) {
					System.out.println("Book '" + surName + "' was found!");
				}
			}
		}
	}

	public void reoveBookByTitle(String title) {
		// if (this.books != null) {
		int indexOfBook = -1;
		for (int i = 0; i < this.books.length; i++) {
			// if (books[i] != null) {
			if (books[i].title.equals(title)) {
				indexOfBook = i;
			}
			// }
		}

		if (indexOfBook != -1) {
			this.books[indexOfBook] = null;

			Book[] newBooks = new Book[this.books.length - 1];

			int oldIndex = 0;
			int newIndex = 0;
			for (int i = 0; i < this.books.length; i++) {
				if (this.books[oldIndex] != null) {
					newBooks[newIndex] = this.books[oldIndex];
				} else {
					newIndex--;
				}
				oldIndex++;
				newIndex++;
			}

			this.books = newBooks;

			System.out.println("Book '" + title + "' was removed from library!");
		} else {
			throw new RuntimeException("Book '" + title + "' was not found!");
		}
		// }
	}

	public void showBooks() {
		// if (this.books != null) {
		System.out.println("Library '" + this.titleLibrary + "':");
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				System.out.println(books[i].toString());
			}
		}
		// }
	}

	public void showBookWithBubbleSort() {

		Book[] sortedBooks = books;

		for (int i = sortedBooks.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sortedBooks[j].release > sortedBooks[j + 1].release) {
					Book tmp = sortedBooks[j];
					sortedBooks[j] = sortedBooks[j + 1];
					sortedBooks[j + 1] = tmp;
				}
			}

		}

		System.out.println("Library '" + this.titleLibrary + "' was sorted by Bubble Sort:");

		for (int i = 0; i < sortedBooks.length; i++) {
			System.out.println(books[i].toString());
		}
	}
}
