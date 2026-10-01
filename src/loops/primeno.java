package loops;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n==0||n==1) {
			System.out.println("Not Prime Number");
		}
		else {
		int counter=2;
		boolean flag=true;
		while(counter<=n-1) {
			if(n%counter==0) {
				flag=false;
			}
			counter++;
		}
		if(flag==true) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
}
}
