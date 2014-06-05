package solid.OCP;

import java.util.List;

public class AreaCalculator {

	public float area(List<Shape> shapes) {
		float area = 0;
		
		for (Shape shape : shapes) {
			area += shape.calculateArea();
		}
		
		return area;
	}

}
