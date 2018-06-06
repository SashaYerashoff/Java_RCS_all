import java.util.Random;

public class ComputerPlayer implements Player{
	
Random random = new Random();

	@Override
	public int[] makeMove() {
		int [] result = new int[2];
		 result[0] = random.nextInt(3);
		 result[1] = random.nextInt(3);
		 
		
		return result;
	}

}
