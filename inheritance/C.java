package inheritance;

public class C extends B{
	void m3() {
		System.out.println("C is extending from B : Puppy");
	}
	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}

}
