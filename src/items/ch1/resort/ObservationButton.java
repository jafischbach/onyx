package items.ch1.resort;

import game.*;

public class ObservationButton extends Item {
	
	public ObservationButton() {
		super("observation lounge button");
	}
	
	@Override
	public void look() {
		Game.print("This button sends the elevator to the Observation Lounge. Did you expect it"
				+ " to do something cooler?");
	}
	
	@Override
	public void use() {
		Game.print("You push the button!");
		if(ElevatorButton.currentFloor.equals("CH1_RESORT_OBSERVATION_LOUNGE"))
			Game.print("You're already on that floor, dumbass.");
		else {
			Game.print("The elevator quickly rises until you hear a happy ding.");
			ElevatorButton.currentFloor = "CH1_RESORT_OBSERVATION_LOUNGE";
			Room r = Game.getCurrentRoom();
			r.setDesc("CH1_RESORT_ELEVATOR_B");
			r.addExit(Game.getRoom("CH1_RESORT_OBSERVATION_LOUNGE"), Room.WEST);
			Game.printRoom();
		}
	}
	
	@Override
	public void move(String how) {
		if (how.equalsIgnoreCase("push"))
			use();
		else
			super.move(how);
	}
	
}
