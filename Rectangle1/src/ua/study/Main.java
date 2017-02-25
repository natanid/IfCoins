package ua.study;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Perimeter of Rectangle = " + rectangle.getPerimeter());
		System.out.println("Square of Rectangle = " + rectangle.getSquare());
		
		Rectangle rectangle1 = new Rectangle(10, 15);
		
		System.out.println("Perimeter of Rectangle1 = " + rectangle1.getPerimeter());
		System.out.println("Square of Rectangle1 = " + rectangle1.getSquare());
	}

}
