package ua.study;

public class Rectangle {
	private int width;
	private int length;

	public Rectangle() {
		this.width = 5;
		this.length = 10;
	}

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}

	public double getSquare() {
		return length * width;
	}

}
