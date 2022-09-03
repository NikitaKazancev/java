package ПР3.EX2;

public class MovablePoint implements IMovable {
	private int x;
	private int y;
	protected int xSpeed;
	protected int ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		y++;
	}

	@Override
	public void moveDown() {
		y--;
	}

	@Override
	public void moveLeft() {
		x--;
	}

	@Override
	public void moveRight() {
		x++;
	}

	@Override
	public String toString() {
		return "Point:\n" + "X = " + x + ", Y = " + y + ", speed by Ox: " + xSpeed + ", speed by Oy: " + ySpeed + "\n";
	}
}
