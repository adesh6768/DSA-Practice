package pattern;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner (System.in);
		int n=scn.nextInt();
		int row=1;
		int star=1;
		int space=n;
		
		while(row<=n) {
			int countspace=1;
			while(countspace<=space) {
				System.out.print(" ");
				countspace++;
			}
			int countstar=1;
			while(countstar<=star) {
				System.out.print("*");
				System.out.print(" ");
				countstar++;
			}
			System.out.println();
			space--;
			star++;
			row++;
			
		}
	}
}
			
		

	


