import java.util.Scanner;
/**
 * @author timxu
 * This class contains the storyboard for chapter 2.
 * 
 */
public class Chapter2 {
	public Chapter2(){
		System.out.println("\nChapter 2. The Underground Labryinth.");
		System.out.println("You climb through the tunnel, only for it to lead into a wide open space. It is almost pitch black around you."
				+ "\nYou see a glimmer in the distance. The tunnel leads into a cave, dimly lit by limestone. It looks like someone's bedroom, if they put"
				+ " it into a cave. You hear steps coming in the distance.");
		System.out.println("Do you:\n1) Hide\t2) Stay out in the open and confront the person");
		String result = Launcher.read();
		if (result.equals(1)){
			
		}
		else if (result.equals(2)){
			
		}
		System.out.println("Sorry, there is no more left to play so far. Stay tuned for updates.");
		Launcher.playAgain();
	}
}
