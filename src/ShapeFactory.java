import java.util.ArrayList;
import java.util.List;


public abstract class ShapeFactory {
	
	public static <Type extends Shape> Shape createShape(Class<Type> class1)
	{
		try {
			Shape newShape = class1.newInstance();
			return newShape;
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	

	public static <T extends Shape> List<Shape> createMultiple(Class<T> class1, int numberofNewShapes) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		int shapeCounter = 0;
		while (shapeCounter < numberofNewShapes)
			try {
				shapes.add((Shape) class1.newInstance());
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		++shapeCounter;
		return shapes;
	}

}
