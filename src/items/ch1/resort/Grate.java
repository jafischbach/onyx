package items.ch1.resort;

import game.*;

public class Grate extends Item {

	public Grate() {
		super("grate");
	}
	
	@Override
	public void look() {
		switch(state()) {
		case 1:
			Game.print("You can't see the grate.");
			break;
		case 2:
		case 3:
			Game.print("A metal grate covers the hole in the floor.");
		}
	}
	
	@Override
	public void open() {
		switch(state()) {
		case 1:
			Game.print("It's already open.");
			break;
		case 2:
		case 3:
			Game.print("You can't force the grate open. It will open automatically when you"
					+ " switch the apparatus back to \"commode\" mode.");
			break;
		}
	}
	
	@Override
	public void take(String command) {
		switch(state()) {
		case 1:
			Game.print("The grate is not there for you to take.");
			break;
		case 2:
		case 3:
			Game.print("As much as you'd love to spend the rest of your day carrying a"
					+ " metal grate around, you lack the strength to pry the grate from its"
					+ " slot in the floor.");
		}
	}
	
	private int state() {
		return ((BathroomApparatus) Game.getCurrentRoom().getItem("apparatus")).state;
	}
	
}
