package exercise3;

import java.util.Random;

public class Card {
	public static final String[] SUIT = { "Club", "Heart", "Diamond", "Spade" };
	int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K };
	public static final int J = 11, Q = 12, K = 13;
	public static int userIndex,computerIndex;

	public static int index;
	String suit1;
	static String suit;
	int number;

	public Card() {
		super();

	}

	static Random r = new Random();
	
	public static int numberGenerate() {

		int c= r.nextInt(13) + 1;
		switch(c){
		case(11):System.out.print("J->");break;
		case(12):System.out.print("Q->");break;
		case(13):System.out.print("K->");
	
		}
		return c;
	}

	public static String suitGenerate() {

		int a = r.nextInt(4) + 0;
		

		switch (a) {
		case 0:
			suit = SUIT[0];
			break;
		case 1:
			suit = SUIT[1];
			break;
		case 2:
			suit = SUIT[2];
			break;
		case 3:
			suit = SUIT[3];
		}
		return suit;

	}

	public static String playCard(Card user, Card computer) {
     String output=null;
		
		if (userIndex != computerIndex) {

			if (userIndex >computerIndex) {
				output= "The  user is winner.";

			} else
				output="The computer is winner.";

		} else if (userIndex == computerIndex) {
			if (user.number > computer.number)
				output="The user is winner.";
			else if (user.number < computer.number)
				output="The computer is winner";
			else
				output="This game is not decided";
		}
		return output;
		
		

	}

	@Override
	public String toString() {
		return "Card [suit1=" + suit1 + ", number=" + number + "]";
	}

}
