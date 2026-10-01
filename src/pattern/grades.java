package pattern;

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter your marks");
		int a=scn.nextInt();
		
		if(a>=80) {
		System.out.println("O grade");
		}
		else if(a>=70&&a<=79) {
		System.out.println("A grade");
		}
		else if(a>=60&&a<=69) {
		System.out.println("B grade");
		}
		else if(a>=50&&a<=59) {
		System.out.println("C grade");
		}
		else if(a>=40&&a<=49) {
		System.out.println("P grade");
		}
		else {
		System.out.println("Fail");
		}
	}

}
