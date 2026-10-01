package array2d;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int [][]arr=new int [n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		int value=scn.nextInt();
		System.out.println(search(arr,value));
	}
	public static int search(int [][]arr, int value) {
		int row=0;
		int col=arr.length-1;
		while(row<arr.length&& col>=0) {
			if(arr[row][col]<value) {
				row++;
			}
			else if(arr[row][col]>value) {
				col--;
			}
			else  {
				return 1;
			}
		}
		return 0;
	}
}