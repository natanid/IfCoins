
public class Rectangle {
	
	int side1;
	int side2;
	int side3;
	int side4;
	
	public Rectangle (int a, int b, int c, int d) {
		
		side1 = a;
		side2 = b;
		side3 = c;
		side4 = d;
	}

	public int getside1()
	{
		return side1;
		
	}
	public int getside2()
	{
		return side2;
		
	}
	public int getside3()
	{
		return side3;
		
	}
	public int getside4()
	{
		return side4;
		
	}
	
	public int getRectanglePerimeter()
	{
		return (side1 + side2) * 2;
		
	}
	
	public int getRectangleArea()
	{
		return side1 * side2;
		
	}
}
