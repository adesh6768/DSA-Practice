package pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int star=n;
		int space=0;
		while(row<=n) {
			int countspace=1;
			while(countspace<=space) {
				System.out.print(" ");
				countspace++;
			}
			int countstar=1;
			while(countstar<=star) {
				System.out.print("*");
				countstar++;
			}
			System.out.println();
			star--;
			space++;
			row++;
		}
	}

}
