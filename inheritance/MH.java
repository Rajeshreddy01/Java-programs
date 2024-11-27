package inheritance;
class QA {
	static void m1() {
		System.out.println("parent class static method");
	}
}
class QZ extends QA{
	static void m1() {
		System.out.println("child class static method");
	}
}
public class MH {

	public static void main(String[] args) {
		QA b = new QA();
		b.m1();
		QZ a= new QZ();
		a.m1();
	}

}
