package practise;

import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=n-1;
		int star2=1;
		int row=1;
		while(row<=n) {
			int value=0;
			int countvalue=1;
			while(countvalue<=star2) {
				value=value+1;
				System.out.print(value);
				countvalue++;
			}
			int countstar=1;
			while(countstar<=star) {
				System.out.print("*");
				countstar++;
			}
			System.out.println();
			star--;
			star2++;
			row++;
		}
		
	}

}
