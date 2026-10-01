package array2d;

import java.util.Scanner;

public class comparison {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String a="54";
		String b="546"; 
		System.out.println(a+b);
		System.out.println(b+a);
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));
		System.out.println((a+b).compareTo(b+a));
		System.out.println((b+a).compareTo(a+b));
		
	}
}