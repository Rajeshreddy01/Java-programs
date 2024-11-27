package inheritance;

class S{
	public S(int i) {
		System.out.println(i);
	}
}
class F extends S{
	public F() {
		super(10);
	}
}
public class I3 {

	public static void main(String[] args) {
		F d= new F();
	}

}
