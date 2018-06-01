//import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		// 0) paprasît ievadît masîva robeþas no 20 lîdz 40
		// 1) izveidot masîvu norâdîtâs robeþâs
		// 2) aizpildît ar random int no 10 lîdz 99
		// 3) izvadît masîva elementus. Formats: *, *, *...
		// 4) Sakartot masîvu augoðâ secîbâ
		// 5) Izvadît sakartoto masîvu. 
		
	//0):
		System.out.print("Ievadi, cik garu masîvu vçlies izveidot (no 20 lîdz 40): ");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println();
		
		while (input < 20 || input > 40) {
			System.out.println("Tu ievadîji vai nu pa maz, vai nu pa daudz. Mçgini vçlreiz (no 20 lîdz 40): ");
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
		simpleSortAsc(userArr);  //izmantojam mûsu zemâk aprakstîto metodi izveidotam masîvam
		System.out.print("Your ascendantly sorted array:       ");
		//Arrays.sort(userArr);  //un ðâdi diemþçl nedrîkst pçc nosacîjumiem
		for (int i=0; i < input; i++ ) {	
		System.out.print(userArr[i]+ ", ");
		}
		
		
	}
	
	//4.1):
	//sorted ascending array
	static void simpleSortAsc (int arr[]) 
	{
		int cikli = arr.length; // Nosakam cik for cikli bûs nepiecieðami
		boolean rerun = true;   // Ja masîvs nav sakartots, rerun = true
		int iter = 0;           // Cik kopâ while cikli ir bijuði nepiecieðami
		
		while (rerun) {
			int count = 0;      // Cik reizes arr[i] tika apmainîts vietâm ar arr[i+1]
			
			iter++;
			
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
		System.out.println("  Walkthrough: " + iter + "   Efficiency: " + (cikli - iter) + " ");
	}	
}
