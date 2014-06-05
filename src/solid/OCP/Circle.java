package solid.OCP;

public class Circle implements Shape {
	
	public Circle(float radius) {
		this.radius = radius;
	}

	private float radius;
	
	public float getRadius() {
		return this.radius;
	}

	public double calculateArea() {
		return getRadius() * getRadius() * Math.PI;
	}

}
