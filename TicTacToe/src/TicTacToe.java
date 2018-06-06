import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		Player player = new HumanPlayer();
		Player player2 = new ComputerPlayer();
		
		System.out.println("please select your side:" );
		String turn = "X";
		boolean repeatMove = true;
		
		int count=2;
		while (repeatMove) {
			int[] movePosition;
			if (count %2 == 0) {
			movePosition = player2.makeMove();
		turn = "X";
			} else {
				movePosition = player.makeMove();
				turn = "O";
			}
		if (board.isAvalaible(movePosition[0], movePosition[1])) {
			board.addMove(movePosition[0], movePosition[1], turn);
			board.printBoard();	
		 } //else {
			 //System.out.println("This place is already token");
			 //board.addMove(movePosition[0], movePosition[1], turn);
			// board.printBoard();	
		 //}
		 if (board.isItWin(turn) && repeatMove) {
			System.out.println("A-a-nd the winner is " + turn + "!");
			
			System.out.print("Want to replay? (y/n): ");
			String yn = scan.nextLine();
			if (yn.equals("n")) {
				repeatMove = false;
			} else {
				repeatMove = true;
				board.resetBoard();
			}
		 }
		 if (board.isFull() && repeatMove) {
			System.out.println("No winner detected");
		 	//System.out.print("Want to replay? (y/n)");
		 	//String yn = scan.nextLine();
			//if (yn.equals("n")) {
			//	repeatMove = false;
			//} else {
				repeatMove = true;
				//board.resetBoard();
			}
		 count++;
		}
	scan.close();	
	}

}
