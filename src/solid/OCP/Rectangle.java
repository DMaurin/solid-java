package solid.OCP;

public class Rectangle implements Shape {
	
	private float height;
	private float width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public float getWidth() {
		return width;
	}

	/* (non-Javadoc)
	 * @see solid.OCP.Shape#calculateArea()
	 */
	@Override
	public double calculateArea() {
		return getHeight() * getWidth();
	}
	
}
