package items.ch1.resort;

import game.*;

public class Itinerary extends Item {

	private String[] list= {"Have breakfast", "Buy gift for Shelly", "Visit observation deck",
			"Talk to Urias", "Check messages"};
	
	private int completed;
	
	public Itinerary() {
		super("itinerary");
		completed = 0;
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
	
	public void update(int task) {
		switch(task) {
		case 1:
			list[1] = "Buy gift for Shelly (DONE!)";
			completed++;
			break;
		case 2:
			list[2] = "Visit observation deck (DONE!)";
			completed++;
		}
	}
	
}
