package array2d;

import java.util.Scanner;

public class spiralprint {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int [][]arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	spiral(arr);
	}
	public static void spiral(int[][]arr) {
		int top=0;// starting of array
		int bottom=arr.length-1;// height of the array
		int left=0;// starting of the array
		int right=arr.length-1;// length of the array
		int ele=(bottom+1)*(right+1);// total elements of the array
		int dir=1;// initialization of direction
		while(top<=bottom&&left<=right) {
			if(ele>0) {
				if(dir==1) {
					for(int i=left;i<=right;i++) {
						System.out.print("["+arr[top][i]+"]");
						ele--;
					}
				}
				top++;
				dir=2;
			}
			if(ele>0) {
				if(dir==2) {
					for(int i=top;i<=bottom;i++) {
						System.out.print("["+arr[i][right]+"]");
						ele--;
					}
				}
				right--;
				dir=3;
			}
			if(ele>0) {
				if(dir==3) {
					for(int i=right;i>=left;i--) {
						System.out.print("["+arr[bottom][i]+"]");
						ele--;
					}
				}
				bottom--;
				dir=4;
			}
			if(ele>0) {
				if(dir==4) {
					for(int i=bottom;i>=top;i--) {
						System.out.print("["+arr[i][left]+"]");
						ele--;
					}
				}
				left++;
				dir=1;
			}
		}
	}
}