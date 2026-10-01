package pattern;

import java.util.Scanner;

public class patt12for {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int space=2*n-3;
		for(int row=1;row<=n;row++) {
			for(int countstar=1; countstar<=star;countstar++) {
				System.out.print("*");
			}
			for(int countspace=1;countspace<=space;countspace++) {
				System.out.print(" ");
			}
			int countstar1=1;
			if(row==n){
				countstar1=2;
			}
			for(;countstar1<=star;countstar1++) {
				System.out.print("*");
			}
			System.out.println();
			star++;
			space=space-2;
		}
	}
}