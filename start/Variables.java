package start;

public class Variables {

	public static void main(String[] args) {
		int a = 20;// 20 is an value which is assigned to variable a of datatype int
		System.out.println(a);
		float b = a; //implicit conversion
		System.out.println(b);
		float c = 23.78f;
		int d = (int)c; //explicit conversion
		System.out.println(c);
		System.out.println(d);
		char e = 'a';
		System.out.println(e);
		long $a = 25;
		System.out.println($a);
		short _a = 33; //we can start the variable name by $ and _ score only in characters 
		System.out.println(_a);
	}

}
