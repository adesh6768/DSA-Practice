package array;

import java.util.Scanner;

// By using the Concept of Linear Search

public class linearsearch {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		// size of array
		
		System.out.println("Number of Element : ");
		int n=scn.nextInt();
		int []arr=new int[n];
		
		// to get values from user
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
			
		}
		
		// checking index of variable
		
		System.out.println("Value : ");
		int value=scn.nextInt();
		int ans=linearsearch1(arr,value);
		System.out.println(ans);
	}
	public static int linearsearch1(int arr[],int value) {
		
		for(int i=0;i<arr.length;i++) {
			if(value==arr[i]) {
				System.out.println("Index is : "+i);
				return i;
			}
		
		}	
		
		return-1;
	}

}
