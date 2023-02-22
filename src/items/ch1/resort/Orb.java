package items.ch1.resort;

import game.*;

public class Orb extends Item {

	public Orb() {
		super("orb");
	}

	@Override
	public void look() {
		Game.print("It's a weird glowy orb thing.");
	}

	@Override
	public void use() {
		if (Game.player.has("orb"))
			Game.print("Yeah...uh...you have no idea what the thing does, so \"using\" it is not"
					+ " much of an option right now.");
		else
			Game.print("You don't have the orb yet.");
	}

	@Override
	public void take(String how) {
		if (Game.player.has("orb"))
			Game.print("You arleady have the weird glowy orb thing.");
		else
			Game.print("If you want the orb, you'll have to pay for it first.");
	}

	@Override
	public void open() {
		if (Game.player.has("orb"))
			Game.print("For the love of the Infinite Pantheon, DON'T!");
		else
			Game.print("You don't have the orb yet.");
	}

	@Override
	public void close() {
		if (Game.player.has("orb"))
			Game.print("Um, sure. You can \"close\" a solid spherical object, because that makes"
					+ " total sense.");
		else
			Game.print("You don't have the orb yet.");
	}

	@Override
	public void move(String how) {
		if (Game.player.has("orb"))
			Game.print("You move the weird glowy orb thing around and are mesmerised by all the"
					+ " weird colors. Cool.");
		else
			Game.print("You don't have the orb yet.");
	}

}
