package by.htp.library.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;


import by.htp.library.model.Book;
import by.htp.library.model.Library;

public class MainLibrary {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyy");

		Date date = df.parse("23-01-1974");

		Book book1 = new Book("Война и мир", date);

		Library lib = new Library("National Library");

		lib.addBooks(book1);

		for (int i = 0; i < lib.getBooks().length; i++) {
			if (lib.getBooks()[i] != null) {
				System.out.println(lib.title + "/" + lib.getBooks()[i].title);
			}
		}
	}

}
