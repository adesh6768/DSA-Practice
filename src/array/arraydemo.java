package array;

import java.util.Scanner;

public class arraydemo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] arr=null;
		System.out.println(arr);
		
		// To Declare size of array
		
		arr=new int[5];
		
		// To get
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr.length);   // arr= name of array it can be changed
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//Assign
		
		arr[0]=20;
		arr[1]=30;
		arr[2]=40;
		arr[3]=50;
		arr[4]=65;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
