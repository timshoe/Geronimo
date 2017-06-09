import java.util.Scanner;
/**
 * 
 * @author timxu
 * This contains the static methods that 
 *
 */
public class Launcher {
	public static void launch(){
		System.out.println("WELCOME TO ...");
		System.out.println("_________________________________________________________");
		System.out.println("G\tE\tR\tO\tN\tI\tM\tO");
		System.out.println("_________________________________________________________\n");
		System.out.println("Enter the number of the chapter you are currently on:"
				+ "\n\nChapter 1\tChapter 2\tChapter 3\n"
				+ "\nIf you have died, you can continue where you have left off..");
		Scanner scan = new Scanner(System.in);
		while (true){
			String result = scan.nextLine();
			if (result.equals("")){
				System.out.println("Error. Invalid Input.");
			}
			else{
				result = result.substring(0,1);
				switch(result){
					    case "1": Chapter1 chapter = new Chapter1();
								break;
						case "2":	Chapter2 chapter2 = new Chapter2();
								break;
						case "3": Chapter3 chapter3 = new Chapter3();
								break;
						default:System.out.println("Error. Invalid Input.");	
								break;
					}
			}
		}
	}
	
	public static String read(){
		Scanner scan = new Scanner(System.in);
		while(true){
			String s = scan.nextLine();
			if (s.equals("")){
				System.out.println("Error. Invalid input...");
			}
			else{
				s = s.substring(0,1);
				if (s.equals("1")){
					return "a";
				}
				else if(s.equals("2")){
					return "b";
				}
				else{
					System.out.println("Error. Invalid input...");
				}
			}
		}
	}
	
	public static void playAgain(){
		System.out.println("\nPlay again?\n______________\nYes or No");
		Scanner scan = new Scanner(System.in);
		while(true){
			String s = scan.nextLine();
			if (s.equals("")){
				System.out.println("Error. Invalid input.");
			}
			else{
				s = s.toLowerCase();
				if (s.equals("yes")){
					Launcher.deathLaunch();
				}
				else if(s.equals("no")){
					System.exit(0);
				}
				else{
					System.out.println("Error. Invalid input.");
				}
			}
		}
	}
	
	public static void deathLaunch(){
		System.out.println("Continue where you have left off (Enter the number of the chapter you were on)...\n"
				+ "\nChapter 1\tChapter 2\tChapter 3");
		Scanner scan = new Scanner(System.in);
		while (true){
			String result = scan.nextLine();
			if (result.equals("")){
				System.out.println("Error. Inavlid input.");
			}
			else{
				result = result.substring(0,1);
				switch(result){
					    case "1":Chapter1 chapter = new Chapter1();
								 break;
						case "2":Chapter2 chapter2 = new Chapter2();
								 break;
						case "3":Chapter3 chapter3 = new Chapter3();
								 break;
						default: System.out.println("Error. Invalid Input.");	
								 break;
				}
			}
		}
	}
}
