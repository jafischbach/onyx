package items.ch1.resort;

import game.*;

public class ESScreen extends Item {

	public ESScreen() {
		super("screen");
	}
	
	@Override
	public void look() {
		Game.print("It's your room's entertainment system. It offers exactly one channel.");
	}
	
}
