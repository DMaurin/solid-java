package solid.LSP;

public class Colvert implements Duck {
	
	private boolean hasMoved = false;

	@Override
	public void swim() {
		this.hasMoved = true;
	}

	@Override
	public boolean hasMoved() {
		return this.hasMoved;
	}

}
