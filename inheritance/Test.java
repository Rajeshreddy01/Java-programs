package inheritance;

class D{
	int i;
	void m1() {
		System.out.println("Data :"+i);
	}
}
class E extends D{
	int j;
	void m2() {
		System.out.println("Data :"+j);
	}
}
public class Test {

	public static void main(String[] args) {
		E b= new E();
		b.m1();
		b.m2();
	}

}
