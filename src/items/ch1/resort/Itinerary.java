package items.ch1.resort;

import game.*;

public class Itinerary extends Item {

	public Itinerary() {
		super("itinerary");
	}
	
	@Override
	public void look() {
		Game.print("It's the itinerary for your last day of vacation!");
	}
	
}
