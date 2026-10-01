package array;

import java.util.Scanner;

public class minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scn=new Scanner(System.in);
		
		// size of array
		
		System.out.println("Number of variable");
		int n=scn.nextInt();
		int []arr=new int[n];
		
		// to get values from user
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			
		}
		
		int min=Integer.MAX_VALUE;
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		
		System.out.println("Minimum Number is "+min);
		
	}

}
