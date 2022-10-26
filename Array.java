package Lab01;

import java.util.Arrays;

public class Array {
	
	public static void main(String[] args) {
		
		int[] myNum = {1789, 2035, 1899, 1456, 2013};
		
		int Sum = 0;
		
		float Average;
		
		System.out.print("The original array is: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(myNum[i] + " ");
		}
		
		Arrays.sort(myNum);
		
		System.out.print("\nThe sorted array is: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.print(myNum[i] + " ");
		}
		
		for(int i = 0; i < 5; i++) {
			Sum += myNum[i];
		}
		
		System.out.print("\nThe sum of array is: " + Sum);
		
		Average = (float)Sum / 5;
		
		System.out.print("\nThe average value of array is: " + Average);
	}
	
}
