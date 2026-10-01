package function;

import java.util.Scanner;

public class anybasetoanybase {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Base 1");
		int base1=scn.nextInt();
		System.out.println("Number");
		int n=scn.nextInt();
		System.out.println("Base 2");
		int base2=scn.nextInt();
		int ans=conversion(n,base2,base1);
		System.out.println(ans);
	}
	public static int conversion(int n,int base2,int base1) {
		int multiplier=1;
		int ans=0;
		while(n!=0) {
			int rem=n%base1;
			ans=ans+rem*multiplier;
			multiplier=multiplier*base2;
			 int qua=n/base1;
			 n=qua;
		}
		return ans;
	}
}
