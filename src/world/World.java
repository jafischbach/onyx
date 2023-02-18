package world;

import game.*;
import items.ch1.resort.*;
//import characters.*;

/**
 * Slipstream Onyx: Chapter 1 - a text adventure developed using FlossTAGE.
 * 
 * 
 * @version alpha (2023)
 *
 */
public class World {

	public static final boolean DEBUG_MODE = true;
	
	/**
	 * Game title.
	 */
	public static final String TITLE = "Slipstream Onyx - Chapter 1";
	
	/**
	 * Game version number.
	 */
	public static final String VERSION = "alpha";
	
	/**
	 * Game developer name.
	 */
	public static final String DEVELOPER = "The Steve Machine";
	
	public static final String INTRO_TEXT = "";
	
	public static final String GAME_OVER_TEXT = "I guess we're done here. Thanks for playing. Bye!";
	
	public static void buildWorld() {
		World_Ch1.buildWorld();
		
		Game.setCurrentRoom(Game.getRoom("CH1_RESORT_PLAYER_ROOM"));
	}

	public static void debugMode() {
		Game.player.addItem(new Deodorant());
		Game.player.addItem(new IDCard());
		Game.player.addItem(new Itinerary());
		Game.player.addItem(new Paycard());
		Game.player.addItem(new Clothes());
		Game.getRoom("CH1_RESORT_SOUTH_HALL").setLocked(false);
		Game.setCurrentRoom(Game.getRoom("CH1_RESORT_GIFT_SHOP"));
	}
	
}
