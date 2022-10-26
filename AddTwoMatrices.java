package Lab01;

import java.util.Arrays;

public class AddTwoMatrices {

	public static void main(String[] args) {
		
		int[][] matrix1 = { { 3, 2, 1 },
							{ 9, 11, 5 },
							{ 6, 10, 13 } };
		
		int[][] matrix2 = { { 11, 5, 4 },
							{ 20, 13, 17 },
							{ 21, 14, 15 } };
		
		int[][] matrix3 = new int[3][3];
		
		System.out.print("The first matrix is:\n");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		System.out.print("\nThe second matrix is:\n");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		System.out.print("\nThe add of two matrices is:\n");
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}