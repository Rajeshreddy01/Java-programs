package inheritance;
class Q{
	static {
		System.out.println("static block of parent class");
	}
	{
		System.out.println("non static block of parent class");
	}
	public Q() {
		System.out.println("Constructor of parent class");
	}
}
class W extends Q{
	static {
	System.out.println("static block of child class");
}
{
	System.out.println("non static block of child class");
}
public W(){
	System.out.println("Constructor of child class");
}
}
public class Test1 {

	public static void main(String[] args) {
		W a = new W();
	}

}
