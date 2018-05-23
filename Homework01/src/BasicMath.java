import java.util.Scanner;

public class BasicMath {

	public static void main(String[] args) {
		// HW01 Task 03 - saņemt no lietotāja a un b, izvadīt + - * / ar ievadītiem cipariem
		Scanner  scanner = new Scanner(System.in);
		
		double c; //rezultāts
		System.out.print("ievadi veselo skaitli a: ");
		int a = scanner.nextInt();
		
		System.out.print("Ievadi decimālo skaitli b: ");
		double b = scanner.nextDouble();
		scanner.close();
		
		c=a+b;
		System.out.println(a +" + "+ b +" = " + c);
		
		c=a-b;
		System.out.println(a +" - "+ b +" = " + c);
		
		c=a*b;
		System.out.println(a +" * "+ b +" = " + c);
		
		c=a/b;
		System.out.println(a +" / "+ b +" = " + c);
		
		
	}

}
