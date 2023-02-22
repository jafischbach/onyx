package items.ch1.resort;

import game.*;

public class Cookie extends Item {

	private static int numEaten;
	
	public Cookie() {
		super("cookie");
		numEaten = 0;
	}
	
	@Override
	public void look() {
		Game.print("A freshly-baked chocolate, mint, and stawrberry cookie!");
	}
	
	@Override
	public void use() {
		if (numEaten < 10) {
			Game.print("You greedily stuff the cookie in your mouth, where is melts and"
					+ " oozes down your throat. Cookie!!!!");
			Game.player.removeItem("cookie");
			numEaten++;
		} else {
			Game.print("How many cookies can you eat? I worry about you sometimes.");
		}
	}
	
	@Override
	public void take(String how) {
		if (Game.player.has("cookie"))
			Game.print("You already have a cookie. Leave some for the other guests.");
		else {
			Game.print("You pick up a delicious-looking cookie and shove it in your pocket.");
			Game.player.addItem(this);
		}
	}
	
	@Override
	public void uniqueCommand(String command) {
		if (command.equalsIgnoreCase("eat"))
			use();
		else
			super.uniqueCommand(command);
	}
	
}
