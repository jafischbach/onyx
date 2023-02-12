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
	
}
