package function;

public class localvariablescope {

	public static void main(String[] args) {
		//local variable scope
		int a=10;
		int b=20;
		int c=addition(a,b);
		System.out.println(c);
	}
	public static int addition(int one,int two) {
		int c=one+two;
		return c;
	}
}
