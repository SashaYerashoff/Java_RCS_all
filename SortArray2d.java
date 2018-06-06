import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray2d {

	public static void main(String[] args) {
		
		// 1) cik masîvus uzìenerçt?  (no 10 lîdz 20)
		// 2) Masîva izmçri [i] [n] kur n no 10-50 (random)
		// 3) Uztaisît 2d array un aizpildît ar random no 100-999
		// 4) Sakartot [n] dilstoði
		// 5) summ(n)
		// 6) sort [i] augoði
		// 7) Izvadam Lielâko [i][n] 
		
		System.out.print("Ievadi, cik masîvu vçlies izvedot: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int borderA = new Random().nextInt(21) + 5;
		int borderB = new Random().nextInt(900) + 100;
		System.out.println();
		
		while (input < 10 || input > 20) {
			System.out.println("Tu ievadîji vai nu pa maz, vai nu pa daudz. Mçgini vçlreiz (no 20 lîdz 40): ");
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
		int cikli = arr.length; // Nosakam cik for cikli bûs nepiecieðami
		boolean rerun = true;   // Ja masîvs nav sakartots, rerun = true
		
		while (rerun) {
			int count = 0;      // Cik reizes arr[i] tika apmainîts vietâm ar arr[i+1]
			
			for (int i = 0; i< cikli-1; i++) { 
	
				if (arr[i] > arr[i+1]) {
					int value = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = value;
					count++; 
				}
				
				if (count > 0) {
					rerun = true;    //kamçr bija kaut viena operâcija ar masîvu, tikmçr ies while ciklâ
				} else {
					rerun = false;   //Ja operâcijas nav veiktas, tad masîvs ir sakartots
				}
			}
		}//while
		return arr;
	}
	
	static void simpleSortDesc (int arr[]) 
	{
		int cikli = arr.length; // Nosakam cik for cikli bûs nepiecieðami
		boolean rerun = true;   // Ja masîvs nav sakartots, rerun = true
		
		while (rerun) {
			int count = 0;      // Cik reizes arr[i] tika apmainîts vietâm ar arr[i+1]
			
			for (int i = 0; i< cikli-1; i++) { 
	
				if (arr[i] < arr[i+1]) {
					int value = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = value;
					count++; 
				}
				
				if (count > 0) {
					rerun = true;    //kamçr bija kaut viena operâcija ar masîvu, tikmçr ies while ciklâ
				} else {
					rerun = false;   //Ja operâcijas nav veiktas, tad masîvs ir sakartots
				}
			}
		}//while
		
	}	

}
