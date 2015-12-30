import java.util.List;

public abstract class Shape {
	int xPos;
	int yPos;
	
	abstract void draw();
	
	public void move(int deltaX, int deltaY)
	{
		xPos += deltaX;
		yPos += deltaY;
	}
	
	public void printPosition()
	{
		System.out.println("X =" + this.xPos + " and Y = " + this.yPos);
	}
	
	public static void printShapesPositions(List<? extends Shape> shapes)
	{
		for (Shape shape : shapes)
		{
			shape.printPosition();
		}
	}
}
