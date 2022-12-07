package exercise3;

public class CardTest {

	public static void main(String[] args) {

		Card user = new Card();
		Card computer = new Card();
		user.suit = Card.suitGenerate();
		

		System.out.print("User:" + user.suit+" ,(");
		Card.userIndex = changeIndex(user.suit);
		user.number = Card.numberGenerate();

		System.out.println(user.number+") ");

		computer.suit = Card.suitGenerate();

		System.out.print("Computer :" + computer.suit+" ,(");
		Card.computerIndex = changeIndex(computer.suit);

		computer.number = Card.numberGenerate();
		System.out.println(computer.number+")");
	
		System.out.println(Card.playCard(user, computer));

	}

	public static int changeIndex(String suit) {
		int index = 0;

		switch (suit) {
		case ("Club"):
			index = 0;
			break;
		case ("Heart"):
			index = 1;
			break;
		case ("Diamond"):
			index = 2;
			break;
		case ("Spade"):
			index = 3;
		}

		return index;
	}

}
