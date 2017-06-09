import java.util.Scanner;
public class Chapter1 {
	public Chapter1(){
		System.out.println("\nChapter 1. The Haunted Castle.\nYou wake up. It's dark and musty. It looks like you are in the dungeon of some large castle."
				+ "\nYou try to remember how you got here, but everything is blank. You look around. "
				+ "There is an omnious smelling door at the edge of the wall and a staircase leading further down.");
		System.out.println("What do you do?\n1) Open the door\t2) Walk down the staircase");
		String result = Launcher.read();
		if (result.equals("a")){
			System.out.println("You open the door. The smell only gets stronger inside... its terrible. You see "
					+ "a shadow in the distance.");
			System.out.println("What do you do?\n1) Approach the shadow\t2) Back away");
			result = Launcher.read();
			if (result.equals("a")){
				System.out.println("The shadow surrounds you. It starts to smell strongly of farts. The temeprature drops to freezing levels."
						+ " You hear... \"GERONIMO!\"\nYou die instantly.");
				Launcher.playAgain();
			}
			else if (result.equals("b")){
				System.out.println("You slowly back away and bump into something in the wall. It's a huge inscription.\n"
						+ "It says \"There was once a man named geronimo. He died and turned into a evil ghost. He haunts this castle.\"");
				System.out.println("Do you:\n1) Look for Geronimo 2) Search for an exit");
				result = Launcher.read();
				if (result.equals("a")){
					System.out.println("You shout \"GERONIMO! I KNOW YOU'RE HERE!\"");
					System.out.println("\"Muahaha. I guess there's no point in beating around the bush huh. I guess there's no point in toying"
							+ " around with you anymore. Time to end it.\"\nIt starts to smell strongly of farts. You DIE INSTANTLY.");
					Launcher.playAgain();
				}
				else if (result.equals("b")){
					System.out.println("You frantically search for an exit. You see a secret tunnel and a ladder. The tunnel is completely dark... "
							+ "who knows how far it could go? \nThe ladder seems interesting. There is a warm light emenating from the top of the ladder, "
							+ "almost as if it led to a room or something. But do you really want to run into someone right now?");
					System.out.println("What do you do?\n1) Tunnel\t2) Ladder");
					result = Launcher.read();
					if (result.equals("a")){
						System.out.println("You slowly climb into the tunnel. It's slimy and dark. You want to turn around but there is literally no space behind "
								+ "you to do so.\n Despite the pitch black darkness you continue to press foward. \n....End of Chapter 1.");
						Chapter2 chapter2 = new Chapter2();
					}
					else if (result.equals("b")){
						System.out.println("You open go up the ladder. Who in their right mind would go through such a creepy tunnel?"
								+ "\nThe thought of it makes you want to vomit. The light gets brighter as you climb into an office. It looks inhabited, but nobody"
								+ " is there...\nThe door clicks behind you. \n\"Muahaha. I guess there's no point in beating around the bush huh. I guess there's no"
								+ " point in toying around with you anymore. Time to end it.\"\nIt starts to smell strongly of farts. You DIE INSTANTLY.");
						Launcher.playAgain();
					}	
				}
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
			else if(result.equals("b")){
				System.out.println("You feel lucky as you open the door, almost as if you avoided imminent death by choosing the other one.\n"
						+ "You are run into a wall with a huge inscription."
						+ " It says \"There was once a man named Geronimo. He died and turned into a evil ghost. He haunts this castle.\"");
				System.out.println("Do you:\n1) Look for Geronimo 2) Search for an exit");
				result = Launcher.read();
				if (result.equals("a")){
					System.out.println("You shout \"GERONIMO! I KNOW YOU'RE HERE!\"");
					System.out.println("\"Muahaha. I guess there's no point in beating around the bush huh. I guess there's no point in toying"
							+ " around with you anymore. Time to end it.\"\nIt starts to smell strongly of farts. You DIE INSTANTLY.");
					Launcher.playAgain();
				}
				else if (result.equals("b")){
					System.out.println("You frantically search for an exit. You see a secret tunnel and a mysterious door. The tunnel is completely dark... "
							+ "who knows how far it could go?"
							+ "\nThe door is omnious looking as well. It is pitch black with a simple layer of golden text on the front saying the letter \"G\".");
					System.out.println("What do you do?\n1) Tunnel\t2) Door");
					result = Launcher.read();
					if (result.equals("a")){
						System.out.println("You slowly climb into the tunnel. It's slimy and dark. You want to turn around but there is literally no space behind "
								+ "you to do so.\n Despite the pitch black darkness you continue to press foward. \n....End of Chapter 1.");
						Chapter2 chapter2 = new Chapter2();
					}
					if (result.equals("b")){
						System.out.println("You open the door. The tunnel seemed too risky after all. Who in their right mind would go through such a creepy thing?"
								+ "\nThe thought of it makes you want to vomit. You step into what seems like an office. It looks inhabited but empty...\n"
								+ "The door clicks behind you. \n\"Muahaha. I guess there's no point in beating around the bush huh. I guess there's no point in toying"
							+ " around with you anymore. Time to end it.\"\nIt starts to smell strongly of farts. You DIE INSTANTLY.");
						Launcher.playAgain();
					}
				}
			}
		}
	}
}
