import java.util.List;


public class ShapesPlayground {

	public static void main(String[] args) {
		
// 		List<Shape> shapes = ShapeFactory.create(Rectangle.class, 10);
	
//		Shape circle = CircleFactory.createShape();
		
		Shape circle1 = ShapeFactory.createShape(Circle.class);
		circle1.printPosition();
		moveAndDraw(circle1, 20, 35);
		circle1.printPosition();
		
		System.out.println("Creating and printing multiple generic shapes");
		List<Shape> circles = ShapeFactory.createMultiple(Circle.class, 5);
		System.out.println(circles.size());
		Shape.printShapesPositions(circles);
		
		
		
		
				
	}
	
	public static void moveAndDraw(Shape shape, int moveXBy, int moveYBy)
	{
		shape.draw();
		shape.move(moveXBy, moveYBy);
	}
		
}