import java.util.Scanner;

public class Syntax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ievadi skaitli no 10 līdz -10: ");
		int someNumber = scanner.nextInt();

		if (someNumber > 10) {
			System.out.println("Lielāks par 10");
			someNumber = 10;
		} else  if(someNumber < -100) {
			System.out.println("Mazāks par -100");
			someNumber = -100;
		} else if(someNumber < -10) {
			System.out.println("Mazāks par -10");
			someNumber = -10;
		} else {
			System.out.println("Ir pareizā diapazonā no 10 līdz -10");
		}

		System.out.println("someNumber gala versija: " + someNumber);

	}

}
