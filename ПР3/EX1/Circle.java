package ПР3.EX1;

public class Circle extends Shape {
	private double radius;

	public Circle() {
		super();
		this.radius = 10;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() {
		return "This is a circle:\n" + "Radius: " + this.radius + ", color: "+ this.color + ", filled: " + this.filled;
	}
}
