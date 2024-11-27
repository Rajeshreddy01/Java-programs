package constructor;

public class C4 {
	int i;
	public C4() {
		i=10;
	}
	public C4(int i) {
		this.i = i;
	}
	public static void main(String[] args) {
		C4 c4 = new C4(11);
		C4 c4a = new C4();
		System.out.println(c4a.i);
		System.out.println(c4.i);
	}

}
