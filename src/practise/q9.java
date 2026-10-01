package practise;
import java.util.Scanner;
public class q9 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		boolean incresing=false;
		boolean print=true;// decreasing=print
		int N=scn.nextInt();
		int previous=scn.nextInt();
		int counter=1;
		while(counter<=N-1) {
			int current=scn.nextInt();
			int diff=current-previous;
			if(diff==0) {
				print=false;
			}
			else if(diff>0) {
				incresing=true;
			}
			else if(diff<0&&incresing) {
				print=false;
			}
			previous=current;
			counter++;
		}
		System.out.println(print);
	}
}