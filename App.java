
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		Player player1 = new Player("a");
		Player player2 = new Player("b");
		deck.shuffle();
		
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0 ) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		for(int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			System.out.print("Playera");
			
			player1Card.describe();
			System.out.print("Playerb");
			Card player2Card = player2.flip();
			player2Card.describe();
			System.out.println();
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				
				System.out.println("Playera wins this round ");
			} 
			else if( player2Card.getValue() > player1Card.getValue()) {
				player2.incrementScore();
				System.out.println("Playerb wins this round ");
			}
			else { 
				System.out.println("this round is a draw");
			}
				
			
			System.out.println();
			System.out.printf("Playera score = %d\n", player1.getScore());
			System.out.printf("Playerb score = %d\n", player2.getScore());
			System.out.println();
			}
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Playera wins the whole game");
		}
		else if (player1.getScore() < player2.getScore()) {
			System.out.println("Playerb wins the whole game");
		}
		else {
			System.out.println(" War ends in a draw");
		}
	} 
}
