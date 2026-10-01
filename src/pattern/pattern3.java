package pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		int row=1;
		int star=n;
		while (row<=n) {
			int countstar=1;
			while(countstar<=star) {
				System.out.print("*");
				countstar++;
			}
			System.out.println();
			row++;
			star--;
		}
	}

}
