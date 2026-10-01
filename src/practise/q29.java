package practise;

import java.util.Scanner;

public class q29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);// binary to decimal
		int N=scn.nextInt();
		int counter=1;
		while(counter<=N) {
			int n=scn.nextInt();
			int mul=1;
			int ans=0;
			while(n!=0) {
				int rem=n%10;
				ans=ans+rem*mul;
				n=n/10;
				mul=mul*2;
			}
			System.out.println(ans);
			counter++;
		}
		
	}

}
