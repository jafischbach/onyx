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
		Game.print("Are you mad? It's a pool. On a space station. Don't you have, maybe, a tiny"
				+ " problem with that? No, you are not getting into that pool.");
	}
	
}
