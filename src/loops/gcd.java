package loops;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner (System.in);
		System.out.println("Divident number :");
		int divident=scn.nextInt();
		System.out.println("Divisor number :");
		int divisor=scn.nextInt();
		
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println("GCD is : "+divisor);
	}

}
