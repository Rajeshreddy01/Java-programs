package typeCasting;

public class Narrowing {

	public static void main(String[] args) {
		double a = 10.24;
		int e = (int)a;// In narrowing we need to change the higher to lower data
		System.out.println(e);// types explicitly
		float f = 1234;
		System.out.println(f);
		byte b = (byte)f;
		System.out.println(b);
	}

}
