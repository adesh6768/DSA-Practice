package array;

import java.util.Scanner;

public class selectionsort {
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
		for(int counter=0;counter<arr.length;counter++) {
			int min=counter;
			for(int i=counter+1;i<arr.length;i++) {
				if(arr[min]>arr[i]) {
					min=i;
				}
			}
			int temp=arr[min];
			arr[min]=arr[counter];
			arr[counter]=temp;
		}
	}
}