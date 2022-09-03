package ПР2;

public class Author {
	private String name;
	private String email;
	private Gender gender;

	public Author(String name, String email, Gender gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + ", email: " + this.email + ", gender: " + this.gender;
	}
}
