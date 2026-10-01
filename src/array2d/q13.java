package array2d;

import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("The Size of Array : ");
		int N=scn.nextInt();
		int[][]arr=new int[N][N];
		
		//input
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=scn.nextInt();
			}
		}
		
		//input matrix
		
		System.out.println("Input Matrix : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		rotate(arr);
		
		//output matrix
		
		System.out.println("Output Matrix : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<N;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void rotate(int [][] arr) {
		
		//transpose
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		//swapping
		
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr.length/2;i++) {
				int temp=arr[i][j];
				arr[i][j]=arr[arr.length-i-1][j];
				arr[arr.length-i-1][j]=temp;
				
			}
		}	
	}
}