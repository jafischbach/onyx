package items.ch1.resort;

import game.*;

public class Paycard extends Item {

	public Paycard() {
		super("paycard");
	}
	
	@Override
	public void look() {
		Game.print("This little device contains an encrypted record of the local currency you"
				+ " have access to.");
	}
	
	@Override
	public void take(String how) {
		if (Game.player.has("paycard"))
			Game.print("You already have the paycard.");
		else {
			Game.print("Might as well take all your stuff.");
			Game.getCurrentRoom().getItem("stuff").take(how);
		}
	}
	
}
