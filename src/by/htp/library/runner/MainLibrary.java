package by.htp.library.runner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;

import by.htp.library.model.Book;
import by.htp.library.model.Library;

public class MainLibrary {

	public static void main(String[] args) throws ParseException {

		// SimpleDateFormat df = new SimpleDateFormat("yyyy");
		// Date date = df.parse("23-01-1974");

		Book book1 = new Book("Толстой Л.Н.", "Война и мир", 1873);
		Book book2 = new Book("Пушкин А.С.", "Евгений Онегин", 1823);
		Book book3 = new Book("Грибоедов А.С.", "Горе от ума", 1913);
		Book book4 = new Book("Булгаков М.А.", "Мастер и маргарита", 1969);
		Book book5 = new Book("Дюма А.", "Три мушкетера", 1844);

		Library lib = new Library("National Library");

		lib.addBooks(book1);
		lib.addBooks(book2);
		lib.addBooks(book3);
		lib.addBooks(book4);
		lib.addBooks(book5);

		lib.showBooks();
		System.out.println();

		lib.findBook("Пушкин А.С.");
		System.out.println();

		lib.reoveBookByTitle("Горе от ума");
		System.out.println();

		lib.showBooks();
		System.out.println();

		// for (int i = 0; i < lib.getBooks().length; i++) {
		// System.out.println(lib.getBooks()[i]);
		// }

		lib.showBookWithBubbleSort();

	}

}
