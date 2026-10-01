package stack_queue;

import java.util.Stack;

public class minstack {
	
	Stack<Integer>st=new Stack<Integer>();
	int min=Integer.MAX_VALUE;

	void push(int value) {
		
		if(st.isEmpty()) {
			min=value;
			st.push(value);
		}
		
		else {
			if(value>min) {
				st.push(value);
			}
			
			else {
				st.push(2*value-min);
				min=value;
			}
		}
	}
	
	void pop() {
		if(st.isEmpty())return;
		int val=st.pop();
		
		if(val<min) {
			min=2*min-val;
		}
	}
	
	int getmin() {
		return min;
	}
	
	public static void main(String[] args) {
		minstack s=new minstack();
		s.push(1);
		s.push(5);
		s.push(3);
		System.out.println(s.getmin());
		s.pop();
		System.out.println(s.getmin());
	}	
}