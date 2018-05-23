import java.util.Scanner; //importējam scanner 

public class GreetingsInteractive {

	public static void main(String[] args) {
		//HW01 Task02 - saņemt vārdu un vecumu no lietotāja. izvadīt saņemto ievadu
		
		Scanner scanner = new Scanner(System.in); //dejinējam objektu
		
		System.out.print("Sveiks! Esmu Java programma. Ievadi lūdzu savu vārdu: ");
		String name = scanner.next();
		
		System.out.print("Tagad ievadi savu vecumu: ");
		int age = scanner.nextInt();
		
		System.out.print("Sveiki, mani sauc " + name + ", esmu " + age + " gadus jauns/a!");

	}

}
