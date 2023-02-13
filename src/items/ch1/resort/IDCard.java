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
	
	@Override
	public void take(String how) {
		if (Game.player.has("ID card"))
			Game.print("You already have the ID card.");
		else {
			Game.print("Might as well take all your stuff.");
			Game.getCurrentRoom().getItem("stuff").take(how);
		}
	}
	
}
