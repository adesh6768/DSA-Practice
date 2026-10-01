package array2d;

import java.util.Scanner;

public class q4 {

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
		//output
		System.out.print("The Maximum Sum is : ");
		System.out.println(kadanealgo(arr));		
	}
	
	public static int kadanealgo(int[]arr) {
		
		int maxsum=Integer.MIN_VALUE;
		int sum=0;		
		for ( int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>maxsum) {
				maxsum=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}		
		return maxsum;
	}
}
