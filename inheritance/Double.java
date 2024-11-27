package inheritance;

public class Double extends Single {
	void m2() {
		System.out.println("dog");
	}

	public static void main(String[] args) {
		Double b = new Double();
		b.m1();
		b.m2();
	}

}
