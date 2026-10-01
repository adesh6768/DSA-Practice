package pattern;

import java.util.Scanner;

public class pattern11 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int star=n-2;
		int space=0;
		if(n%2==0) {
			System.out.print("pattern is not for even number");
		}
		else {
			while(row<=n) {
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
				while(countstar1<=star) {
				System.out.print("*");
				countstar1++;
				}
				if(row<=n/2) {
					star--;
					space=space+2;
				}
				else {
					star++;
					space=space-2;
				}
				System.out.println();
				row++;
			
			}
		}

	}
}
