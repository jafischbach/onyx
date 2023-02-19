package characters.ch1;

import game.*;

public class GiftShopClerk extends NPC {

	private int convo;
	
	public GiftShopClerk() {
		super("bobo");
		convo = 1;
	}
	
	@Override
	public void look() {
		Game.print("The gift shop clerk is barely old enough to be considered an adult. He watches"
				+ " you closely, hoping to make a sale. His nametag says \"Bobo\".");
	}
	
	@Override
	public void talk() {
		switch(convo) {
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
		default:
			Game.print("The clerk ignores you.");
		}
	}
	
	@Override
	public void response(int option) {
		switch(convo) {
		case 1:
			response1(option);
			break;
		case 2:
			response2(option);
			break;
		case 3:
			response3(option);
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
		case 8:
			response8(option);
			break;
		case 10:
			response10(option);		
		}
	}
	
	private void convo1() {
		Game.print("The clerk smiles as you approach, hoping you're the sucker he's been waiting"
				+ " for.");
		say("Good morning! Please take all the time you need to peruse our collection of exclusive"
				+ " gifts. All of unsurpassed quality and value! Here you'll find the perfect"
				+ " memento of your stay at The Snowy Egret. I'm sure you have many memories of"
				+ " our fine resort that you wish to cherish for years and years. How can I be"
				+ " of some humble service?");
		String[] options = new String[3];
		options[0] = "Wow. That was a weighty sales pitch. How long did it take to memorize all that?";
		options[1] = "Seriously, dude. What's the deal with the snowglobes? Why is there snow in space?";
		options[2] = "You know this place is a joke, right? All you sell here is over-priced crap.";
		getResponse(options);
	}
	
	private void response1(int option) {
		switch(option) {
		case 1:
			say("Memorize? I didn't memorize anything. I just made that up. Right now. When you walked"
					+ " in. I said to myself, \"Bobo, my boy, this here is a sophisticated client,"
					+ " so you better be on top of your game and wow with an equally sophisticated"
					+ " welcome.\" So...uh...was it sophisticated?");
			convo = 2;
			convo2();
			break;
		case 2:
			say("Snow? Oh, no, that's not snow. Well, okay, it's snow in some of them. The cabin?"
					+ " And the castle? You saw those, right? But the others...you know, the station"
					+ " and the moon and...");
			Game.player.say("Yeah, dude, I saw them all.");
			say("Oh, cool. I mean, very good! I could tell when you walked in that you were a client"
					+ " of sophistication and...er...thoroughness. Anyway, the other globes aren't"
					+ " really \"snow\" globes, per se. You see, the \"snow\" in them actually"
					+ " represents...um...cosmic particles. Yes! Cosmic particles that have an..."
					+ "um...crystalline structure and when solar radiation in the form of...er..."
					+ "photons passes through, it makes these...um...cosmic particles look just"
					+ " like snow! It's very scientific. And the perfect memento of your time"
					+ " here at The Snowy Egret! I recommend the Rubicon Betas. Shall I have it"
					+ " gift wrapped for you?");
			convo = 3;
			convo3();
			break;
		case 3:
			say("Well that's not true at all! All of our items are hand crafted, unique...um..."
					+ "colletables that are certified by the...er...Rubicon Collectables"
					+ " Standards Enforcement...um...Agency. Yeah, the...uh...RCS...um...A, no,"
					+ " I mean...uh...RCSEA. Yes! RCSEA. Or, you know, what we locals call"
					+ " Rucksee. Yup, those Rucksee boys are hardcore. You don't mess with them!");
			Game.player.say("Sure. No doubt. Cool stuff. Very colletable. I see that now.");
			say("I saw you admiring our snowglobes. They're only for the most discerning of"
					+ " collectors. And you are, for certain, a discerning collector. I could"
					+ " tell right away. Shall I have one of the Rubicon Betas gift wrapped for"
					+ " you?");
			convo = 3;
			convo3();
		}
	}
	
	private void convo2() {
		String[] options = 
			{"Totally. I was actually blown away by how sophisticated it was. I'm even more"
					+ " impressed now that I know you thought it up on the spot. Just for me."
					+ " I'm not used to such individualized service.",
			 "Uh, no."};
		getResponse(options);
	}
	
	private void response2(int option) {
		switch(option) {
		case 1:
			say("Individualized service is what The Snowy Egret is all about! That certainly"
					+ " extends to my little domain here in the gift shop. Now, how about a"
					+ " snowglobe? I saw you admiring our Rubicon Betas. Shall I have one"
					+ " wrapped for you?");
			convo = 3;
			convo3();
			break;
		case 2:
			Game.print("The clerk's smile falters.");
			say("Well. Um...that...well, I...er...");
			Game.print("The poor guy starts sobbing. You may have broken him. Good job.");
			convo = 4;
			convo4();
		}
	}
	
	private void convo3() {
		String[] options = {
				"Oh, hell no.", "Actually, I was looking for something a little less...touristy."};
		getResponse(options);
	}
	
	private void response3(int option) {
		switch(option) {
		case 1:
			say("Cuckoo clock? We have one with a perfect likeness of Rubicon's president! She'll"
					+ " pop out once every hour to tell you the time. Isn't that just the most"
					+ " precious thing?");
			convo = 5;
			convo5();
			break;
		case 2:
			say("Hm. Less touristy, you say.");
			Game.print("The clerk looks around and, seeing no one else in the shop, leans close"
					+ " and speaks to you in a whisper.");
			say("How much might you be willing to spend for something...a little less touristy? Hm?");
			convo = 6;
			convo6();
		}
	}
	
	private void convo4() {
		Game.print("Tears pour down the poor guys face. He can't even manage to look at you."
				+ " You'll have to do something to cheer him up. Maybe bring him a cookie?");
		Game.addFlag("sad clerk");
		convo = 11;
	}
	
	private void convo5() {
		String[] options = {
				"I can't think of a single thing less annoying than what you just described.",
				"You know, Bobo. I was actually hoping to find something a little less touristy"
				+ " than what you have on display out here. Maybe you could recommend a shop out"
				+ " on the station's thoroughfare that I could visit instead?"};
		getResponse(options);
	}
	
	private void response5(int options) {
		switch(options) {
		case 1:
			say("How about one of our best-selling plush collectible Snowy Egrets? What better"
					+ " way to commemorate your stay with us then one of these adorable and"
					+ " cuddly friends?");
			convo = 7;
			convo7();
			break;
		case 2:
			Game.print("The clerk gasps in horror.");
			say("A shop out on the station's...thoroughfare!? Thieves! All of them. Thieves!"
					+ " They'll take all your hard earned cash and sell you...uh...stuff that"
					+ "...well, that someone like you wouldn't like at all. No, no. You want"
					+ " nothing to do with those places.");
			Game.print("The clerk composes himself and then leans closer to you.");
			say("Now. I may have something. But I need to know...how much are you looking to spend?");
			convo = 6;
			convo6();
		}
	}
	
	private void convo6() {
		String[] options = {
				"As little as possible.",
				"Everything I've got!",
				"What are we talking about here?"};
		getResponse(options);
	}
	
	private void response6(int option) {
		switch(option) {
			case 1:
				say("That's too bad. I might have had something you'd be interested in. You know,"
						+ " something a little \"back room\" if you take my meaning. But it's not"
						+ " for the frugal. Sorry I couldn't help you. Good day.");
				convo = 11;
				break;
			case 2:
				Game.print("The clerk's smile widens.");
				say("Excellent! In that case, I've got just the thing. Wait here and I'll go fetch"
						+ " it.");
				convo = 9;
				convo9();
				break;
			case 3:
				say("I've come into posession of a...er...exotic item.");
				Game.player.say("Exotic item? What is an exotic item?");
				say("I'm not sure of its origin or what it's actually for, but it looks exotic."
						+ " A very unique item, I assure you.");
				Game.player.say("Well, what is it?");
				say("A glowy orb thing. It's not a gift shop item. I'd actually be selling this to"
						+ " you myself. If you're willing to make a worthy offer that is.");
				convo = 10;
				convo10();
		}
	}
	
	private void convo7() {
		String[] options = {
				"Sadly, I'm alergic to plush. And adorable. Can't stand adorable.",
				"Look, Bobo. If you don't have anything worth buying, I'll just go look elsewhere."};
		getResponse(options);
	}
	
	private void response7(int option) {
		switch(option) {
		case 1:
			say("Aha! I've got it now. Now that we've gotten to know each other a bit better,"
					+ " I know exactly what you're looking for!");
			Game.player.say("You do?");
			say("Yes. Two words: Glass. Figurine. I'm right, aren't I?");
			convo = 8;
			convo8();
			break;
		case 2:
			say("No, no! I'm sure I can find something to suit you. I know I have the perfect"
					+ " gift for that perfect...er...who is the gift for?");
			Game.player.say("My wife, Shelly");
			say("Ah, dear Sally!");
			Game.player.say("Shelly.");
			say("Dear Shelly! Of course. Um, so...er...I don't suppose she's into glass figurines...?");
			Game.player.say("No.");
			say("No, of course not! Such a silly question. Um, actually, there might be something."
					+ " How much might you be willing to spend on dear Shelly?");
			convo = 6;
			convo6();
		}
	}
	
	private void convo8() {
		String[] options = {
				"You are not right.",
				"Nope. That's it. I'm outta here. You suck at your job, Bobo."};
		getResponse(options);
	}
	
	private void response8(int option) {
		switch(option) {
		case 1:
			say("Hm. Tough case, this. Very tough case.");
			Game.player.say("No problem, I'll just go...");
			say("No! Wait! I've got it! But...um...how much are you willing to spend for something"
					+ " a little...er...outside the normal gift shop fare, eh?");
			convo = 6;
			convo6();
			break;
		case 2:
			say("Weird glowy orb thing!");
			Game.player.say("What?");
			say("Weird glowy orb thing! I have one! Do you want it?");
			Game.player.say("What the hell is a weird glowy orb thing?");
			say("Wait here, I have it in back. Let me just go get it.");
			convo = 9;
			convo9();
		}
	}
	
	private void convo9() {
		Game.print("The clerk vanishes into a back room you didn't know was there and returns"
				+ " a few minutes later with a weird glowy orb thing.");
		say("Here it is! Magnificent, am I right? Just give me your paycard and it's yours!");
		convo = 11;
	}
	
	private void convo10() {
		String[] options = {
				"Sounds cool. I have 350 on my paycard. Will that do?",
				"I'll give you 50 for it. Final offer for your glowy thing.",
				"Sorry, dude. I'm not buying a weird orb thing from some kid working in a gift shop."
		};
		getResponse(options);
	}
	
	private void response10(int option) {
		switch(option) {
		case 1:
			say("I was looking for 500, but you know what? I'm willing to make a deal. I just know"
					+ " the orb was meant for you. Wait here and I'll go fetch it.");
			convo = 9;
			convo9();
			break;
		case 2:
			say("That's a joke, I assume? I don't think you appreciate the value of unique"
					+ " exotic items. Perhaps you're not the sophisticated customer I took you"
					+ " for. Oh well. Good day to you.");
			convo = 11;
			break;
		case 3:
			say("You're loss. Come back when you change your mind.");
			convo = 11;
		}
	}
	
}
