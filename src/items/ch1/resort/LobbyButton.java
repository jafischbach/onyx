package items.ch1.resort;

import game.*;

public class LobbyButton extends Item {

	public LobbyButton() {
		super("lobby button");
	}
	
	@Override
	public void look() {
		Game.print("This button sends the elevator to the 2nd floor lobby.");
	}
	
	@Override
	public void use() {
		Game.print("You push the button!");
		if(ElevatorButton.currentFloor.equals("CH1_RESORT_2ND_FLOOR"))
			Game.print("You're already on that floor, dumbass.");
		else {
			Game.print("The elevator quickly falls until you hear a happy ding.");
			ElevatorButton.currentFloor = "CH1_RESORT_2ND_FLOOR";
			Room r = Game.getCurrentRoom();
			r.setDesc("CH1_RESORT_ELEVATOR");
			r.addExit(Game.getRoom("CH1_RESORT_2ND_FLOOR"), Room.WEST);
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
