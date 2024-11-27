package inheritance;
class QW{
	public final void m1() {
		System.out.println("parent class final method");
	}
}
class QE extends QW{
	public final void m2() {
		
	}
}
public class FM {

	public static void main(String[] args) {
		QE q = new QE();
		q.m1();
	}

}
