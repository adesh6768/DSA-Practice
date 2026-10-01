package array2d;

import java.util.Scanner;

public class q2 {
//Formation of biggest Number From n Numbers
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//size
		System.out.print("Size of Array : ");
		int size=scn.nextInt();
		String []arr=new String [size];
		//input
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.next();
		}
		formlargestno(arr);
		//output
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void formlargestno(String [] arr) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if((arr[j]+arr[i]).compareTo(arr[i]+arr[j]) >0){
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}