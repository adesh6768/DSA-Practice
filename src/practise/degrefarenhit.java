package practise;

import java.util.Scanner;

public class degrefarenhit {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int counter=0;
		while(counter<=100) {
			float c=(5*(counter-32)/9);
			System.out.println(counter+"/f"+"\t"+c+"/c");
			counter++;
		}

	}

}
