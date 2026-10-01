package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class q17 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		System.out.print("Enter the Size of the Array : ");
		int n=scn.nextInt();
		System.out.println("Enter the Elements of The Array : ");
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		System.out.print("Enter the Targrt Number : ");
		int target=scn.nextInt();
		tripletsum(arr,target);
	}
	
	public static void tripletsum(int[]arr,int target) {
		Arrays.sort(arr);
		for (int i=0;i<arr.length;i++) {
			int left =i+1;
			int right=arr.length-1;
			while(left<right) {
				if(arr[i]+arr[left]+arr[right]==target) {
					System.out.println(arr[i]+" "+arr[left]+" "+arr[right]);
					left++;
					right--;
				}
				else if (arr[i]+arr[left]+arr[right]>target) {
					right--;
				}
				else {
					left++;
				}
			}
		}
	}
}