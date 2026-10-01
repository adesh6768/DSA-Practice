package practise;

import java.util.Scanner;

public class q28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int sum=0;
		while(sum>=0) {
			int n=scn.nextInt();
			sum=sum+n;
			if (sum<0) break;
			System.out.println(n);
		}

	}

}
