package array2d;

import java.util.Scanner;

public class shipment {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter the of packages : ");
		int size=scn.nextInt();
		System.out.println("Enter the Weights of Packages : ");
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.print("Enter Number of Days : ");
		int d=scn.nextInt();
		System.out.print("Least Weight Capacity of Ship for a Day : ");
		System.out.println(shipment(arr,d));
	}
	
	public static int shipment(int[]arr,int d) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int low=max;
		int high=sum;
		while(low<high) {
			int mid=(low+high)/2;
			boolean shipmentpossible=shipmentpossible(arr,d,mid);
			if(shipmentpossible) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return low;
	}
	
	public static boolean shipmentpossible(int []arr,int d,int mid) {
	
		int day=1;
		int weights=0;
		for(int i=0; i<arr.length;i++) {
			weights=weights+arr[i];
			if(weights>mid) {
				day++;
				weights=arr[i];
			}
		}
		if(day<=d) {
			return true;
		}
		else {
			return false;
		}
	}
}