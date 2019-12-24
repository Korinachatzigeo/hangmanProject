

public class Word {

	public Word() {
		super();
	}

	public String getWord(int index) {
		switch (index) {
		case 0:
			return "NOTHING";
		case 1:
			return "HORSE";
		case 2:
			return "CAT";
		case 3:
			return "JAVA";
		case 5:
			return "COMPUTER";
		case 6:
			return "WATER";
		case 7:
			return "LIGHT";
		case 8:
			return "MONEY";
		case 9:
			return "HONEY";
		case 10:
			return "TEN";
		default:
			return "Illegal index";
		}
	}

	public int lenght(int index) {
		String word = getWord(index);
		int wordslength = 0;
		wordslength = word.length();
		return wordslength;
	}

	public int guesses(int metavliti) {
		int mandepsies = (metavliti * metavliti);
		return mandepsies;
	}

}
