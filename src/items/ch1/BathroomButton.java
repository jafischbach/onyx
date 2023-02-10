package items.ch1;

import game.*;

public class BathroomButton extends Item {
	
	public BathroomButton() {
		super("button");
	}
	
	@Override
	public void look() {
		Game.print("This button changes the mode of the apparatus.");
	}
	
	@Override
	public void use() {
		Room r = Game.getCurrentRoom();
		BathroomApparatus ba = (BathroomApparatus) r.getItem("apparatus");
		switch(ba.state) {
		case 1:
			Game.print("You push the button and watch in awe as a grate slides over the hole"
					+ " in the floor and a nozzel appears from the ceiling. This is the apparatus's"
					+ " shower mode. Too bad it doesn't work.");
			r.setDesc("CH1_RESORT_PLAYER_BATHROOM_A");
			ba.state = 2;
			break;
		case 2:
			Game.print("You push the button and the nozzel disappears into the ceiling while"
					+ " another nozzel emerges from the wall. You've activated the apparatus's"
					+ " sink mode! Now you can wash your dishes. So cool.");
			r.setDesc("CH1_RESORT_PLAYER_BATHROOM_B");
			ba.state = 3;
			break;
		case 3:
			Game.print("You push the button to switch the apparatus back into commode mode. The"
					+ " nozzel is sucked back into the wall and the grate covering the hole in"
					+ " the floor slides away.");
			r.setDesc("CH1_RESORT_PLAYER_BATHROOM");
			ba.state = 1;
		}
		Game.printRoom();
	}
	
	@Override
	public void move(String how) {
		if (how.equalsIgnoreCase("push"))
			use();
		else
			Game.print("The button is fine where it is.");
	}
	
}
