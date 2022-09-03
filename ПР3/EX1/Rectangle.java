package ПР3.EX1;

public class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
		super();
		this.width = 10;
		this.length = 10;
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return width * length;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "This is a rectangle:\n" + "Length: " + this.length + ", width: "+ this.width + ", color: "+ this.color + ", filled: " + this.filled;
	}
}
