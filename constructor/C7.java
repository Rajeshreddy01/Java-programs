package constructor;

public class C7 {
	public void C7() {
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		C7 a = new C7();
		a.C7();
	}

}
