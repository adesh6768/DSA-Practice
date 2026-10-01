package loops;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int star=2*n+1;
		int space=0;
		int value=n;
		
		while(row<=2*n+1) {
			if(row<=n+1) {
				value=n-row+1;
			}
			else {
				value=row-n-1;
			}
			int countspace=1;
			while(countspace<=space) {
				System.out.print(" "+"\t");
				countspace++;
			}
			int countstar=1;
			while(countstar<=star) {
				System.out.print(value+"\t");
				if(countstar<=star/2) {
					value--;
				}
				else {
					value++;
				}
				countstar++;
			}
			System.out.println();
			if(row<=n) {
				star=star-2;
				space++;
			}
			else {
				star=star+2;
				space--;
			}
			
			row++;

		}
	}

}
