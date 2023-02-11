package items.ch1.resort;

import game.*;

public class Bed extends Item {
	
	public Bed() {
		super("bed");
	}
	
	@Override
	public void look() {
		Game.print("A simple twin-size bed. Not the most comfortable bed in the universe,"
				+ " but it defintely beats your shared bunk on the Fussilade.");
	}
	
	@Override
	public void use() {
		Game.print("You're on vacation, dude! Don't sleep the fun away! There are things to do:"
				+ " places to go, cookies to eat, screens to look at, buttons to press! Get out"
				+ " of your tiny room and experience all The Snowy Egret has to offer!");
	}
	
	@Override
	public void open() {
		Game.print("You already made the bed. Don't mess it up. You didn't qualify for housekeeping"
				+ " service.");
	}
	
}
