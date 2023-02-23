package characters.ch1;

import game.*;

public class Guest extends NPC {

	public Guest() {
		super("guest");
	}
	
	@Override
	public void look() {
		Game.print("A few guests are here enjoying the huge viewscreen.");
	}
	
	@Override
	public void talk() {
		Game.print("The guests are here to enjoy the viewscreen, not to talk to you.");
	}
	
}
