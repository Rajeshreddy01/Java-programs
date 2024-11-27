package typeCasting;
class three{
	static void m1() {
		System.out.println("parent class method");
	}
}
class four extends three{
	static void m1() {
		System.out.println("child class method class four");
	}
}
class five extends four{
	static void m1(){
		System.out.println("child class method of five class");
	}
}
public class UC1 {

	public static void main(String[] args) {
		three a = new four();
		a.m1();
		three c = new five();
		c.m1();
		four s = new five();
		s.m1();
		five w = new five();
		w.m1();
	}

}
