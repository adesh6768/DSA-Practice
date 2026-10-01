package pattern;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		int noofrow=2*n-1;
		
		while(row<=noofrow) {
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
			if(row<=n-1) {
				space--;
			}
			else {
				space++;
			}
			if (row<=n-1) {
				star++;
			}
			else {
				star--;
			}
			System.out.println();
			countspace--;
			countstar++;
			row++;
		}
		

	}

}
