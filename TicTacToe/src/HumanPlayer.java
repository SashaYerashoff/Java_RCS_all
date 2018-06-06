import java.util.Scanner;

public class HumanPlayer implements Player{
	
	private Scanner scan = new Scanner(System.in);

	@Override
	public int[] makeMove() {
		
		int rinda = parbaude("Ievadi rindu");
		int kolonna = parbaude("Ievadi kolonnu");
		
		return new int[] {rinda, kolonna};
	}
	private int parbaude(String text) {
		int i;
		do {
			System.out.print(text);	
			i= scan.nextInt()-1;
			if (i <0 || i>2) {
				System.out.print("incorrect value, please repeat input:");	
			}
		} while (i <0 || i>2);
		return i;
	}

}
