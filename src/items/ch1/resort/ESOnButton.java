package items.ch1.resort;

import game.*;

public class ESOnButton extends Item {

	private boolean on;
	
	public ESOnButton() {
		super("button");
		on = false;
	}
	
	@Override
	public void look() {
		Game.print("It's the button that turns the screen on and off. Super sophisticated.");
	}
	
	@Override
	public void use() {
		if (on)
			Game.print("Pushing the button, you turn the \"entertainment\" system off. Blessed silence once again!");
		else {
			Game.print("You push the On button and, with a few clicks and a disturbing hum, the screen lights up revealing "
					+ "the current talking head on \"Rubicon Sphere to Sphere! Live from  Romanicus Station!\"");
			Game.print("The talking head is screaming the news at you. Okay, maybe she's not literally screaming, but the"
					+ " sound is so loud she might as well be. Sadly, this \"entertainment\" system seems to lack volume"
					+ " control. You've mostly kept the screen off for that reason. Well, that and the fact that you don't"
					+ " give a flying turd about current events in the Rubicon System. You're just here for vacation!");
		}
		on = !on;
	}
	
	@Override
	public void move(String how) {
		if (how.equals("push"))
			use();
		else 
			super.move(how);
	}
	
}
