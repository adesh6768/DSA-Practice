package recursion;

import java.util.Scanner;

public class sumofnnosback {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int sum=0;
		System.out.println(function(n,sum));
	}
	public static int function(int n,int sum) {
		
		if(n==0) {
			return sum;
		}
		sum=sum+n;
		return(function(n-1,sum));
	}
}