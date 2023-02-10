package world;

import game.*;
import world.ch1.*;
//import items.*;
//import characters.*;

/**
 * Slipstream Onyx: Chapter 1 - a text adventure developed using FlossTAGE.
 * 
 * 
 * @version alpha (2023)
 *
 */
public class World {

	/**
	 * Game title.
	 */
	public static final String TITLE = "Slipstream Onyx";
	
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

	
}
