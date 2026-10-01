package strings;

public class stringoperation {

	public static void main(String[] args) {
		
		Long start=System.currentTimeMillis();
		int n=100000;
		
		System.out.println(stringops(n));
		Long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	public static StringBuilder stringops (int n) {
		String a="";
		StringBuilder b=new StringBuilder(a);
		for(int  i=0;i<=n;i++) {
			b.append(i);
		}
		return b;
	}
}