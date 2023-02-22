package items.ch1.resort;

import game.*;

public class Paycard extends Item {
	
	private int balance;

	public Paycard() {
		super("paycard");
		balance = 375;
	}
	
	@Override
	public void look() {
		Game.print("This little device contains an encrypted record of the local currency you"
				+ " have access to. Your current balance is "+balance+" STUs.");
	}
	
	@Override
	public void take(String how) {
		if (Game.player.has("paycard"))
			Game.print("You already have the paycard.");
		else {
			Game.print("Might as well take all your stuff.");
			Game.getCurrentRoom().getItem("stuff").take(how);
		}
	}
	
	@Override
	public void use() {
		Game.print("What are you planning to buy? Either give the paycard to a person or insert it into a pay slot.");
	}
	
	public int balance() {
		return balance;
	}
	
	public void increase(int thisMuch) {
		balance += thisMuch;
	}
	
	public void decrease(int thisMuch) {
		balance -= thisMuch;
	}
	
}
