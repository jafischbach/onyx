package items.ch1.resort;

import game.*;

public class Desk extends Item {

	public Desk() {
		super("desk");
	}

	@Override
	public void look() {
		if (Game.player.has("deodorant"))
			Game.print("Just a plain desk. Like everything else in the room, it's cheap but serviceable.");
		else {
			Game.print("Just a plain desk. Like everything else in the room, it's cheap but serviceable."
					+ " There is a stick of deodorant sitting on the desk.");
			Room r = Game.getCurrentRoom();
			if (!r.hasItem("deodorant")) {
				Deodorant d = new Deodorant();
				r.addItem(d);
				r.addItem(d, "stick");
			}
		}
	}

	@Override
	public void open() {
		if (Game.player.has("itinerary"))
			Game.print("You search and search but find nothing else in the desk.");
		else {
			Game.print("You open the desk's lone drawer and find all of you stuff!");
			Game.getCurrentRoom().addItem(new Stuff());
		}
	}

}
