
public class Board {

	private String [][] boardArr = {
			{"X", " ", " "},
			{" ", "X", " "},
			{" ", " ", " "}};
	


	public void printBoard() {
		
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print("|" + boardArr[i][j] + "|");
			}
			System.out.println();
		}
	}
	
	public boolean isAvalaible(int i, int j) {
		System.out.println(boardArr[i][j]);
		if ("X".equals( boardArr [i][j]) || "O".equals( boardArr [i][j])) {
			
			return false;
		} else {
			return true;
		}
		
	}
	
	public void addMove(int i, int j, String theMove) {
		
			boardArr[i][j] = theMove;
		
		}
	
	public boolean isItWin(String param ) {
		boolean result = false;
		for (int i=0; i <3; i++) {
			if (boardArr[i][0].equals(param) && boardArr[i][1].equals(param) && boardArr[i][2].equals(param)){
				result = true;
			} else if (boardArr[0][i].equals(param) && boardArr[1][i].equals(param) && boardArr[2][i].equals(param)) {
				result = true;
			} else if (boardArr[0][0].equals(param) && boardArr[1][1].equals(param) && boardArr[2][2].equals(param)) {
				result = true;
			} else if (boardArr[0][2].equals(param) && boardArr[1][1].equals(param) && boardArr[2][0].equals(param)) {
				result = true;
			} 
		}
		return result;
	}
	public boolean isFull() {
		boolean result = true;
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				if (boardArr[i][j].equals(" ")) {
					result = false;
				}
			}
		}
		return result;
	}
	
	public void resetBoard() {
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				boardArr[i][j] = " ";
			}
		}
	}
}
	



