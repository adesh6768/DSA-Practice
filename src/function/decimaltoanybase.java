package function;

import java.util.Scanner;

public class decimaltoanybase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int base=scn.nextInt();
		int ans=conversion(n,base);
		System.out.println(ans);
	}
	public static int conversion(int n,int base) {
		int multiplier=1;
		int ans=0;
		while(n!=0) {
			int rem=n%10;
			ans=ans+rem*multiplier;
			multiplier=multiplier*base;
			 int qua=n/10;
			 n=qua;
		}
		return ans;
	}
}
