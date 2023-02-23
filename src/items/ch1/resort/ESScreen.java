package items.ch1.resort;

import game.*;

public class ESScreen extends Item {

	public ESScreen() {
		super("screen");
	}
	
	@Override
	public void look() {
		Game.print("It's your room's entertainment system. It offers exactly one channel. Nothing but the best for you!");
	}
	
	@Override
	public void look(String where) {
		if (where.equals("behind"))
			Game.print("The screen is embedded in the wall. You can't look behind it.");
		else
			super.look(where);
	}
	
	@Override
	public void use() {
		Game.print("Just push the On button. There are no other controls for this thing. You weren't exactly provided with the"
				+ " delux luxury model.");
	}
	
}
