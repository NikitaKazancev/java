package ПР2;

public class TestBall {
	public static void exec() {
		Ball ball1 = new Ball(1, 1);
		Ball ball2 = new Ball();

		System.out.println(ball1.getX());
		System.out.println(ball1.getY());
		ball2.setX(2);
		ball2.setY(3);

		System.out.println(ball1);
	}
}
