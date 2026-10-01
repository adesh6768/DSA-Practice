package array2d;

import java.util.Scanner;

public class q14 {

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
		
		countsort(arr);

	}
	
	public static void countsort(int[]arr) {
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}	
		}
		
		//count array
		
		int range=max+1;
		int[]count=new int[range];
		
		for(int i=0;i<arr.length;i++) {
			int index=arr[i];
			count [index]++;
		}	
		
		//cumulative addition
		
		for(int i=1;i<count.length;i++) {
			count[i]=count[i]+count[i-1];
		}
		
		//sorted array
		
		int[]output=new int[arr.length];
		for(int i =arr.length-1;i>=0;i--) {
			int index=count[arr[i]]-1;
			output[index]=arr[i];
			count[arr[i]]=count[arr[i]]-1;
		}
		
		//output
		for(int i=0;i<arr.length;i++) {
			System.out.println(output[i]);
		}
	}	
}