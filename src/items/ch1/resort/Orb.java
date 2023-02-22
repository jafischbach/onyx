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
		Game.print("Yeah...uh...you have no idea what the thing does, so \"using\" it is not much of an option right now.");
	}
	
	@Override
	public void take(String how) {
		Game.print("You arleady have the weird glowy orb thing.");
	}
	
	@Override
	public void open() {
		Game.print("For the love of the Infinite Pantheon, DON'T!");
	}
	
	@Override
	public void close() {
		Game.print("Um, sure. You can \"close\" a solid spherical object, because that makes total sense.");
	}
	
	@Override
	public void move(String how) {
		Game.print("You move the weird glowy orb thing around and are mesmerised by all the weird colors. Cool.");
	}
	
}
