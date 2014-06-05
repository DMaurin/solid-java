package solid.LSP;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuckBehavior {

	@Test
	public void colvertShouldSwim() {
		Duck duck = new Colvert();
		
		duck.swim();
		
		assertTrue(duck.hasMoved());
	}

	@Test
	public void electricDuckShouldSwim() {
		ElectricDuck duck = new ElectricDuckImplementation();
		
		duck.turnOn();
		duck.swim();
		
		assertTrue(duck.hasMoved());
	}
}
