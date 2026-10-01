package pattern;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter your age :");
		int a=scn.nextInt();
		
		if(a<=10) {
		System.out.println("you are children");	
		
		}
		else if(a<=18){
			System.out.println("you are teenager");
		}
		else if(a<=56) {
			System.out.println("you are adult");
		}
		else {
			System.out.println("you are old");
		}
	}

}
