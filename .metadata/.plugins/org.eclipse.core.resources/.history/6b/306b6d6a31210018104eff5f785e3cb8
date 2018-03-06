
public class BlackJack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(blackjack(21,21));
	
	}
	public static String blackjack(int numberOne, int numberTwo) {
		if(numberOne == numberTwo) {
			return "draw";
		}
		if( numberOne > 21 && numberTwo > 21) {
			return "Bust";
		} else {
			if( (numberOne > numberTwo && numberOne<22) || numberTwo >21) {
				return "player 1 wins";
			} else {
				return "player 2 wins";
			}
		}
	}
}
