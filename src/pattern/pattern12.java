package pattern;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
		int row=1;
		int star=1;
		int space=2*n-3;
		while(row<=n){
			int countstar=1;
			while(countstar<=star) {
				System.out.print("*");
				countstar++;
			}
			int countspace=1;
			while(countspace<=space) {
				System.out.print(" ");
				countspace++;
			}
			int countstar1=1;
			if(row==n) {
				countstar1=2;
			}
			while(countstar1<=star) {
				System.out.print("*");
				countstar1++;
			}
			System.out.println();
			star++;
			space=space-2;
			row++;
		}
	}

}
