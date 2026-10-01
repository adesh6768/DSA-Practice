package recursion;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String a=scn.nextLine();
		int i=0;
		System.out.println(function(a,i));
	}
	public static boolean function(String a,int i) {
		
		if(i>=a.length()/2) {
			return true;
		}
		if(a.charAt(i) !=a.charAt(a.length()-i-1)) {
			return false;
		}
		return function(a,i+1);
	}
}