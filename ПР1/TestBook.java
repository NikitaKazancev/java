package ПР1;

public class TestBook {
	public static void exec() {
		Book book1 = new Book("My story", "My Story", "Me", (short) 2022);
		Book book2 = new Book("My story", "My Story", "Me");
		Book book3 = new Book("My story", "My Story");

		book1.change("New story");
		System.out.println(book1);
		book2.setAuthor("You");
		book3.setYear((short) 3022);
	}
}
