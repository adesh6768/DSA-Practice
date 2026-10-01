package recursion;

import java.util.Scanner;

public class fibonachi {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(function(n));
	}
	public static int function(int n) {
		if(n<=1) {
			return n;
		}
		int last=function(n-1);
		int slast=function(n-2);
		return last+slast;
	}
}