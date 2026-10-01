package pattern;

import java.util.Scanner;

public class patt13 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int value=1;
		int space=n-1;
		for(int row=1;row<=n;row++) {
			for(int countspace=1;countspace<=space;countspace++) {
				System.out.print("\t");
			}
			for(int countstar=1;countstar<=star;countstar++) {
				System.out.print(value+"\t");
				value++;
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}

}
