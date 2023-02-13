package items.ch1.resort;

import game.*;

public class Clothes extends Item {

	public Clothes() {
		super("clothes");
	}
	
	@Override
	public void look() {
		if (Game.player.has("clothes"))
			Game.print("Yes, you are still dressed. This is not like that creepy dream you had."
					+ " Stop being paranoid.");
		else
			Game.print("A red shirt and beige pants. The epitome of intergalactic style. (You"
					+ " keep telling yourself.)");
	}
	
	@Override
	public void take(String how) {
		if (Game.player.has("clothes"))
			Game.print("Um. You're currently wearing them. You feeling okay?");
		else {
			if (Game.hasFlag("smelly"))
				Game.print("You stink, dude. Might want to address that little situation first.");
			else {
				Game.print("You eagerly step into your pants and pull your shirt over your head."
						+ " You find your boots in the bottom of the closet and put them on as"
						+ " well. Now you're ready to face whatever the day plans to hurl at you!");
				Game.removeFlag("undressed");
				Game.player.addItem(this);
				Game.getCurrentRoom().removeItem("clothes");
			}
		}
	}
	
}
