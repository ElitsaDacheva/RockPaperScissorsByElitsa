import java.util.Random;
import java.util.Scanner;

	public class RockPaperScissorsByElitsa {
		private static final String Rock = "Rock";
		private static final String Paper = "Paper";
		private static final String Scissors = "Scissors";

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Choose [r]ock , [p]aper , [s]cissors: ");

			String playerMove = scanner.nextLine();
			if (playerMove.equals("r") || playerMove.equals("rock")) {
				playerMove = "Rock";
			} else if (playerMove.equals("p") || playerMove.equals("paper")) {
				playerMove = "Paper";
			} else if (playerMove.equals("s") || playerMove.equals("scissors")) {
				playerMove = "Scissors";
			} else {
				System.out.println("Invalid input. Try again!");
				return;
			}

			Random random = new Random();
			int computerRandom = random.nextInt(4);
			String computerMove = "";
			switch (computerRandom) {
				case 1:
					computerMove = "Rock";
					break;
				case 2:
					computerMove = "Paper";
					break;
				case 3:
					computerMove = "Scissors";
					break;
			}
			System.out.printf("The computer choose %s.%n", computerMove);

			if (playerMove.equals("Rock") && computerMove.equals("Scissors") ||
					playerMove.equals("Paper") && computerMove.equals("Rock") ||
					playerMove.equals("Scissors") && computerMove.equals("Paper")) {
				System.out.println("You win!");
			} else if (playerMove.equals("Rock") && computerMove.equals("Paper") ||
					playerMove.equals("Paper") && computerMove.equals("Scissors") ||
					playerMove.equals("Scissors") && computerMove.equals("Rock")) {
				System.out.println("You lose!");
			} else {
				System.out.println("This game is draw!");
			}
		}
	}
