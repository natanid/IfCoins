package ua.study;

public class Rectangle {
	private int width;
	private int length;

	public Rectangle() {
	}

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public double getPerimetr() {
		return (length + width) * 2;
	}

	public double getSquare() {
		return length * width;
	}

}
