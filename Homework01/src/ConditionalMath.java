import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sveiks! Esmu Java programma. Ievadi lūdzu savu vārdu: ");
		String name = scanner.next();
		
		System.out.print("Tagad ievadi veselo skaitli a: ");
		int a = scanner.nextInt();
		
		System.out.print("Tagad ievadi veselo skaitli b: ");
		int b= scanner.nextInt();
		scanner.close();
		
		if(a > b) {
			System.out.println("skaitlis "+a+" ir lielāks par skaitli " +b);
		}
		else {
			if (a<b) {
				System.out.println("skaitlis "+a+" ir mazāks par skaitli " +b);	
			}
			else {
				System.out.println("skaitlis "+a+" ir vienāds ar skaitli " +b);	
			}
		}
		int c = a+b;
		int nameLength = name.length();
		
		if (c > nameLength) {
			System.out.println("Tavs vārds ("+ nameLength + ") ir īsāks par " +a+ " un " +b+ " summu"+ "("+c+")");
		}
		else {
			if (c < nameLength) {
				System.out.println("Tavs vārds ir garāks par " +a+ " un " +b+ " summu" + "("+c+")");
			}
			else {
				System.out.println("Tavs vārds ir vienāds ar " +a+ " un " +b+ " summu" + "("+c+")");
			}
		}
			
	}

}
