package items.ch1.resort;

import game.*;

public class Itinerary extends Item {

	private String[] list= {"Have breakfast", "Buy gift for Shelly", "Visit observation deck",
			"Talk to Urias", "Check messages"};
	
	public Itinerary() {
		super("itinerary");
	}
	
	@Override
	public void look() {
		Game.print("It's the itinerary for your last day of vacation!");
		if (Game.player.has("itinerary"))
			for(String s : list)
				Game.println(s);
	}
	
	@Override
	public void take(String how) {
		if (Game.player.has("itinerary"))
			Game.print("You already have the itinerary card.");
		else {
			Game.print("Might as well take all your stuff.");
			Game.getCurrentRoom().getItem("stuff").take(how);
		}
	}
	
}
