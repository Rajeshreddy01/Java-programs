package methodOverloading;

public class Demo {
	public static void m1(int i) {
		System.out.println(i+" "+"one arg");
	}
	public static void m1(int i,int j) {
		System.out.println(i+" "+j+"two args");
	}
	public static void m1(int i,int j, int k) {
		System.out.println(i+" "+j+" "+k+"three args");
	}
	public static void main(String[] args) {
		Demo.m1(12);
		Demo.m1(13, 14);
		Demo.m1(15, 16, 17);
	}

}
