package recursion;

import java.util.Scanner;

public class recursiondemo {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		recursion(n);
	}
	public static void recursion(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println("hello");
		recursion(n-1);
	}	
}