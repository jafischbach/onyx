package world;

import game.*;
import items.ch1.resort.*;

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
		playerRoom.addItem(new Bed());
		playerRoom.addItem(new Closet());
		playerRoom.addItem(new Desk());
		playerRoom.addItem(new ESOnButton());
		ESScreen esscreen = new ESScreen();
		playerRoom.addItem(esscreen);
		playerRoom.addItem(esscreen, "entertainment system");
		
		playerBath.addExit(playerRoom, Room.SOUTH);
		playerBath.addItem(new BathroomApparatus());
		playerBath.addItem(new BathroomButton());
		playerBath.addItem(new Nozzel());
		playerBath.addItem(new Hole());
		playerBath.addItem(new Grate());
		
		southHall.addExit(playerRoom, Room.EAST);		
	}
	
}
