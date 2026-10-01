package recursion;

import java.util.Scanner;

public class backtracking {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		function(n);
	}
	public static void function(int n) {
		
		if(n==0) {
			return;
		}
		function(n-1);
		System.out.println("hello");
	}
}