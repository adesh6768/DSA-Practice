package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class validparenthesis {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		Stack<Character> st=new Stack<>();
		if (isvalid(s,st)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	public static boolean isvalid(String s,Stack<Character> st) {
		
		for(int i=0;i<s.length();i++) {
			char o=s.charAt(i);
			if(o=='(' || o=='{' || o=='[') {
				st.push(o);
			}
			else {
				if(st.isEmpty()) {
					return false;
				}
				char c=st.pop();
				if(o==')'&&c=='('||o=='}'&&c=='{'||o==']'&&c=='[') {
					continue;
				}
				else return false;
			}
		}
		return st.isEmpty();
	}
}