package practise;

import java.util.Scanner;

public class q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int num=n;
		int digit=0;// digit counting
		int ans=0;
		
		while(num!=0) {
			digit++;
			num=num/10;
		}
		
		num=n;
		while(num!=0) {
			int rem=num%10;
			ans=(int)(ans+Math.pow(rem,digit));
			num=num/10;
		}
		
		if(ans==n) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not armstrong number");
		}			

	}

}
