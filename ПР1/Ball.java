package ПР1;

public class Ball {
	private int size;
	private String color;

	public Ball(int size, String color) {
		this.size = size;
		this.color = color;
	}

	public Ball(int size) {
		this.size = size;
		this.color = "green";
	}

	public Ball() {
		this.size = 100;
		this.color = "green";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Size: " + this.size + ", color: " + this.color;
	}
}
