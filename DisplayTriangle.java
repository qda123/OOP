package Lab01;

import java.util.Scanner;

public class DisplayTriangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please input the size of triangle: ");
		int n = keyboard.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
            for (int j = 1; j <= n-i; j++) {
            	System.out.print(" ");
            }
            
            for (int j = 1; j <= i-1; j++) {
            	System.out.print("*");
            }
            
            System.out.print("*");
            
            for (int j = 1; j <= i-1; j++) {
            	System.out.print("*");
            }
            
            for (int j = 1; j <= n-i+1; j++) {
            	System.out.print(" ");
            }
            
            System.out.print("\n");
            
        }
		
		System.exit(0);
		
	}
	
}