package items.ch1.resort;

import game.*;

public class ElevatorButton extends Item {

	protected static String currentFloor = "CH1_RESORT_2ND_FLOOR";
	
	public ElevatorButton() {
		super("button");
	}
	
	@Override
	public void look() {
		Game.print("There are four buttons:");
		Game.println("Observation Lounge Button");
		Game.println("Pentouse Button");
		Game.println("Suites Button");
		Game.print("Lobby Button");
	}
	
	@Override
	public void use() {
		Game.print("Use which button?");
		Game.println("Observation Lounge Button");
		Game.println("Pentouse Button");
		Game.println("Suites Button");
		Game.print("Lobby Button");
	}
	
	@Override
	public void move(String how) {
		if (how.equalsIgnoreCase("push"))
			use();
		else
			super.move(how);
	}
	
}
