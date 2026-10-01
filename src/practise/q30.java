package practise;

import java.util.Scanner;

public class q30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int star=1;
		int value=1;
		for(int row=1;row<=n;row++) {
			
			for(int countstar=1;countstar<=star;countstar++) {
				
				if(countstar==1||countstar==star) {
					System.out.print(value);
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
			if(row==1) {
				value=1;
			}
			else {
				value++;
			}
			star++;
		}

	}

}
