package items.ch1.resort;

import game.*;
//import items.ch1.resort.*;

public class Viewscreen extends Item {

	private int view;

	public Viewscreen() {
		super("viewscreen");
		view = 0;
	}

	@Override
	public void look() {
		Game.print("A giant viewscreen dominates the Observation Lounge's wall, serving the purpose"
				+ " of a window. Its view changes every once in a while.");
		switch (view) {
		case 0:
			Game.print("Currently, the huge viewscreen is showing the pocked surface of Rubicon Beta,"
					+ " the moon around which Romanicus Station orbits. You can spot a few biodomes down there."
					+ " You never understood why some people feel compelled to live on barren moons with"
					+ " no atmosphere and little gravity. Space stations are way cooler.");
			break;
		case 1:
			Game.print("Now you can see the cloud-covered planet of Rubicon, along with one of its three"
					+ " moons. You hear one of the guests point out that the yellowish tint of the moon"
					+ " identifies it as Rubicon Alpha, which apparently has a slight but toxic"
					+ " atmosphere.");
			break;
		case 2:
			Game.print("Somehow, the screen is now showing Rubicon Station itself. The view is a little"
					+ " disorienting since you're standing on Rubicon Station, but whatever. Technology"
					+ " and all that. You'll just roll with it. It must be a current view because you"
					+ " can see the bulbous bulk of the Fussilade attached to one of the docking ports."
					+ " (You think this because you fail to notice the words \"12 Hour Delay\" in the"
					+ " lower-right corner of the viewscreen. Oops. Should I have told you that?)");
			Game.print("In any case, you've enjoyed your visit to the Observation Lounge and can cross"
					+ " that item off your itinerary!");
			((Itinerary)Game.player.getItem("itinerary")).update(2);
			break;
		default:
			Game.print("You've stared at the enormous viewscreen long enough. You have other things to do.");
		}
		view++;
	}
	
	@Override
	public void use() {
		Game.print("Just look at the viewscreen.");
	}

	@Override
	public void uniqueCommand(String command) {
		if (command.equals("watch"))
			look();
		else
			super.uniqueCommand(command);
	}
	
}
