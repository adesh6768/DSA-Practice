package function;

public class globalvariablescope {
	
	public static int val=100;
	
	public static void main(String[] args) {
		//global variable
		System.out.println(val);
		int val=10;
		System.out.println(val);
		int a=90;
		int c=addition(a,val);
		System.out.println(c);
	}
	public static int addition(int a,int one) {
	int c=a+val;
	return c;
	}
}
