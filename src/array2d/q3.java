package array2d;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {		
		Scanner scn= new Scanner(System.in);		
		System.out.print(" The Size of Array : ");
		int size=scn.nextInt();
		int []arr=new int [size];
		//input
		System.out.println("Enter the Elements : ");
		for(int i=0;i<arr.length;i++) {
				arr[i]=scn.nextInt();
		}
		//function call and output
		System.out.print("The Maximum Circular Sub Array : ");
		System.out.print(circularmaxsum(arr));
	}
	
	public static int circularmaxsum(int[]arr) {
		// Total Sum
		int totalsum=0;
		for(int i=0;i<arr.length;i++) {
			totalsum=totalsum+arr[i];
		}
		//kadanes algorithm
		int minsum=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum<minsum) {
				minsum=sum;
			}
			else if(sum>0) {
				sum=0;
			}
		}
		int circularsum=totalsum-minsum;
		int maxsum=Integer.MIN_VALUE;
		int Sum1=0;
		for(int i=0;i<arr.length;i++) {
			Sum1=Sum1+arr[i];
			if(Sum1>maxsum) {
				maxsum=Sum1;
			}
			if(Sum1<0) {
				Sum1=0;
			}
		}
		if(maxsum>0) {
			return Math.max(maxsum, circularsum);
		}
		else {
			return maxsum;
		}
	}	
}