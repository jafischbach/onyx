package items.ch1.resort;

import game.*;

public class Closet extends Item {

	public Closet() {
		super("closet");
	}
	
	@Override
	public void look() {
		Game.print("A simple closet. That's where you stashed the few personal items you brought"
				+ " with you from the Fussilade.");
	}
	
	@Override
	public void open() {
		Game.print("You open the closet and admire all of your cool stuff. Satisfied with your own"
				+ " sense of style, you close the closet again.");
	}
	
	@Override
	public void close() {
		Game.print("It's already closed.");
	}
	
}
