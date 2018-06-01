//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// 0) papras�t ievad�t mas�va robe�as no 20 l�dz 40
		// 1) izveidot mas�vu nor�d�t�s robe��s
		// 2) aizpild�t ar random int no 10 l�dz 99
		// 3) izvad�t mas�va elementus. Formats: *, *, *...
		// 4) Sakartot mas�vu augo�� sec�b�
		// 5) Izvad�t sakartoto mas�vu. 
		
	//0):
		System.out.print("Ievadi, cik garu mas�vu v�lies izveidot (no 20 l�dz 40): ");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println();
		
		while (input < 20 || input > 40) {
			System.out.println("Tu ievad�ji vai nu pa maz, vai nu pa daudz. M�gini v�lreiz (no 20 l�dz 40): ");
			input = scan.nextInt();
			System.out.println();
			
		}
		scan.close();
		System.out.print("Success! Your array looks like this: ");
		
	//1, 2, 3):
		int[] userArr = new int[input];
		
		for (int i = 0; i < input; i++) {
			userArr[i] = new Random().nextInt(89) + 10;
			System.out.print(userArr[i] + ", ");	
		} 
		System.out.println();
		
	//4.2, 5):
		simpleSortAsc(userArr);  //izmantojam m�su zem�k aprakst�to metodi izveidotam mas�vam
		System.out.print("Your ascendantly sorted array:       ");
		//Arrays.sort(userArr);  //un ��di diem��l nedr�kst p�c nosac�jumiem
		for (int i=0; i < input; i++ ) {	
		System.out.print(userArr[i]+ ", ");
		}
		
		
	}
	
	//4.1):
	//sorted ascending array
	static void simpleSortAsc (int arr[]) 
	{
		int cikli = arr.length; // Nosakam cik for cikli b�s nepiecie�ami
		boolean rerun = true;   // Ja mas�vs nav sakartots, rerun = true
		int iter = 0;           // Cik kop� while cikli ir biju�i nepiecie�ami
		
		while (rerun) {
			int count = 0;      // Cik reizes arr[i] tika apmain�ts viet�m ar arr[i+1]
			
			iter++;
			
			for (int i = 0; i< cikli-1; i++) { 
	
				if (arr[i] > arr[i+1]) {
					int value = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = value;
					count++; 
					
				}
				
				if (count > 0) {
					rerun = true;    //kam�r bija kaut viena oper�cija ar mas�vu, tikm�r ies while cikl�
					
				} else {
					rerun = false;   //Ja oper�cijas nav veiktas, tad mas�vs ir sakartots
				}
			}
		}//while
		System.out.println("  Walkthrough: " + iter + "   Efficiency: " + (cikli - iter) + " ");
	}	
}
