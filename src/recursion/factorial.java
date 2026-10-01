package recursion;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=1;
		System.out.println(f(n,ans));
	}
	public static int f(int n,int ans) {
		
		if(n==0) {
			return ans;
		}
		ans=ans*n;
		return f(n-1,ans);
	}
}