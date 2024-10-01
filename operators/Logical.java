package operators;

public class Logical {

	public static void main(String[] args) {
		int a =10;
		int b =11;
		boolean c = a<b && b>a;//
		boolean d = a<b || b<a;
		boolean e = a!=b;
		System.out.println(c);//true
		System.out.println(d);//true
		System.out.println(e);//true
	}

}
