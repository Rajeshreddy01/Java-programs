package blocks;

public class B2 {
	{
		int j=10;
		System.out.println("non static block executed "+j);
	}
	static// static block
	{
		int i=12;
		System.out.println("static block executed "+i);
	}
	public B2() {
		System.out.println("constructor executed");
	}
	public void method() {
		System.out.println("normal method");
		{
			int mb= 13;
			System.out.println("block inside method : "+ mb);
		}
	}
	public static void main(String[] args) {
		System.out.println("main method");
		B2 a = new B2();
		a.method();
	}

}
