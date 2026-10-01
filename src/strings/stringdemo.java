package strings;

import java.util.Scanner;

public class stringdemo {

	public static void main(String[] args) {
		
		// hard core values
		String a="hello";
		System.out.println(a.length());
		
		//user defined
		//declaration
		Scanner scn=new Scanner(System.in);
		//String b=scn.next();
		//System.out.println(b);
		
		// to take input complete string
		String c=scn.nextLine();
		System.out.println(c);
		
		//find the char at any specific index
		System.out.println(c.charAt(1));
		
		//for set of char
		for(int i=0;i<c.length();i++) {
			System.out.println(c.charAt(i));
		}
		
		//substring of a string
		System.out.println(c.substring(0,4));
		
		// compare of two strings
		System.out.println(a.compareTo(c));
	}
}