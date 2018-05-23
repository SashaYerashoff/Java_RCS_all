import java.util.Scanner;

public class Readline {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//
		System.out.print("Ievadi a: ");
		double a = scanner.nextDouble();
		System.out.print("Ievadi b: ");
		double b = scanner.nextDouble();
		double c = 0;
		System.out.print("Ievadi ko darīt (+ - / * ^): ");
		String whatMath = scanner.next();
		
		switch (whatMath){
		
			case "+":
				c=a+b;
				break;
				
			case "-":
				c=a-b;
				break;
				
			case "*":
				c=a*b;
				break;
				
			case "/":
				c=a/b;
				break;
			
			case "^":
				c=a;
				for (int i = 1; i<b; i++) {
					c = c * a;					
				}		
				break;
				
			default:
				//while (whatMath != "+" || whatMath != "-" || whatMath != "*" || whatMath != "/" || whatMath != "^") {
					System.out.print("Something wrong, probably the input is incorrect! ");
					whatMath = scanner.next();
					
				//}
				break;
		}
		scanner.close();
		System.out.println(a + " " + whatMath + " " + b + " = " + c);

	}

}
