package items.ch1.resort;

import game.*;

public class Nozzel extends Item {

	private boolean isOn;
	
	public Nozzel() {
		super("nozzel");
		isOn = false;
	}
	
	@Override
	public void look() {
		switch (state()) {
		case 1:
			Game.print("You don't see a nozzel.");
			break;
		case 2:
			Game.print("A silver, non-functional nozzel protrudes from the ceiling."
					+ " You assume it's supposed to dispense water, but you'll never"
					+ " know for sure.");
			break;
		case 3:
			if (isOn)
				Game.print("A hooked nozzel extends from the wall. A modest stream of water"
						+ " falls to the floor and disappeares into the grated hole in the floor.");
			else
				Game.print("A hooked nozzel extends from the wall. It is pointed up. You found"
						+ " this strange at first, until you realized you need to turn the nozzel"
						+ " to start the water flowing.");
		}
	}

	@Override
	public void use() {
		switch (state()) {
		case 1:
			Game.print("There is no nozzel, weirdo.");
			break;
		case 2:
			Game.print("You can spend all day trying, but you're never getting that thing"
					+ " to actually start spraying water (or anything else).");
			break;
		case 3:
			if (isOn) {
				Game.print("Trying your best not to get your fingers wet, you grip the nozzel"
						+ " and turn it back to its upward \"off\" position.");
				isOn = false;
			} else {
				Game.print("You turn the nozzel so that it points to the floor and a cool stream"
						+ " of water starts pouring onto the floor.");
				isOn = true;
				if (Game.hasFlag("dirty")) {
					Game.print("You cup your hands beneath the stream of water and wait patiently for"
							+ " your hands to fill, whistling a nameless tune to pass the time. Once"
							+ " your hands are full, you splash the cool, mostly clean, water onto"
							+ " your face. You repeat the process with other, strategic, parts of your"
							+ " body until you've completed the best approximation of a shower you can"
							+ " manage given the apparatus you have to work with.");
					Game.print("You're (sorta) clean now, but still smelly.");
					Game.removeFlag("dirty");
				}
			}
		}
	}
	
	@Override
	public void move(String how) {
		Game.print("Try turning it.");
	}
	
	@Override
	public void open() {
		switch(state()) {
		case 1:
			Game.print("What nozzel?");
			break;
		case 2:
			Game.print("Since you are not a certified plumber, and lack a certified plumber's"
					+ " tools, you can't open the nozzel.");
			break;
		case 3:
			Game.print("Since you are not a certified plumber, and lack a certified plumber's"
					+ " tools, you can't open the nozzel. You can turn it on and off though.");
		}
	}
	
	@Override
	public void close() {
		switch(state()) {
		case 1:
			Game.print("What nozzel?");
			break;
		case 2:
			Game.print("What does that even mean?");
			break;
		case 3:
			Game.print("You can't close the nozzel, but you can turn it on and off.");
		}
	}
	
	@Override
	public void uniqueCommand(String command) {
		if (command.equalsIgnoreCase("turn"))
			use();
		else
			super.uniqueCommand(command);
	}
	
	private int state() {
		return ((BathroomApparatus) Game.getCurrentRoom().getItem("apparatus")).state;
	}
	
}
