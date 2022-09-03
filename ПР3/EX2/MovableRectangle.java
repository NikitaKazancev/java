package ПР3.EX2;

public class MovableRectangle implements IMovable {
	private MovablePoint topLeft;
	private MovablePoint bottomRight;

	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}

	private boolean checkXSpeed() {
		return (topLeft.xSpeed == bottomRight.xSpeed);
	}

	private boolean checkYSpeed() {
		return (topLeft.ySpeed == bottomRight.ySpeed);
	}

	@Override
	public void moveUp() {
		if (checkYSpeed()) {
			topLeft.moveUp();
			bottomRight.moveUp();
		}
	}

	@Override
	public void moveDown() {
		if (checkYSpeed()) {
			topLeft.moveDown();
			bottomRight.moveDown();
		}
	}

	@Override
	public void moveLeft() {
		if (checkXSpeed()) {
			topLeft.moveLeft();
			bottomRight.moveLeft();
		}
	}

	@Override
	public void moveRight() {
		if (checkXSpeed()) {
			topLeft.moveRight();
			bottomRight.moveRight();
		}
	}
	
	@Override
	public String toString() {
		return "Rectangle:\nTop left point:\n" + topLeft.toString() + "Bottom right point:\n" + bottomRight.toString();
	}
}
