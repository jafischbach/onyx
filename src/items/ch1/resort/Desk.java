package items.ch1.resort;

import game.*;

public class Desk extends Item {

	public Desk() {
		super("desk");
	}
	
	@Override
	public void look() {
		Game.print("Just a plain desk. Like everything else in the room, it's cheap but"
				+ " serviceable.");
	}
	
	@Override
	public void open() {
		Game.print("You search through each of the desk drawers and find nothing useful");
	}
	
}
