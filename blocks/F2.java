package blocks;

public class F2 {
	int i;
	public F2(int i) {
		this.i=i;
		System.out.println("constructor : "+i);
	}
	public static void main(String[] args) {
		final int i=10;
		System.out.println(i);
		F2 f = new F2(10);
	}

}
