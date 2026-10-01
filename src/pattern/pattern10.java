package pattern;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int star=1;
		int space=2*n-2;
		int noofrow=2*n-1;
		
		while(row<=noofrow) {
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
			if(row<=n-1) {
				space=space-2;
		        star++;
		    }
			else {
				space=space+2;
				star--;
			}
			System.out.println();
			countspace--;
			countstar++;
			row++;
		}
	}

}
