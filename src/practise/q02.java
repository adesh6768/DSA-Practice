package practise;

import java.util.Scanner;

public class q02 {

			public static void main(String[] args) {
				Scanner scn=new Scanner (System.in);
				int n=scn.nextInt();
				if( n==0||n==1||n==2) {
				   System.out.println("not exist");
				}
				
				else if (n%2!=0) {
					System.out.print((n*n-1)/2+" "+(n*n+1)/2);
					
				}
				else {
					System.out.println(((n*n)/4)-1+" "+(((n*n)/4)+1));
				
				
			}
	}

}
