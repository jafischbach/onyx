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
		Room lobby = new Room("CH1_RESORT_LOBBY", "The Snowy Egret Lobby");
		Room northHall = new Room("CH1_RESORT_NORTH_HALL", "The Snowy Egret North Hall");
		Room pool = new Room("CH1_RESORT_POOL", "Pool");
		Room giftShop = new Room("CH1_RESORT_GIFT_SHOP", "The Snowy Egret Gift Shop");
		Room secondFloor = new Room("CH1_RESORT_2ND_FLOOR", "The Snowy Egret 2nd Floor Lobby");
		Room restaurant = new Room("CH1_RESORT_RESTAURANT", "Gustav Murray's Cajun Cafe and Ice Cream Bar");
		Room elevator = new Room("CH1_RESORT_ELEVATOR", "Elevator");
		Room observation = new Room("CH1_RESORT_OBSERVATION_LOUNGE", "Observation Lounge");
		
		Game.addFlag("dirty");
		Game.addFlag("smelly");
		Game.addFlag("undressed");
		
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
		southHall.addExit(lobby, Room.NORTH);
		southHall.setLocked(true);
		
		lobby.addExit(southHall, Room.SOUTH);
		lobby.addExit(northHall, Room.NORTH);
		lobby.addExit(giftShop, Room.EAST);
		lobby.addExit(secondFloor, Room.UP);
		
		northHall.addExit(lobby, Room.SOUTH);
		northHall.addExit(pool, Room.NORTH);
		
		pool.addExit(northHall, Room.SOUTH);
		
		giftShop.addExit(lobby, Room.WEST);
		makeGiftShop(giftShop);
		
		secondFloor.addExit(restaurant, Room.NORTH);
		secondFloor.addExit(elevator, Room.EAST);
		secondFloor.addExit(lobby, Room.DOWN);
		
		elevator.addExit(secondFloor, Room.WEST);
		elevator.addItem(new ElevatorButton());
		elevator.addItem(new ObservationButton());
		elevator.addItem(new LobbyButton());
		
		observation.addExit(elevator, Room.EAST);
		
		restaurant.addExit(secondFloor, Room.SOUTH);
	}
	
	private static void makeGiftShop(Room giftShop) {
		giftShop.addSimpleItem("snowglobe", "CH1_SNOWGLOBE");
		giftShop.addSimpleItem("cuckoo clock", "CH1_CUCKOO_CLOCK");
		giftShop.addSimpleItem("clock", "CH1_CUCKOO_CLOCK");
		giftShop.addSimpleItem("stuffed animal", "CH1_STUFFED_ANIMAL", 
				"You spot a primate of some sort and a rabbit-like thing among the plush"
				+ " creatures. Most of them are snowy egrets though. Duh.");
		giftShop.addSimpleItem("animal", "CH1_STUFFED_ANIMAL");
		giftShop.addSimpleItem("glass figurine", "CH1_GLASS_FIGURINES");
		giftShop.addSimpleItem("figurine", "CH1_GLASS_FIGURINES");
		giftShop.addSimpleItem("schlock", "CH1_SCHLOCK", 
				"Snowglobes, cuckoo clocks, stuffed animals, and glass figurines. Just a"
				+ " bunch of crap designed to extract money from suckers on vacation. You"
				+ " are not a sucker, so none of it is of use to you.");
	}
	
}
