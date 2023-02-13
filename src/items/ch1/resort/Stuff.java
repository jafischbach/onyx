package items.ch1.resort;

import game.*;

public class Stuff extends Item {

	private IDCard idCard;
	private Paycard paycard;
	private Itinerary itinerary;
	
	public Stuff() {
		super("stuff");
		idCard = new IDCard();
		paycard = new Paycard();
		itinerary = new Itinerary();
	}

	@Override
	public void look() {
		Game.print("It's your Milt-Maalt Transport ID card, your paycard, and an itineratry.");
		Room r = Game.getCurrentRoom();
		if (!r.hasItem("paycard")) {
			r.addItem(idCard);
			r.addItem(paycard);
			r.addItem(itinerary);
		}
	}

	@Override
	public void take(String how) {
		if (Game.hasFlag("undressed"))
			Game.print("You're naked, buddy. Where are you gonna put the stuff? Do I want to know?");
		else {
			Game.print("You pick up your ID card, playcard, and itinerary and stuff them into your pockets.");
			Game.player.addItem(idCard);
			Game.player.addItem(paycard);
			Game.player.addItem(itinerary);
			Room r = Game.getCurrentRoom();
			r.removeItem("ID card");
			r.removeItem("paycard");
			r.removeItem("itinerary");
			r.removeItem("stuff");
			Game.getRoom("CH1_RESORT_SOUTH_HALL").setLocked(false);
		}
	}

}
