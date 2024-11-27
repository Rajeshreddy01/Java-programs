package typeCasting;
class one{
	void m1() {
		System.out.println("parent class method");
	}
}
class two extends one{
	void m1() {
		System.out.println("child class method");
	}
}
public class UpCasting {

	public static void main(String[] args) {
		 one o = new two();
		 o.m1();
		 two q = new two();
		 q.m1();
		 }

}
