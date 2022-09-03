package ПР2;

public class TestAuthor {
	public static void exec() {
		Author author = new Author("Me", "my_email@a.ru", Gender.male);

		System.out.println(author.getEmail());
		System.out.println(author.getName());
		System.out.println(author.getGender());
		author.setEmail("new_email");
		System.out.println(author);
	}
}
