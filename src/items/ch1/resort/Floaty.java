package items.ch1.resort;

import game.*;

public class Floaty extends Item {

	public Floaty() {
		super("floaty");
	}
	
	@Override
	public void look() {
		Game.print("It's a floaty in the shape of a snowy egret. It's supposed to keep you afloat"
				+ " in the pool.");
	}
	
	@Override
	public void use() {
		Game.print("You toss the floaty in the pool and eagerly jump in after it. (Don't"
				+ " worry! Your clothes are water proof! Cool, eh?)");
		if (Game.hasFlag("death trap pool")) {
			Game.print("You grab the floating snowy egret and begin merrily kicking around"
					+ " the pool. The water is quite nice. You start to wonder why you waited"
					+ " until the last day to go for a swim.");
			Game.print("Suddenly, an alarm sounds, the ambient lighting starts flashing an"
					+ " angry red, and you feel yourself falling. But how can you \"fall\" in"
					+ " a swimming pool? You lose gravity, that's how! You find yourself floating"
					+ " above the pool. Unfortunately, most of the pool water floats with you."
					+ " You find yourself engulfed in a huge mass water, unable to breath."
					+ " Being weightless and all, you can't find a way to propel yourself out"
					+ " of the mass.");
			Game.print("Your last thought before you drown is, \"Swimming pool on a space station!"
					+ " I knew this would happen!\" Well, you were right.");
			Game.endGame();
		} else {
			Game.print("Taking hold of the snowy egret, you lazily float around the pool. Very"
					+ " relaxing. Why did you wait until your last day of vacation to go for"
					+ " a swim?");
			Game.print("After a while, you experience a sudden and urgent need to pee.");
			char pee = Game.getYesNoDialog("Do you let loose?");
			Game.clearDisplay();
			if (pee == 'y') {
				Game.print("You void your bladder while floating in the pool, feeling much better"
						+ " and not at all ashamed of yourself.");
				NPC miri = Game.getCurrentRoom().getNPC("miri");
				miri.say("Oh, "+Game.player.getName()+"! That's just...how could...oh!");
				Game.print("Miri hauls you out of the pool, confiscates the floaty, and literally"
						+ " kicks you out the door.");
				Game.player.removeItem("floaty");
				Game.getRoom("CH1_RESORT_NORTH_HALL").setLocked(false);
				Game.setCurrentRoom("CH1_RESORT_NORTH_HALL");
				Game.printRoom();
				Game.addFlag("disgusted miri");
			} else {
				Game.print("Being an adult and actually possessing some consideration for your"
						+ " fellow guests, you quickly hop out of the pool, return the floaty to"
						+ " the pool attendant and scurry to your room just in time!");
				Game.player.removeItem("floaty");
				Game.getRoom("CH1_RESORT_NORTH_HALL").setLocked(false);
				Game.addFlag("worried miri");
				Room r = Game.getRoom("CH1_RESORT_PLAYER_BATHROOM");
				r.setDesc("CH1_RESORT_PLAYER_BATHROOM");
				Game.setCurrentRoom(r);
				Game.printRoom();
				BathroomApparatus apparatus = (BathroomApparatus) r.getItem("apparatus");
				apparatus.state = 1;
				Hole hole = (Hole) r.getItem("hole");
				hole.timeUsed = 0;
				hole.use();
			}
		}
	}
	
	@Override
	public void open() {
		Game.print("Are you trying to deflate the floaty? You can't. It's a tamper-proof floaty.");
	}
	
	@Override
	public void uniqueCommand(String command) {
		if (command.equals("deflate") || command.equals("puncture"))
			open();
		else
			super.uniqueCommand(command);
	}
	
}
