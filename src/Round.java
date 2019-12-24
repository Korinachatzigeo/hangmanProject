import java.util.ArrayList;
import java.util.Scanner;

public class Round {

	Word w;

	public Round() {
		w = new Word();

		int index = randomword(1, 10);                                     //dialekse enan tixaio aritmo apo to 1 mexri to 10
		int counter=w.lenght(index);                                       //o counter xrisimeuei gia na metrw posa grammata thelw akoma apo tin leksi
		int prospathies = w.guesses(w.lenght(index));                      //poses prospathies exeis akoma
		String ileksi = w.getWord(index);                                  //i leksi grammeni
		char guess;                                                        //voithitiki metavliti gia na apothikeuw ti mou dinei o xristis
		String test;                                                       //i metavliti auti einai to guess po metatrepete se string
		
		Scanner scan = new Scanner(System.in);

		ArrayList<Character> cArray = new ArrayList<Character>();           // pinakas pou apothikeuw ena ena ta char
		int wordslength = 0;                                                //arxikopisi metavlitis
		wordslength = ileksi.length();                                      //vale stin metavliti to egethos tis leksis
		for (int i = 0; i < wordslength; i++) {                             //osa ta grammata tis leksis vale "-" ston pinaka
			cArray.add('-');
		}

		while (true) {
			if(counter==0) break;                                           //se periptosi pou vreis ola ta grammata vges apo to loop
			if (prospathies < 0) {                                          //an den exeis alles prospathies xaneis
				System.out.println("I am sorry but you lost");
				break;
			}
			
			System.out.print("The random word is now");                     //i tuxaia leksi einai
			System.out.println(cArray);
			//System.out.println("." + ileksi + ".");                       //an thelete paralila na blepete tin leksi afereste autin tin grami kodika apo to sxolio
			System.out.println("You have" + prospathies + " attempts left");//poses prospathies exeis
			prospathies--;
			System.out.println("Your guess?");                               //Dwse tin mandepsia sou
			guess = scan.next().charAt(0);                                   // pare ena mono char
			if (Character.isDigit(guess)) {
				System.out.println("You can only guess letters not numbers, try again ");
			}                                                                // des an einai arithmos kai mine sto loop
			test = Character.toString(guess);                                // kane to char string (auto to kanw giati mono etsi brika pws tha kanw elenxous)
			
			int position = w.getWord(index).toLowerCase().indexOf(test.toLowerCase());       // vres tin thesi
			if(position<0){
				System.out.println("The is no "+guess+" in the word");        //to indexOf an den brei kati epistrefei -1, ara an to position einai arnitiko den exei bre kati
			}else																
			{	
				counter--;                                                     //brikes ena gramma
				cArray.remove(position);									   //vgale mia thesi gia na								
			    cArray.add(position, guess);                                   //baleis meta mia thesi ston pinaka
			
			//System.out.println(cArray);                                        //tupose ton pinaka 
			//System.out.println(position + 1);
			if (counter==0){ System.out.println(cArray); System.out.println("You won the game!!");}} //an den exoun minei alles theseis kerdises
		}
		
	}

	public int randomword(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

}
