import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO SNAKES AND LADDERS ");
		System.out.println(" ");

		
		List<players> thePlayers = new ArrayList<>(); //create array list for players
		System.out.println("how many players are playing (2-4 players allowed) ?");
		
		Scanner scan = new Scanner(System.in); //create an input for players to type in the number of players playing
		int numOfPlayers = scan.nextInt();
		while (numOfPlayers > 4 || numOfPlayers < 2) {
			System.out.println("input invalid, make sure 2-4 players are entered");
			numOfPlayers = scan.nextInt();
		}
		System.out.println("Type a name to represent your player");
		for(int i = 1; i<numOfPlayers+1; ++i) { //scroll through the number of players
			System.out.println("Enter name for player " + i);
			String name = scan.next();
			players Player = new players(name);
			thePlayers.add(Player);
			
			}
		
		
			Board board = new Board(); 
			Dice dice = new Dice(); // dead code
		//loop so it goes through each player
			
			System.out.println("Lets Play!");
			int counter = 0;
			
			do {
				players currPlayer = thePlayers.get(counter);
				board.movePlayer(currPlayer);
				counter++;
				if (counter == numOfPlayers) {
					counter = 0;
				}
				if (numOfPlayers == 1) {
					System.exit(numOfPlayers);
				}
			}while(counter < numOfPlayers);
	
			
			//Code sometimes crashes due to index outofbounds exception, incorporate try and catch 
				

	}
}


