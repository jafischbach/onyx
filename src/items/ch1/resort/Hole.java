package items.ch1.resort;

import game.*;

public class Hole extends Item {

	private int looked;
	private long timeUsed;

	public Hole() {
		super("hole");
		looked = 0;
		timeUsed = 0;
	}

	@Override
	public void look() {
		switch (state()) {
		case 1:
			switch (looked) {
			case 0:
				Game.print("It's a hole in the floor about six inches across. You've used"
						+ " it many times during your stay and it didn't back up once! Well,"
						+ " okay, there was that one incident after the seafood buffet. It" + " didn't back up twice!");
				break;
			case 1:
				Game.print("Oh, ick. Seriously? You do NOT want to look more closely at the hole" + " in the floor.");
				break;
			case 2:
				Game.print("No, dude. Trust me on this. You do not want to look inside the"
						+ " hole you've spent a week taking a dump in.");
				break;
			case 3:
				Game.print("I'm learning things about you that I'd rather not know. Stop"
						+ " trying to look inside the poop hole!");
				break;
			case 4:
				Game.print("Alright, you sick bastard. You get on your knees and peer deep"
						+ " inside the hole in the floor. What do you expect to find? Treasure?"
						+ " A keycard that will give you access to the penthouse level? A coupon"
						+ " for one free interstellar yacht? A cookie?");
				Game.print("You find nothing, dumbass! All you see is a pipe that curves away. Now"
						+ " stop trying to look inside the damn hole!");
				break;
			default:
				Game.print("Idiot.");
			}
			looked++;
			break;
		case 2:
		case 3:
			Game.print("It's a hole in the floor about six inches across and covered by" + " a metal grate.");
		}
	}

	@Override
	public void look(String where) {
		if (where.equalsIgnoreCase("inside"))
			switch (looked) {
			case 0:
				Game.print("Ok, ick. Seriously? You do NOT want to do that.");
				break;
			case 1:
				Game.print("No, dude. Trust me on this. You do not want to look inside the"
						+ " hole you've spend a month taking a dump in.");
				break;
			case 2:
				Game.print("I'm learning things about you that I'd rather not know. Stop"
						+ " trying to look inside the poop hole!");
				break;
			case 3:
				Game.print("Alright, you sick bastard. You get on your knees and peer deep"
						+ " inside the hole in the floor. What do you expect to find? Treasure?"
						+ " A keycard that will give you access to the pentouse level? A coupon"
						+ " for one free interstellar yacht? A cookie?");
				Game.print("You find nothing, dumbass! All you see is a pipe that curves away. Now"
						+ " stop trying to look inside the damn hole!");
				break;
			default:
				Game.print("Idiot.");
			}
		else
			super.look(where);
	}

	@Override
	public void use() {
		switch (state()) {
		case 1:
			if (timeUsed == 0 || System.currentTimeMillis() - timeUsed > 300000) {
				Game.print("You joyfully empty your bladder. Once again, you are amazed by your"
						+ " flawless aim.");
				timeUsed = System.currentTimeMillis();
			} else
				Game.print("You just did that!");
			break;
		case 2:
		case 3:
			Game.print("You should probably switch the apparatus back into \"commode\" mode"
					+ " if you have some business to take care of. Moving your bowels with that"
					+ " grate in place is probably not the best idea.");
		}
	}

	@Override
	public void open() {
		switch (state()) {
		case 1:
			Game.print("It's as open as it gets!");
			break;
		case 2:
		case 3:
			Game.print("You can't force the grate open. It will open automatically when you"
					+ " switch the apparatus back to \"commode\" mode.");
		}
	}

	private int state() {
		return ((BathroomApparatus) Game.getCurrentRoom().getItem("apparatus")).state;
	}

}
