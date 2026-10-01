package function;

import java.util.Scanner;

public class addition {//block scope=variable is valid for block

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		{
			int a=20;
			int b=10;
			int c=a+b;
			System.out.println(c);
			}
		{
			int a=40;
			int b=10;
			int c=a+b;
			System.out.println(c);
			}
		{
			int a=50;
			int b=10;
			int c=a+b;
			System.out.println(c);
			}
		{
			int a=20;
			int b=90;
			int c=a+b;
			System.out.println(c);
			}
		
	}

}
