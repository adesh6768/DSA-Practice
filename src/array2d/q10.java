package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("Number of Stalls : ");
		int N=scn.nextInt();
		int []arr=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.print("Number of Cows : ");
		int c=scn.nextInt();
		System.out.println(aggresivecows(arr,c));
	}
	public static int aggresivecows(int[]arr,int c) {
		Arrays.sort(arr);
		int low=1;
		int high=arr[arr.length-1]-arr[0];
		while(low<=high) {
			int mid=(low-high)/2;
			boolean cowplacementpossible=cowplacementpossible(arr,mid,c);
			if(cowplacementpossible) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return high;
	}
	public static boolean cowplacementpossible(int[]arr,int mid,int c) {
		int cows=1;
		int previouscow=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]-previouscow>=mid) {
				cows++;
				previouscow=arr[i];
			}
			if(cows>=c) {
				return true;
			}
		}
		return false;
	}
}