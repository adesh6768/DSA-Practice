package array;

import java.util.Scanner;

public class lowerbound {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[]arr= {1,1,2,2,2,3,3,3,3,4,4,7};
		int value=scn.nextInt();
		System.out.println(lowerboundsearch(arr,value));
	}
	public static int lowerboundsearch(int []arr,int value) {
		int low=0;
		int high=arr.length-1;
		int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]<value) {
				low=mid+1;
			}
			else if(arr[mid]>value) {
				high=mid-1;
			}
			else if(arr[mid]==value) {
				high=mid-1;
				ans=mid;
			}
		}
		return ans;
	}	
}