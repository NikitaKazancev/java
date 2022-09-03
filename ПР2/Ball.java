package ПР2;

public class Ball {
	private double x;
	private double y;

	public Ball(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Ball() {
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void move(double x, double y) {
		setX(x);
		setY(y);
	}

	@Override
	public String toString() {
		return "X: " + this.x + ", y: " + this.y;
	}
}
