package practise;

import java.util.Scanner;

public class q14 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=scn.nextInt();
		
		System.out.println("Enter the digit :");
		int digit=scn.nextInt();
		
		int rem=0;
		int count=0;
		int qua=0;
		
		for(int counter=1;num>0;counter++) {
			qua=num/10;
			rem=num%10;
			num=qua;
			if(rem==digit) {
				count++;
			}
			
		}
		System.out.println(digit+" is repeated "+count+" times");
	}

}
