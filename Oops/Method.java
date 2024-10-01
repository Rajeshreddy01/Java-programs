package Oops;

public class Method {

	static int add(int x, int y) {
		int c = x + y;
		System.out.println("sum of x and y is "+c);
		return c;
	}
	public static void main(String[] args) {
		int a = 10, b = 12;
		add(a,b);
	}

}
