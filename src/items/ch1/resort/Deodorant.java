package items.ch1.resort;

import game.*;

public class Deodorant extends Item {

	public Deodorant() {
		super("deodorant");
	}

	@Override
	public void look() {
		Game.print("It's a stick of Dr. Rosewater's BO-Begone Anti-Stench. Four out of"
				+ " ten odor specialists recommend it for organic aroma management.");
	}

	@Override
	public void use() {
		if (Game.player.has("deodorant")) {
			if (Game.hasFlag("smelly")) {
				Game.print("Barely able to tolerate your own funk, you position the stick beneath"
						+ " your pits and squeeze. A warm, tingly sensation follows as the stick"
						+ " bombards your stinky pores with what you hope is the non-fatal kind"
						+ " of organic aroma management radiation.");
				Game.print("You take a deep whif and are relieved to discover that you are no longer"
						+ " stinky. Now you can venture out in public with minimal shame!");
				Game.removeFlag("smelly");
			}
		} else {
			Game.print("You don't have the stick of deodorant.");
		}
	}

	@Override
	public void open() {
		Game.print("It's not that kind of deodorant. You can't open it.");
	}
	
	@Override
	public void take(String how) {
		if (Game.player.has("deodorant"))
			Game.print("You already have the stick of deodorant.");
		else if (Game.hasFlag("dirty"))
			Game.print("You should probably take a \"shower\" first, don't you think?");
		else {
			Game.print("You grab the stick of deodorant. No way you're"
					+ " going outside without that!");
			Game.player.addItem(this);
			Game.getCurrentRoom().removeItem("deodorant");
		}
	}
	
}
