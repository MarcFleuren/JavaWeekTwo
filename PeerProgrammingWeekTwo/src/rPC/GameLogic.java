package rPC;

public class GameLogic {

	public static String findWinner(String player, String AI) {
		
		if(player.equals("rock")) {
			switch (AI) {
			
			case "rock" : return "draw";
			
			case "scissors" : return "win";
			
			case "paper" : return "lose and loooseooo";
			
			}
		}
		if(player.equals("scissors")) {
			switch (AI) {
			
			case "rock" : return "lose";
			
			case "scissors" : return "draw";
			
			case "paper" : return "win";
			
			}
		}
		if(player.equals("paper")) {
			switch (AI) {
			
			case "rock" : return "win";
			
			case "scissors" : return "lose";
			
			case "paper" : return "draw";
			
			}
		}
		
		
		
		return "Enter valid move";
		
	}


 public static String aiInput() {
	 
	 int selector = (int) (Math.random()*10);
	 
	 switch (selector) {
	 case 0 : return "rock";
	 case 1 : return "rock";
	 case 2 : return "scissors";
	 case 3 : return "paper";
	 case 4 : return "rock";
	 case 5 : return "scissors";
	 case 6 : return "paper";
	 case 7 : return "rock";
	 case 8 : return "scissors";
	 case 9 : return "paper";
	 case 10 : return "paper";
	 
	 }
	 
	 return null;
	 
 }




}
