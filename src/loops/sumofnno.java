package loops;

import java.util.Scanner;

public class sumofnno {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n= scn.nextInt();
		int counter=0;
		int sum=0;
		
		while(counter<=n) {
			
			sum=sum+counter;
			counter++;
			
		}
		System.out.println("sum is"+sum);
	}

}
