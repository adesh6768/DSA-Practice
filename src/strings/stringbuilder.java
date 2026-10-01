package strings;

public class stringbuilder {

	public static void main(String[] args) {
		
		String b="hello";
		StringBuilder a=new StringBuilder(b);
		
		//length of the string
		System.out.println(a.length());
		
		//to append
		a.append(1);
		System.out.println(a);
		
		// to insert
		a.insert(1,"h");
		System.out.println(a);
	}
}