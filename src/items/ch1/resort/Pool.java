package items.ch1.resort;

import game.*;

public class Pool extends Item {

	public Pool() {
		super("pool");
	}
	
	@Override
	public void look() {
		Game.print("It's a large pool full of clear, rippling water. It's only about seven"
				+ " or eight feet deep.");
	}
	
	@Override
	public void use() {
		if (Game.player.has("floaty"))
			Game.print("Use the floaty if you insist on getting into the pool.");
		else
			Game.print("Are you mad? It's a pool. On a space station. Don't you have, maybe, a tiny"
				+ " problem with that?");
	}
	
}
