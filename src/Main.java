
import java.util.Scanner;
public class Main {
	/*To programma auto einai to gnosto paixnidi kremala*/
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		String text;
		System.out.println("Welcome to Hangman game!");
		while(true){
		System.out.println("MAIN MENU \n -start new Game(s) \n -Exit(e)\n Please enter your choice");
		text = scan.nextLine();
		if(text.equals("s")|| text.equals("S")){
		 new Round();
		}
		else if (text.equals("e")||(text.equals("E"))){
		System.out.println("bye, bye see you soon");
			break;	
		}
		
		}
	scan.close();
	}

}
