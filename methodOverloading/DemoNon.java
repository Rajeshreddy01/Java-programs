package methodOverloading;

public class DemoNon {
	public void m1(int i) {
		System.out.println("one arg");
	}
	public void m1(int i,int j) {
		System.out.println("two arg");
	}
	public void m1(int i,int j, int k) {
		System.out.println("three arg");
	}

	public static void main(String[] args) {
		DemoNon a= new DemoNon();
		a.m1(12);
		a.m1(12, 13);
		a.m1(12, 13, 14);
		}

}
