package items.ch1.resort;

import game.*;

public class Floaty extends Item {

	public Floaty() {
		super("floaty");
	}
	
	@Override
	public void look() {
		Game.print("It's a floaty in the shape of a snowy egret. It's supposed to keep you afloat"
				+ " in the pool.");
	}
	
}
