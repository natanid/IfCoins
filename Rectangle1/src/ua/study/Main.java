package ua.study;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Rectangle rectangle1 = new Rectangle(10, 15);
		// System.out.println("Rectangle" rectangle.getPerimetr());
		System.out.println("Perimetr of Rectangle = " + rectangle1.getPerimetr());
		System.out.println("Square of Rectangle = " + rectangle1.getSquare());
	}

}
