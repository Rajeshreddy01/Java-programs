package constructor;

public class C3 {
	int a;
	int b;
	
	public C3(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		C3 c3 = new C3(12, 13);
		System.out.println(c3.a+c3.b);
	}

}
