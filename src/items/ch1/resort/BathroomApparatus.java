package items.ch1.resort;

import game.*;

public class BathroomApparatus extends Item {

	protected int state;

	private long timeUsed;

	public BathroomApparatus() {
		super("apparatus");
		state = 1;
		timeUsed = 0;
	}

	@Override
	public void look() {
		if (state == 1)
			Game.print("A hole in the floor provides a convenient destination for all of your"
					+ " bodily waste. Just aim and/or squat and do what you gotta do!");
		else if (state == 2)
			Game.print("A nozzel protrudes from the ceiling, presumably to dispense warm water"
					+ " under which you could clense yourself. The hole in the floor serves as a"
					+ " convenient drain. Sadly, if there's a way to turn on the nozzel, you've" + " never found it.");
		else
			Game.print("A nozzel protudes from the wall that dispenses a modest stream of water"
					+ " that you can use to clean your hands and/or eating utensils. Just turn"
					+ " the nozzel! The hole in the floor serves as a drain.");
	}

	@Override
	public void use() {
		if (state == 1)
			if (timeUsed == 0 || System.currentTimeMillis() - timeUsed > 300000) {
				Game.print("You quickly do your business and feel much better. Don't worry; it" + " auto-flushes.");
				timeUsed = System.currentTimeMillis();
			} else
				Game.print("You just did that!");
		else if (state == 2)
			Game.print("Don't bother. It doesn't work. You've spent your entire vacation trying.");
		else
			Game.print("Just turn the nozzel if you feel compelled to.");
	}

}
