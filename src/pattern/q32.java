package pattern;

import java.util.Scanner;

public class q32 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		for(int row=1;row<=2*n-1;row++) {
			int value=row;
			for (int countstar=1;countstar<=star;countstar++) {
				if(countstar%2==0) {
					System.out.print("*"+"\t");
				}
				else {
					System.out.print(value+"\t");
				}
			}
			System.out.println();
			if(row<=n-1) {
				star=star+2;
				value++;
			}
			else {
				star=star-2;
				value--;
			}
		}
		
	}

}
