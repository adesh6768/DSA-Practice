package array2d;

import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Number of Student : ");
		int m=scn.nextInt();
		System.out.print("Number of Books : ");
		int n=scn.nextInt();
		int[]arr=new int [n];
		System.out.println("Number of Pages of Book in Ascending Order : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.println(bookallocation(arr,m));
	}
	
	public static int bookallocation(int[]arr,int m) {
		
		int low=arr[arr.length-1];
		int totalpage=0;
		for(int i=0;i<arr.length;i++) {
			totalpage=totalpage+arr[i];
		}
		int high=totalpage;
		
		while(low<=high) {
			int mid=(low+high)/2;
			boolean allotmentpossible=allotmentpossible(arr,m,mid);
			if(allotmentpossible) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return low;
	}
	
	public static boolean allotmentpossible(int[]arr,int m,int mid) {
		
		int student=1;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>mid) {
				student++;
				sum=arr[i];
			}
			if (student>m) {
				return false;
			}
		}
		return true;
	}
}