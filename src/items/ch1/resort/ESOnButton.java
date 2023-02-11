package items.ch1.resort;

import game.*;

public class ESOnButton extends Item {

	public ESOnButton() {
		super("button");
	}
	
	@Override
	public void look() {
		Game.print("It's the button that turns the screen on and off.");
	}
	
}
