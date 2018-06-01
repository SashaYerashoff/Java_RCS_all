import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray2d {

	public static void main(String[] args) {
		
		// 1) cik mas�vus uz�ener�t?  (no 10 l�dz 20)
		// 2) Mas�va izm�ri [i] [n] kur n no 10-50 (random)
		// 3) Uztais�t 2d array un aizpild�t ar random no 100-999
		// 4) Sakartot [n] dilsto�i
		// 5) summ(n)
		// 6) sort [i] augo�i
		// 7) Izvadam Liel�ko [i][n] 
		
		System.out.print("Ievadi, cik mas�vu v�lies izvedot: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int borderA = new Random().nextInt(21) + 5;
		int borderB = new Random().nextInt(900) + 100;
		System.out.println();
		
		while (input < 10 || input > 20) {
			System.out.println("Tu ievad�ji vai nu pa maz, vai nu pa daudz. M�gini v�lreiz (no 20 l�dz 40): ");
			input = scan.nextInt();
			System.out.println();
		}
		scan.close();
		
		int[][] userArr = new int[input][borderA];
		
		for (int i = 0; i < input; i++) {
			 //borderA = new Random().nextInt(40) + 10;
			 
			for (int j = 0; j < borderA; j++) {
				borderB = new Random().nextInt(900) + 100;
				userArr[i][j] = new Random().nextInt(borderB);
				//System.out.print(userArr[j] + ", ");	
			}
		}
		
		for (int i = 0; i < input; i++ ) {
			int size = userArr[i].length;
			int[] swapArr = new int[size];
			swapArr = userArr[i];
			simpleSortDesc(swapArr);
			userArr[i] = swapArr;
		}
		
		int[] sumArr = new int[input +1];
		
		for (int i = 0; i < input; i++) {
			int border = userArr[i].length;
			
			int summJ = 0;
			for (int j=0; j<border; j++){
				System.out.print(userArr[i][j]+ ", ");
				summJ = userArr[i][j] + summJ;  
				
			}
			sumArr[i] = summJ;
			System.out.print(" [" + sumArr[i] +"] ");
			System.out.println();
		}
		int[] swapSumArr = sumArr;
		simpleSortDesc(swapSumArr);
		System.out.print(swapSumArr[0]);
		int someValue = swapSumArr[0];
		System.out.print(" " + someValue);
		int theKey =getIndex(sumArr, someValue);
		System.out.print(" -:" + theKey);
	}
	static int getIndex (int arr[], int value) {
		int size = arr.length;
		System.out.print(size);
		int count=0;
		for (int i = 0; i<size-1; i++ ) {
			//count=i;
			if (value >= arr[i]) {
				count++;				
			}
			
		}
		return count;
	}
	
	static int[] simpleSortAsc (int arr[]) 
	{
		int cikli = arr.length; // Nosakam cik for cikli b�s nepiecie�ami
		boolean rerun = true;   // Ja mas�vs nav sakartots, rerun = true
		
		while (rerun) {
			int count = 0;      // Cik reizes arr[i] tika apmain�ts viet�m ar arr[i+1]
			
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
		return arr;
	}
	
	static void simpleSortDesc (int arr[]) 
	{
		int cikli = arr.length; // Nosakam cik for cikli b�s nepiecie�ami
		boolean rerun = true;   // Ja mas�vs nav sakartots, rerun = true
		
		while (rerun) {
			int count = 0;      // Cik reizes arr[i] tika apmain�ts viet�m ar arr[i+1]
			
			for (int i = 0; i< cikli-1; i++) { 
	
				if (arr[i] < arr[i+1]) {
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
		
	}	

}
