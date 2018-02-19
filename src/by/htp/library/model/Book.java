package by.htp.library.model;

//import java.sql.Date;
import java.util.Date;

public class Book {
	public String title;
	public int release;
	private String surName;

	public Book(String surName, String title, int release) {
		this.title = title;
		this.release = release;
		this.surName = surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSurName() {
		return surName;
	}

	@Override
	public String toString() {
		return "Book - " + surName + " " + title + " " + "(" + release + ")";
	}

}
