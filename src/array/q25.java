package array;

import java.util.Scanner;

public class q25 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("For Quadratic Equation ax^2+bx+c ");
		System.out.println("a : ");
		int a=scn.nextInt();
		System.out.println("b : ");
		int b=scn.nextInt();
		System.out.println("c : ");
		int c=scn.nextInt();
		int r1=0;
		int r2=0;
		System.out.println(a+"X^2+"+b+"Y"+"+"+c);
		
		int D=(b*b-4*a*c);
		if (D>0) {
			System.out.println("Roots are Real and Differnt");
		}
		else if(D==0) {
			System.out.println("Roots are Real and Equal");
		
		}
		else {
			System.out.println("Roots are Imaginary");
		}
		r1=(int)((-b-Math.sqrt(D))/(2*a));
		r2=(int)((-b+Math.sqrt(D))/(2*a));
		
		System.out.println("Roots of The Equation : "+r1+" and "+r2);

	}

}