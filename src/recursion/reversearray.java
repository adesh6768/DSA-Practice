// code for reverse array by recursion
package recursion;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Size of Array : ");
		int n=scn.nextInt();
		System.out.println("Enter the Element : ");
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int i=0;
		function(i,arr);
		for(int j=0;j<arr.length;j++) {
			System.out.print(" ["+arr[j]+"] ");
		}
	}
	public static void function(int i,int[]arr) {
		
		if(i>=arr.length/2) 
			return ;
		int temp=arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
		function(i+1,arr);
	}	
}