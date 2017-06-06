import java.util.Scanner;
public class Chapter1 {
	public Chapter1(){
		System.out.println("\nChapter 1. The Haunted Castle.\nYou wake up. It's dark and musty. It smells"
				+ " fishy around here. There is an omnious smelling door at the edge of the wall and a staircase downstairs.");
		System.out.println("What do you do?\n1) Open the door\t2) Walk down the staircase");
		String result = Launcher.read();
		if (result.equals("a")){
			System.out.println("You open the door. The smell only gets stronger inside... its terrible. You see "
					+ "a shadow in the distance.");
			System.out.println("What do you do?\n1) Approach the shadow\t2) Back away");
			result = Launcher.read();
			if (result.equals("a")){
				System.out.println("The shadow surrounds you. It starts to smell strongly of farts. The temeprature drops to freezing levels. You hear... \"GERONIMO!\")"
						+ "\nYou die instantly.");
				Launcher.playAgain();
			}
			else if (result.equals("b")){
				System.out.println("You slowly back away and bump into something in the wall. It's a huge inscription.\n"
						+ " It says \"There was once a man named geronimo. He died and turned into a evil ghost. He haunts this castle.\"");
			}
		}
		else if (result.equals("b")){
			System.out.println("You go down the staircase. The temperature sinks with each step you take. "
					+ "You finally hit the bottom of the stairs. Up ahead are two doors.");
			System.out.println("What do you do?\n1) Take the left door\t2) Take the right door");
			result = Launcher.read();
			if (result.equals("a")){
				System.out.println("It gets even colder. It starts to smell strongly of farts.  You hear... \"GERONIMO!\""
						+"\nYou die instantly.");
				Launcher.playAgain();
			}
		}
	}
}
