import java.util.Scanner;

public class Nim {
	public static void main(String[] args) {

		//variable for how many marbles there are
		int pileSize = 100;

		//variables to facilitate user inputs
		Scanner input = new Scanner(System.in);
		int userGuess;

		//variable for whose turn it is
		boolean humanTurn; //true means it is human's turn

		//decide who goes first
		if (Math.random() >= 0.5) {
			humanTurn = true;
		}
			else{
				humanTurn = false;
		}

		//game loop 
		while (pileSize > 1) {
			//report how many marbles left
			System.out.println("Marbles left: " + pileSize);

			if (humanTurn) {
				System.out.print("choose a number: ");
				userGuess = input.nextInt();
				pileSize -= userGuess;
			}
			else {
				pileSize -= Math.random() * (pileSize/2) + 1;
			}

			humanTurn = !humanTurn;
		}
		// repot the winner
		if (humanTurn) {
			System.out.println("Computer wins");
		}
		else {
			System.out.println("Human wins");
		}
	}
}