package items.ch1.resort;

import game.*;

public class Closet extends Item {

	private boolean isOpen;

	public Closet() {
		super("closet");
		isOpen = false;
	}

	@Override
	public void look() {
		Game.print("A simple closet. That's where you stashed the few personal items you brought"
				+ " with you from the Fussilade.");
	}

	@Override
	public void open() {
		if (!isOpen) {
			isOpen = true;
			if (Game.hasFlag("undressed")) {
				Game.print("You slide the closet open and find freshly-laundered clothes.");
				Room r = Game.getCurrentRoom();
				if (!r.hasItem("clothes")) {
					Clothes clothes = new Clothes();
					r.addItem(clothes);
					r.addItem(clothes, "shirt");
					r.addItem(clothes, "pants");
				}
			} else
				Game.print("You slide the closet open and find nothing else of interest.");
		} else
			Game.print("If this were a graphical game, you'd know that the closet is already open.");
	}

	@Override
	public void close() {
		if (isOpen) {
			isOpen = false;
			Game.print("You slide the closet door closed.");
		} else 
			Game.print("It's already closed.");
	}

}
