package constructor;

public class C5 {
	static int count;
	public C5() {
		count++;
	}

	public static void main(String[] args) {
		C5 c = new C5();
		C5 d = new C5();
		System.out.println(count);
	}

}
