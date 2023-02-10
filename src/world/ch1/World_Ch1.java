package world.ch1;

import game.*;
import items.ch1.*;

public class World_Ch1 {

	public static void buildWorld() {
		buildResort();
	}
	
	private static void buildResort() {
		Room playerRoom = new Room("CH1_RESORT_PLAYER_ROOM", "Your Room");
		Room playerBath = new Room("CH1_RESORT_PLAYER_BATHROOM", "Your \"Bathroom\"");
		Room southHall = new Room("CH1_RESORT_SOUTH_HALL", "The Snowy Egret South Hall");
		
		playerRoom.addExit(playerBath, Room.NORTH);
		playerRoom.addExit(southHall, Room.WEST);
		
		playerBath.addExit(playerRoom, Room.SOUTH);
		playerBath.addItem(new BathroomApparatus());
		playerBath.addItem(new BathroomButton());
		
		southHall.addExit(playerRoom, Room.EAST);		
	}
	
}
