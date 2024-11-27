package blocks;

public class Final {
	 int i=12;
	{
		final int i=10;
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		Final f = new Final();
		System.out.println(f.i);
	}

}
