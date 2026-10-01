package array;

import java.util.Scanner;

public class arraydemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int [] arr=new int [n];
		
		//arr[0]=20;
		//arr[1]=30;
		//arr[2]=40;
		//arr[3]=50;
		//arr[4]=65;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr);
		}
	}

}
