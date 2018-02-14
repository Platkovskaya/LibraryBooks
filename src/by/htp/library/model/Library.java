package by.htp.library.model;

public class Library {
	public String title;
	private Book[] books;
	int bookCount;

	public Library(String title) {
		this.title = title;
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
		if (this.books != null) {
			if (bookCount < books.length) {
				books[bookCount] = book;
				bookCount++;
			} else {
				Book[] books = new Book[this.books.length + 10];
				for (int i = 0; i < books.length; i++) {
					books[i] = this.books[i];
				}
				this.books = books;
				this.books[bookCount] = book;
				bookCount++;
			}

		} else {
			this.books = new Book[10];
			this.books[0] = book;
			bookCount++;
		}
	}

}
