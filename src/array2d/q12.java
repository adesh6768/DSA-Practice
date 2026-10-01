package array2d;

import java.util.Scanner;

public class q12 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.print("Size of Array : ");
		
		int size=scn.nextInt();
		int []arr=new int [size];
		
		//input
		
		System.out.println("Enter the Elements : ");
		for(int i=0;i<arr.length;i++) {
				arr[i]=scn.nextInt();
		}
		
		System.out.print("Element To be Search : ");
		
		int key=scn.nextInt();
		
		System.out.print("Index of Key : "+search(arr,key));
			
	}
	
	public static int search(int[]arr,int key) {
		
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
		
			if(arr[mid]==key) {
				return mid;	
			}
			
			else if(arr[mid]<=arr[high]) {
				if(key>arr[mid]&&key<=arr[high]) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}	
			}
			
			else if(arr[low]<=arr[mid]) {
				
				if(key>=arr[low]&&key<=arr[mid]) {
					high=mid-1;
				}
				
				else {
					low=mid+1;
				}
			}	
		}
		
		return -1;
		
	}	
}