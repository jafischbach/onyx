package characters.ch1;

import game.*;
import items.ch1.resort.*;

public class PoolAttendant extends NPC {

	private int convo;

	public PoolAttendant() {
		super("miri");
		convo = 1;
	}

	@Override
	public void look() {
		if (Game.hasFlag("worried miri"))
			Game.print("The pool attendant is watching you with concern.");
		else if (Game.hasFlag("disgusted miri"))
			Game.print("The pool attendant glares at you with disgust.");
		else
			Game.print("The pool attendant is a young woman whose nametag identifies as \"Miri\"."
				+ " She is not wearing a swimsuit. You do not find this odd.");
	}

	@Override
	public void give(String what) {
		if (what.equals("floaty")) {
			say("Oh, okay. Decided not to swim after all? Well, enjoy the rest of your stay!");
			Game.player.removeItem("floaty");
			Game.getRoom("CH1_RESORT_NORTH_HALL").setLocked(false);
			convo = 9;
		}
	}
	
	@Override
	public void talk() {
		if (Game.hasFlag("disgusted miri"))
			say("Just...ew. Please leave.");
		else if (Game.hasFlag("worried miri")) {
			say(Game.player.getName()+"! Are you okay? You rushed out of here so fast!");
			Game.player.say("Oh, I'm fine. Just remembered something in my room. All good!");
			say("I'm glad. I hope you enjoy the rest of your stay!");
			convo = 9;
			Game.removeFlag("worried miri");
		} else {
			switch (convo) {
			case 1:
				convo1();
				break;
			case 2:
				convo2();
				break;
			case 3:
				convo3();
				break;
			case 4:
				convo4();
				break;
			case 5:
				convo5();
				break;
			case 6:
				convo6();
				break;
			case 7:
				convo7();
				break;
			case 8:
				convo8();
				break;
			case 9:
				convo9();
				break;
			case 10:
				convo10();
				break;
			case 11:
				convo11();
				break;
			case 12:
				convo12();
				break;
			case 13:
				convo13();
				break;
			case 14:
				convo14();
				break;
			}
		}
	}

	@Override
	public void response(int option) {
		switch (convo) {
		case 1:
			response1(option);
			break;
		case 2:
			response2(option);
			break;
		case 3:
			response3(option);
			break;
		case 4:
			response4(option);
			break;
		case 5:
			response5(option);
			break;
		case 6:
			response6(option);
			break;
		case 7:
			response7(option);
			break;
		case 11:
			response11(option);
			break;
		case 12:
			response12(option);
			break;
		case 13:
			response13(option);
			break;
		case 14:
			response14(option);
			break;
		}
	}

	private void convo1() {
		say("Hello, " + Game.player.getName() + ". Will you be swimming today?");
		String[] options = { "Nope.",
				"Is it safe to swim here? I ask because...well...you're not wearing" + " a swimsuit.",
				"Yes! Today's the day!" };
		getResponse(options);
	}

	private void response1(int option) {
		switch (option) {
		case 1:
			say("As far as I know, you've never used the pool. Don't like water?");
			convo = 2;
			convo2();
			break;
		case 2:
			say("Why would I be wearing a swimsuit?");
			convo = 3;
			convo3();
			break;
		case 3:
			say("Really? You've been here a whole week and haven't used the pool once. Are you sure?");
			convo = 4;
			convo4();
		}
	}

	private void convo2() {
		String[] options = { "I like water. I don't like drowning. So...no pool for me.",
				"I'm just not sold on the whole swimming-pool-on-a-space-station concept." };
		getResponse(options);
	}

	private void response2(int option) {
		switch (option) {
		case 1:
			say("Ah. Well, the pool's not that deep. You're unlikely to drown. I could get you a"
					+ " floaty if you like.");
			convo = 5;
			convo5();
			break;
		case 2:
			say("Really? I don't see what's so strange about it.");
			convo = 6;
			convo6();
		}
	}

	private void convo3() {
		String[] options = { "Because, you know, you're the pool attendant?",
				"So your clothes don't get wet when you jump in the pool?",
				"Uh..haha...no reason. I don't know why I said that!" };
		getResponse(options);
	}

	private void response3(int option) {
		switch (option) {
		case 1:
			say("I'm the pool attendant. Not the lifeguard. Mostly my job is to fetch"
					+ " floaties for guests who want them. So, um, would you like a floaty?");
			convo = 5;
			convo5();
			break;
		case 2:
			say("Why would I jump in the pool?");
			convo = 12;
			convo12();
			break;
		case 3:
			Game.print("Miri laughs.");
			say("You're funny, " + Game.player.getName() + "! Now why would you think it's not safe"
					+ " to swim here?");
			convo = 13;
			convo13();
		}
	}

	private void convo4() {
		String[] options = {"Yep. I'm sure.", "On second thought, I'll avoid this particular"
				+ " death trap."};
		getResponse(options);
	}

	private void response4(int option) {
		switch (option) {
		case 1:
			say("Cool! Let me fetch a floaty for you.");
			convo = 5;
			convo5();
			break;
		case 2:
			say("Death trap? It's a pool, not a death trap, "+Game.player.getName()+"! Why would"
					+ " you think that?");
			convo = 13;
			convo = 13;
		}
	}
	
	private void convo5() {
		String[] options = { "What the hell is a floaty?", "Uh, no. I think I'll stay dry today. Thanks." };
		getResponse(options);
	}

	private void response5(int option) {
		switch (option) {
		case 1:
			say("It's a floaty. You know, it floats.");
			Game.print("You stare at her, your face awash with incomprehension.");
			say("It's a device that floats on the water. You hold on to it so you, you know, float.");
			Game.player.say("Oh, sure. A floaty, you said. For the water.");
			say("Ours is in the shape of an egret!");
			Game.player.say("Of course it is.");
			say("So...do you want one?");
			convo = 7;
			convo7();
			break;
		case 2:
			convo = 8;
			convo8();
			break;
		}
	}

	private void convo6() {
		String[] options = { "I mean, we're on a space station, right? I know it spins and all and there's some"
				+ " gravity to keep us all from floating around. But, is it really enough to keep"
				+ " all that water in the pool? I keep expecting all that water to suddenly rise up"
				+ " in a huge blob and...well...swallow me.", "Yeah, okay. It's not weird at all." };
		getResponse(options);
	}

	private void response6(int option) {
		switch (option) {
		case 1:
			say("That's ridiculous, " + Game.player.getName() + ". That can't happen!");
			convo = 11;
			convo11();
			break;
		case 2:
			say("Of course it's not weird. We're a resort after all. How can you have a resort"
					+ " without a swimming pool?");
			Game.player.say("Yeah, I guess you're right.");
			say("So, do you want to swim? I can get you a floaty!");
			convo = 5;
			convo5();
		}
	}

	private void convo7() {
		String[] options = { "Sure, why not?", "No, thanks. I appreciate the offer though." };
		getResponse(options);
	}

	private void response7(int option) {
		switch (option) {
		case 1:
			say("Awesome! I'll be right back!");
			Game.print("Miri leaves the pool area and comes back several minutes later carrying"
					+ " an inflated snowy egret. She hands it to you with a smile. It's too"
					+ " big to fit in your pocket, so you just carry it.");
			Game.player.say("Wow. Thanks.");
			say("You're welcome! Enjoy! Oh, and you can't leave the pool area with that. Just give"
					+ " it to me when you're done with it.");
			Game.getRoom("CH1_RESORT_NORTH_HALL").setLocked(true);
			Floaty floaty = new Floaty();
			Game.player.addItem(floaty);
			convo = 10;
			break;
		case 2:
			convo = 8;
			convo8();
		}
	}

	private void convo8() {
		say("Okay, " + Game.player.getName() + ". Enjoy your last day here!");
		convo = 9;
	}

	private void convo9() {
		say("I hope you enjoy the rest of your stay! Take care, " + Game.player.getName() + ".");
	}

	private void convo10() {
		say("Having fun? Just give me the floaty when you're done with it.");
	}

	private void convo11() {
		String[] options = { "Are you sure?",
				"Yeah, you're right! Sometimes I get a little paranoid and think everything's" + " a death trap." };
		getResponse(options);
	}

	private void response11(int option) {
		switch (option) {
		case 1:
			say("Of course I'm sure. Um...");
			Game.print("The pool attendant stares silently at the pool.");
			say("You know...");
			Game.print("She takes a few steps towards the door.");
			say("Um...I never really though about...");
			Game.print("Suddently, Miri pales and after a last, worried glance at the water"
					+ " in the pool, scurries out of the room.");
			Room r = Game.getCurrentRoom();
			r.removeNPC("miri");
			r.setDesc("CH1_RESORT_POOL_A");
			Game.printRoom();
			break;
		case 2:
			Game.print("The pool attendant laughs.");
			say("Romanicus Station is the safest space station you'll ever set foot on, and"
					+ " all of us at The Snowy Egret will keep you safe, " + Game.player.getName()
					+ ". There are no death traps here. So, do you want to swim? I can get you a" + " floaty!");
			Game.addFlag("death trap pool");
			convo = 5;
			convo5();
		}
	}

	private void convo12() {
		String[] options = { "To save people who are drowning?",
				"I mean, you want me to jump in the pool so...why wouldn't you?", "Um...no reason." };
		getResponse(options);
	}

	private void response12(int option) {
		switch (option) {
		case 1:
			say("Save people from drowning? You can't drown in this pool! It's not that deep."
					+ " Besides, guests can use floaties. Do you want me to get you a floaty?");
			convo = 5;
			convo5();
			break;
		case 2:
			say("I can't jump in the pool, " + Game.player.getName() + "! I have to stay here to"
					+ " attend to the guests!");
			convo = 14;
			convo14();
			break;
		case 3:
			say("Um, okay. So do you want to swim? I can get you a floaty.");
			convo = 5;
			convo5();
		}
	}

	private void convo13() {
		String[] options = { "Well, I mean, it's a space station, so...", "Space sharks?",
				"Okay, you're right. I'm sure it's perfectly safe." };
		getResponse(options);
	}

	private void response13(int option) {
		switch (option) {
		case 1:
			say("Yes. It's a space station. I don't know what that has to do with the swimming"
					+ " pool, but if you don't want to swim, that's okay. We have plenty of other"
					+ " attractions here at The Snowy Egret. I'm sure you'll find something fun"
					+ " to do on your last day!");
			convo = 9;
			break;
		case 2:
			say("Space sharks?");
			Game.print("The pool attendant peers into the pool, confused.");
			Game.player.say("I was joking. That was me being funny. Or trying to be...");
			say("Oh, haha, space sharks. You are funny. Space sharks. That's silly. Well, I"
					+ " don't have any space sharks, but I do have a Snowy Egret floaty. If"
					+ " you want to swim, I can get you one.");
			convo = 5;
			convo5();
			break;
		case 3:
			say("Of course it is! Especially if you use a floaty. I can get you one if you want.");
			convo = 5;
			convo5();

		}
	}

	private void convo14() {
		String[] options = {
				"Ah, of course. So, um, what kind of attendance...er...attention do guests typically"
						+ " need? Help with suntan lotion? 'Cause, you know: space station.",
				"Okay, well, you're doing a great job. Thank you for being attentive and, er, have" + " a nice day!" };
		getResponse(options);
	}

	private void response14(int option) {
		switch (option) {
		case 1:
			say("Suntan lotion? You're funny. No, I get floaties for guests who want them. Do" + " you want a floaty, "
					+ Game.player.getName() + "?");
			convo = 5;
			convo5();
			break;
		case 2:
			convo8();
		}
	}

}
