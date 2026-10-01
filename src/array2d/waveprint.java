package array2d;

import java.util.Scanner;

public class waveprint {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int [][]arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
		wave(arr);
	}
	public static void wave(int[][]arr) {
		for(int row=0;row<arr.length;row++) {
			
		}
	}
}
