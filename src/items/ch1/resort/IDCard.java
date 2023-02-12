package items.ch1.resort;

import game.*;

public class IDCard extends Item {

	public IDCard() {
		super("id card");
	}
	
	@Override
	public void look() {
		Game.print("This palm-sized card identifies you as an employee of the Milt-Maalt"
				+ " Transport Company.");
	}
	
}
