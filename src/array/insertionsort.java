package array;

import java.util.Scanner;

public class insertionsort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Size of Array : ");
		int size=scn.nextInt();
		int []arr=new int[size];
		// input
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		sorting(arr);
		//output
		System.out.println("The Sorted Array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void sorting (int []arr) {	
		for(int counter=1;counter<arr.length;counter++) {
			int value=arr[counter];
			int i= counter-1;
			while(arr[i]>value&&arr[i]>value) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=value;
		}
	}
}
