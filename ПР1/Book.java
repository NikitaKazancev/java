package ПР1;

public class Book {
	private String book;
	private String name;
	private String author;
	private short yearOfPublishing;

	public Book(String book, String name, String author, short yearOfPublishing) {
		this.book = book;
		this.name = name;
		this.author = author;
		this.yearOfPublishing = yearOfPublishing;
	}

	public Book(String book, String name, String author) {
		this.book = book;
		this.name = name;
		this.author = author;
		this.yearOfPublishing = 2000;
	}

	public Book(String book, String name) {
		this.book = book;
		this.name = name;
		this.author = "No Name";
		this.yearOfPublishing = 2000;
	}

	public Book(String book) {
		this.book = book;
		this.name = "Various";
		this.author = "No Name";
		this.yearOfPublishing = 2000;
	}

	public Book() {
		this.book = "Any story";
		this.name = "Various";
		this.author = "No Name";
		this.yearOfPublishing = 2000;
	}

	public String read() {
		return book;
	}

	public String getName() {
		return this.name;
	}

	public String getAuthor() {
		return this.author;
	}

	public short getYear() {
		return this.yearOfPublishing;
	}

	public void change(String book) {
		this.book = book;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setYear(short yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nAuthor: " + this.author + "\nYear of publishing: " + this.yearOfPublishing;
	}
}
