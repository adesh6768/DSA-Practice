package array2d;

import java.util.Scanner;

public class array2ddemo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Rows : ");
		int rows=scn.nextInt();
		System.out.print("Cols : ");
		int cols=scn.nextInt();
		//Declaration
		int[][]arr=new int[rows][cols];
		//For Input
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr [i][j]=scn.nextInt();
			}
		}
		// For Output
		for(int i=0;i<rows;i++) {//rows/cols=arr.length
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}