package array;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int size=scn.nextInt();
		int []arr= new int[size];
		// input
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		sorting(arr);
		//output
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}	
	}
	public static void sorting(int []arr) {
		for(int counter=0;counter< arr.length;counter++) {
			for(int i=0;i<arr.length-1-counter;i++) {
			
				if (arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	}	
}