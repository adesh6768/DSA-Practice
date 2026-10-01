package practise;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int counter=1;
		int t=0;
		while(counter<=10) {
			t=n*counter;
			System.out.println(t);
			counter++;
		}

	}

}
