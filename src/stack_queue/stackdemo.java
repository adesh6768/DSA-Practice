package stack_queue;

import java.util.Stack;

public class stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<>() ;
		//st.pop();
		System.out.println(st.isEmpty());
		st.push(10);
		st.push(20);
		st.push(30);
		System.out.println(st);
		st.pop();
		st.size();
		System.out.println(st.size());
		System.out.println(st);
	}

}
