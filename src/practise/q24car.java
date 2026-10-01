package practise;

import java.util.Scanner;

public class q24car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner (System.in);
		int N=scn.nextInt();
		int counter=1;
		
		while(counter<=N) {
			int n=scn.nextInt();
			int evensum=0;
			int oddsum=0;
			
			while(n!=0) {
				int rem=n%10;
				if(rem%2==0) {
					evensum=evensum+rem;
				}
				else {
					oddsum=oddsum+rem;
				}
				n=n/10;
			}
			if(evensum%4==0||oddsum%3==0) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}		
			System.out.println();
			counter++;
		}

	}

}
