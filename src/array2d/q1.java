package array2d;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner(System.in);
		
		System.out.print("Size of Array : ");
		int size=scn.nextInt();
		int []arr=new int [size];
		
		//input
		
		System.out.println("Enter the Elements : ");
		for(int i=0;i<arr.length;i++) {
				arr[i]=scn.nextInt();
		}
		
		dutchflag(arr);
		
		System.out.println("The Sorted Array is : ");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void dutchflag (int []arr) {
		
		int low=0;
		int high=arr.length-1;
		int mid =0;
		
		while(mid<=high) {
			
			if(arr[mid]==0) {
				int temp=arr[mid];
				arr[mid]=arr[low];
				arr[low]=temp;
				low++;
				mid++;
			}
			
			else if(arr[mid]==1) {
				
				mid++;
			}
			
			else if(arr[mid]==2) {
				
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
			}
		}
	}
}