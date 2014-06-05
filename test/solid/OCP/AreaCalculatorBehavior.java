package solid.OCP;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AreaCalculatorBehavior {

	AreaCalculator calculator = new AreaCalculator();

	@Test
	public void shouldCalculateARectangleArea() {
		
		List<Shape> rectangles = new ArrayList<Shape>();
		rectangles.add(new Rectangle(10, 3));
		
		float area = calculator.area(rectangles);
		
		assertEquals(30.0, area, 0.01);
	}

	@Test
	public void shouldCalculateTotalAreaForTwoRectangles() {
		
		List<Shape> rectangles = new ArrayList<Shape>();
		rectangles.add(new Rectangle(10, 3));
		rectangles.add(new Rectangle(4, 5));
		
		float area = calculator.area(rectangles);
		
		assertEquals(50.0, area, 0.01);
	}
	
	@Test
	public void shouldCalculateACircleArea() {
		List<Shape> circles = new ArrayList<Shape>();
		circles.add(new Circle(5));
		
		float area = calculator.area(circles);
		
		assertEquals(78.5, area, 0.1);
	}
}
