package array;

import java.util.Scanner;

public class binarysearch {
	
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int[]arr= {11,22,33,44,55,66,77,88,99};
		int value=scn.nextInt();
		System.out.println(binarysearching(arr,value));
		
	}
	
	public static int binarysearching(int[] arr,int value) {
			
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<value) {
				low=mid+1;
			
			}
			else if (arr[mid]>value) {
				high=mid-1;
			
			}// if value is equal to the value of mid
			else if (arr[mid]==value) {
				return mid;
				
			}
			
		}
		return -1;		
		
	}

}
