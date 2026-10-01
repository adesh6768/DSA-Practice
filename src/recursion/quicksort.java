package recursion;

import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size=scn.nextInt();
		
		System.out.println("Enter the Elements of Array : ");
		int[]arr= new int [size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int low=0;
		int high=arr.length-1;
		
		System.out.println("The Sorted Element by Quick Sort Method : ");
		function(arr,high,low);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void function (int []arr,int high,int low) {
		
		if(low>=high) {
			return;
		}
		
		int division=division(arr,high,low);
		function(arr,low,division-1);
		function(arr,high,division+1);
	}
	
	public static int division(int[]arr,int high,int low) {
		
		int pivot=arr[low];
		int i=low;
		int j=high;
		
		while(i<j) {
			while(arr[i]<=pivot && i<=high-1){
				i++;
			}
			
			while(arr[j]>pivot && j>=low+1) {
				j--;
			}
			
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		int temp=arr[j];
		arr[j]=arr[low];
		arr[low]=temp;
		return j;
	}
}